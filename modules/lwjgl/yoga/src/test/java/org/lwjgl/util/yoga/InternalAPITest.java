/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.yoga;

import org.testng.annotations.*;

import static org.lwjgl.util.yoga.Yoga.*;
import static org.testng.Assert.*;

@Test
public class InternalAPITest {

    public void testYGStyle() {
        long node = YGNodeNew();

        YGStyle style = YGNode.create(node).style();

        float MAGICF = 12345678.9f;

        YGNodeStyleSetFlex(node, MAGICF);
        assertEquals(style.flex().value(), MAGICF);
        YGNodeStyleSetFlex(node, 0.0f);
        assertEquals(style.flex().value(), 0.0f);

        YGNodeStyleSetFlexGrow(node, MAGICF);
        assertEquals(style.flexGrow().value(), MAGICF);
        YGNodeStyleSetFlexGrow(node, 0.0f);
        assertEquals(style.flexGrow().value(), 0.0f);

        YGNodeStyleSetFlexShrink(node, MAGICF);
        assertEquals(style.flexShrink().value(), MAGICF);
        YGNodeStyleSetFlexShrink(node, 0.0f);
        assertEquals(style.flexShrink().value(), 0.0f);

        YGNodeStyleSetFlexBasis(node, MAGICF);
        assertEquals(decode(style.flexBasis()), MAGICF);
        YGNodeStyleSetFlexBasis(node, 0.0f);
        assertEquals(decode(style.flexBasis()), 0.0f);

        for (int i = 0; i <= YGEdgeAll; i++) {
            YGNodeStyleSetMargin(node, i, MAGICF);
            assertEquals(decode(style.margin(i)), MAGICF);
            YGNodeStyleSetMargin(node, i, 0.0f);
            assertEquals(decode(style.margin(i)), 0.0f);

            YGNodeStyleSetPosition(node, i, MAGICF);
            assertEquals(decode(style.positions(i)), MAGICF);
            YGNodeStyleSetPosition(node, i, 0.0f);
            assertEquals(decode(style.positions(i)), 0.0f);

            YGNodeStyleSetPadding(node, i, MAGICF);
            assertEquals(decode(style.padding(i)), MAGICF);
            YGNodeStyleSetPadding(node, i, 0.0f);
            assertEquals(decode(style.padding(i)), 0.0f);

            YGNodeStyleSetBorder(node, i, MAGICF);
            assertEquals(decode(style.border(i)), MAGICF);
            YGNodeStyleSetBorder(node, i, 0.0f);
            assertEquals(decode(style.border(i)), 0.0f);
        }

        YGNodeStyleSetWidth(node, MAGICF);
        YGNodeStyleSetHeight(node, MAGICF);
        assertEquals(decode(style.dimensions(0)), MAGICF);
        assertEquals(decode(style.dimensions(1)), MAGICF);
        YGNodeStyleSetWidth(node, 0.0f);
        YGNodeStyleSetHeight(node, 0.0f);
        assertEquals(decode(style.dimensions(0)), 0.0f);
        assertEquals(decode(style.dimensions(1)), 0.0f);

        YGNodeStyleSetMinWidth(node, MAGICF);
        YGNodeStyleSetMinHeight(node, MAGICF);
        assertEquals(decode(style.minDimensions(0)), MAGICF);
        assertEquals(decode(style.minDimensions(1)), MAGICF);
        YGNodeStyleSetMinWidth(node, 0.0f);
        YGNodeStyleSetMinHeight(node, 0.0f);
        assertEquals(decode(style.minDimensions(0)), 0.0f);
        assertEquals(decode(style.minDimensions(1)), 0.0f);

        YGNodeStyleSetMaxWidth(node, MAGICF);
        YGNodeStyleSetMaxHeight(node, MAGICF);
        assertEquals(decode(style.maxDimensions(0)), MAGICF);
        assertEquals(decode(style.maxDimensions(1)), MAGICF);
        YGNodeStyleSetMaxWidth(node, 0.0f);
        YGNodeStyleSetMaxHeight(node, 0.0f);
        assertEquals(decode(style.maxDimensions(0)), 0.0f);
        assertEquals(decode(style.maxDimensions(1)), 0.0f);

        YGNodeStyleSetAspectRatio(node, MAGICF);
        assertEquals(style.aspectRatio().value(), MAGICF);
        YGNodeStyleSetAspectRatio(node, 0.0f);
        assertEquals(style.aspectRatio().value(), 0.0f);

        YGNodeFree(node);
    }

    public void testYGLayout() {
        long root = YGNodeNew();

        YGNodeStyleSetWidth(root, 1024.0f);
        YGNodeStyleSetHeight(root, 1024.0f);
        YGNodeStyleSetDirection(root, YGDirectionLTR);

        long node = YGNodeNew();

        YGNodeStyleSetPositionType(node, YGPositionTypeAbsolute);
        YGNodeStyleSetPosition(node, YGEdgeStart, 11.11f);
        YGNodeStyleSetPosition(node, YGEdgeTop, 22.22f);
        YGNodeStyleSetWidth(node, 123.45f);
        YGNodeStyleSetHeight(node, 567.89f);

        for (int i = 0; i <= YGEdgeAll; i++) {
            YGNodeStyleSetMargin(node, i, 4.4f * i);
            YGNodeStyleSetBorder(node, i, 3.3f * i);
            YGNodeStyleSetPadding(node, i, 2.2f * i);
        }

        YGNodeInsertChild(root, node, 0);
        YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGDirectionLTR);

        YGLayout layout = YGNode.create(node).layout();

        assertEquals(layout.positions(0), YGNodeLayoutGetLeft(node));
        assertEquals(layout.positions(1), YGNodeLayoutGetTop(node));
        assertEquals(layout.positions(2), YGNodeLayoutGetRight(node));
        assertEquals(layout.positions(3), YGNodeLayoutGetBottom(node));

        assertEquals(layout.dimensions(0), YGNodeLayoutGetWidth(node));
        assertEquals(layout.dimensions(1), YGNodeLayoutGetHeight(node));

        assertEquals(layout.margin(YGEdgeLeft), YGNodeLayoutGetMargin(node, YGEdgeLeft));
        assertEquals(layout.margin(YGEdgeTop), YGNodeLayoutGetMargin(node, YGEdgeTop));
        assertEquals(layout.margin(YGEdgeRight), YGNodeLayoutGetMargin(node, YGEdgeRight));
        assertEquals(layout.margin(YGEdgeBottom), YGNodeLayoutGetMargin(node, YGEdgeBottom));

        assertEquals(layout.border(YGEdgeLeft), YGNodeLayoutGetBorder(node, YGEdgeLeft));
        assertEquals(layout.border(YGEdgeTop), YGNodeLayoutGetBorder(node, YGEdgeTop));
        assertEquals(layout.border(YGEdgeRight), YGNodeLayoutGetBorder(node, YGEdgeRight));
        assertEquals(layout.border(YGEdgeBottom), YGNodeLayoutGetBorder(node, YGEdgeBottom));

        assertEquals(layout.padding(YGEdgeLeft), YGNodeLayoutGetPadding(node, YGEdgeLeft));
        assertEquals(layout.padding(YGEdgeTop), YGNodeLayoutGetPadding(node, YGEdgeTop));
        assertEquals(layout.padding(YGEdgeRight), YGNodeLayoutGetPadding(node, YGEdgeRight));
        assertEquals(layout.padding(YGEdgeBottom), YGNodeLayoutGetPadding(node, YGEdgeBottom));

        YGNodeFree(node);
        YGNodeFree(root);
    }

    private static final int BIAS        = 0x20000000;
    private static final int PERCENT_BIT = 0x40000000;

    private static final int AUTO_BITS         = 0x7faaaaaa;
    private static final int ZERO_BITS_POINT   = 0x7f8f0f0f;
    private static final int ZERO_BITS_PERCENT = 0x7f80f0f0;

    private static float decode(CompactValue value) {
        int repr = value.repr();

        switch (repr) {
            case AUTO_BITS:
                return Float.NaN;
            case ZERO_BITS_POINT:
            case ZERO_BITS_PERCENT:
                return 0.0f;
        }

        if (Float.isNaN(value.value())) {
            return Float.NaN;
        }

        repr &= ~PERCENT_BIT;
        repr += BIAS;

        return Float.intBitsToFloat(repr);
    }

}
