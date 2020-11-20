/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code m_PrimaryColor} &ndash; Primary color is applied as a tint to (i.e. multiplied with) the model's texture.</li>
 * <li>{@code m_flVignetteInnerRadius} &ndash; Vignette radius is in meters and is used to fade to the specified secondary solid color over that 3D distance from the origin of the playspace.</li>
 * <li>{@code m_flFresnelStrength} &ndash; 
 * Fades to the secondary color based on view incidence.
 * 
 * <p>This variable controls the linearity of the effect. It is mutually exclusive with vignette. Additionally, it treats the mesh as faceted.</p></li>
 * <li>{@code m_bBackfaceCulling} &ndash; Controls backface culling.</li>
 * <li>{@code m_bGreyscale} &ndash; 
 * Converts the render model's texture to luma and applies to rgb equally.
 * 
 * <p>This is useful to combat compression artifacts that can occur on desaturated source material.</p></li>
 * <li>{@code m_bWireframe} &ndash; Renders mesh as a wireframe.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct Compositor_StageRenderSettings {
 *     {@link HmdColor HmdColor_t} m_PrimaryColor;
 *     {@link HmdColor HmdColor_t} m_SecondaryColor;
 *     float m_flVignetteInnerRadius;
 *     float m_flVignetteOuterRadius;
 *     float m_flFresnelStrength;
 *     bool m_bBackfaceCulling;
 *     bool m_bGreyscale;
 *     bool m_bWireframe;
 * }</code></pre>
 */
@NativeType("struct Compositor_StageRenderSettings")
public class CompositorStageRenderSettings extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_PRIMARYCOLOR,
        M_SECONDARYCOLOR,
        M_FLVIGNETTEINNERRADIUS,
        M_FLVIGNETTEOUTERRADIUS,
        M_FLFRESNELSTRENGTH,
        M_BBACKFACECULLING,
        M_BGREYSCALE,
        M_BWIREFRAME;

    static {
        Layout layout = __struct(
            __member(HmdColor.SIZEOF, HmdColor.ALIGNOF),
            __member(HmdColor.SIZEOF, HmdColor.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_PRIMARYCOLOR = layout.offsetof(0);
        M_SECONDARYCOLOR = layout.offsetof(1);
        M_FLVIGNETTEINNERRADIUS = layout.offsetof(2);
        M_FLVIGNETTEOUTERRADIUS = layout.offsetof(3);
        M_FLFRESNELSTRENGTH = layout.offsetof(4);
        M_BBACKFACECULLING = layout.offsetof(5);
        M_BGREYSCALE = layout.offsetof(6);
        M_BWIREFRAME = layout.offsetof(7);
    }

    /**
     * Creates a {@code CompositorStageRenderSettings} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CompositorStageRenderSettings(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdColor} view of the {@code m_PrimaryColor} field. */
    @NativeType("HmdColor_t")
    public HmdColor m_PrimaryColor() { return nm_PrimaryColor(address()); }
    /** Returns a {@link HmdColor} view of the {@code m_SecondaryColor} field. */
    @NativeType("HmdColor_t")
    public HmdColor m_SecondaryColor() { return nm_SecondaryColor(address()); }
    /** Returns the value of the {@code m_flVignetteInnerRadius} field. */
    public float m_flVignetteInnerRadius() { return nm_flVignetteInnerRadius(address()); }
    /** Returns the value of the {@code m_flVignetteOuterRadius} field. */
    public float m_flVignetteOuterRadius() { return nm_flVignetteOuterRadius(address()); }
    /** Returns the value of the {@code m_flFresnelStrength} field. */
    public float m_flFresnelStrength() { return nm_flFresnelStrength(address()); }
    /** Returns the value of the {@code m_bBackfaceCulling} field. */
    @NativeType("bool")
    public boolean m_bBackfaceCulling() { return nm_bBackfaceCulling(address()); }
    /** Returns the value of the {@code m_bGreyscale} field. */
    @NativeType("bool")
    public boolean m_bGreyscale() { return nm_bGreyscale(address()); }
    /** Returns the value of the {@code m_bWireframe} field. */
    @NativeType("bool")
    public boolean m_bWireframe() { return nm_bWireframe(address()); }

    /** Copies the specified {@link HmdColor} to the {@code m_PrimaryColor} field. */
    public CompositorStageRenderSettings m_PrimaryColor(@NativeType("HmdColor_t") HmdColor value) { nm_PrimaryColor(address(), value); return this; }
    /** Passes the {@code m_PrimaryColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CompositorStageRenderSettings m_PrimaryColor(java.util.function.Consumer<HmdColor> consumer) { consumer.accept(m_PrimaryColor()); return this; }
    /** Copies the specified {@link HmdColor} to the {@code m_SecondaryColor} field. */
    public CompositorStageRenderSettings m_SecondaryColor(@NativeType("HmdColor_t") HmdColor value) { nm_SecondaryColor(address(), value); return this; }
    /** Passes the {@code m_SecondaryColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CompositorStageRenderSettings m_SecondaryColor(java.util.function.Consumer<HmdColor> consumer) { consumer.accept(m_SecondaryColor()); return this; }
    /** Sets the specified value to the {@code m_flVignetteInnerRadius} field. */
    public CompositorStageRenderSettings m_flVignetteInnerRadius(float value) { nm_flVignetteInnerRadius(address(), value); return this; }
    /** Sets the specified value to the {@code m_flVignetteOuterRadius} field. */
    public CompositorStageRenderSettings m_flVignetteOuterRadius(float value) { nm_flVignetteOuterRadius(address(), value); return this; }
    /** Sets the specified value to the {@code m_flFresnelStrength} field. */
    public CompositorStageRenderSettings m_flFresnelStrength(float value) { nm_flFresnelStrength(address(), value); return this; }
    /** Sets the specified value to the {@code m_bBackfaceCulling} field. */
    public CompositorStageRenderSettings m_bBackfaceCulling(@NativeType("bool") boolean value) { nm_bBackfaceCulling(address(), value); return this; }
    /** Sets the specified value to the {@code m_bGreyscale} field. */
    public CompositorStageRenderSettings m_bGreyscale(@NativeType("bool") boolean value) { nm_bGreyscale(address(), value); return this; }
    /** Sets the specified value to the {@code m_bWireframe} field. */
    public CompositorStageRenderSettings m_bWireframe(@NativeType("bool") boolean value) { nm_bWireframe(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CompositorStageRenderSettings set(
        HmdColor m_PrimaryColor,
        HmdColor m_SecondaryColor,
        float m_flVignetteInnerRadius,
        float m_flVignetteOuterRadius,
        float m_flFresnelStrength,
        boolean m_bBackfaceCulling,
        boolean m_bGreyscale,
        boolean m_bWireframe
    ) {
        m_PrimaryColor(m_PrimaryColor);
        m_SecondaryColor(m_SecondaryColor);
        m_flVignetteInnerRadius(m_flVignetteInnerRadius);
        m_flVignetteOuterRadius(m_flVignetteOuterRadius);
        m_flFresnelStrength(m_flFresnelStrength);
        m_bBackfaceCulling(m_bBackfaceCulling);
        m_bGreyscale(m_bGreyscale);
        m_bWireframe(m_bWireframe);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CompositorStageRenderSettings set(CompositorStageRenderSettings src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CompositorStageRenderSettings} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CompositorStageRenderSettings malloc() {
        return wrap(CompositorStageRenderSettings.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CompositorStageRenderSettings} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CompositorStageRenderSettings calloc() {
        return wrap(CompositorStageRenderSettings.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CompositorStageRenderSettings} instance allocated with {@link BufferUtils}. */
    public static CompositorStageRenderSettings create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CompositorStageRenderSettings.class, memAddress(container), container);
    }

    /** Returns a new {@code CompositorStageRenderSettings} instance for the specified memory address. */
    public static CompositorStageRenderSettings create(long address) {
        return wrap(CompositorStageRenderSettings.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CompositorStageRenderSettings createSafe(long address) {
        return address == NULL ? null : wrap(CompositorStageRenderSettings.class, address);
    }

    /**
     * Returns a new {@link CompositorStageRenderSettings.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorStageRenderSettings.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CompositorStageRenderSettings.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorStageRenderSettings.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CompositorStageRenderSettings.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorStageRenderSettings.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CompositorStageRenderSettings.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CompositorStageRenderSettings.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CompositorStageRenderSettings.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CompositorStageRenderSettings} instance allocated on the thread-local {@link MemoryStack}. */
    public static CompositorStageRenderSettings mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CompositorStageRenderSettings} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CompositorStageRenderSettings callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CompositorStageRenderSettings} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CompositorStageRenderSettings mallocStack(MemoryStack stack) {
        return wrap(CompositorStageRenderSettings.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CompositorStageRenderSettings} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CompositorStageRenderSettings callocStack(MemoryStack stack) {
        return wrap(CompositorStageRenderSettings.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CompositorStageRenderSettings.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorStageRenderSettings.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CompositorStageRenderSettings.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorStageRenderSettings.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CompositorStageRenderSettings.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CompositorStageRenderSettings.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CompositorStageRenderSettings.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CompositorStageRenderSettings.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_PrimaryColor}. */
    public static HmdColor nm_PrimaryColor(long struct) { return HmdColor.create(struct + CompositorStageRenderSettings.M_PRIMARYCOLOR); }
    /** Unsafe version of {@link #m_SecondaryColor}. */
    public static HmdColor nm_SecondaryColor(long struct) { return HmdColor.create(struct + CompositorStageRenderSettings.M_SECONDARYCOLOR); }
    /** Unsafe version of {@link #m_flVignetteInnerRadius}. */
    public static float nm_flVignetteInnerRadius(long struct) { return UNSAFE.getFloat(null, struct + CompositorStageRenderSettings.M_FLVIGNETTEINNERRADIUS); }
    /** Unsafe version of {@link #m_flVignetteOuterRadius}. */
    public static float nm_flVignetteOuterRadius(long struct) { return UNSAFE.getFloat(null, struct + CompositorStageRenderSettings.M_FLVIGNETTEOUTERRADIUS); }
    /** Unsafe version of {@link #m_flFresnelStrength}. */
    public static float nm_flFresnelStrength(long struct) { return UNSAFE.getFloat(null, struct + CompositorStageRenderSettings.M_FLFRESNELSTRENGTH); }
    /** Unsafe version of {@link #m_bBackfaceCulling}. */
    public static boolean nm_bBackfaceCulling(long struct) { return UNSAFE.getByte(null, struct + CompositorStageRenderSettings.M_BBACKFACECULLING) != 0; }
    /** Unsafe version of {@link #m_bGreyscale}. */
    public static boolean nm_bGreyscale(long struct) { return UNSAFE.getByte(null, struct + CompositorStageRenderSettings.M_BGREYSCALE) != 0; }
    /** Unsafe version of {@link #m_bWireframe}. */
    public static boolean nm_bWireframe(long struct) { return UNSAFE.getByte(null, struct + CompositorStageRenderSettings.M_BWIREFRAME) != 0; }

    /** Unsafe version of {@link #m_PrimaryColor(HmdColor) m_PrimaryColor}. */
    public static void nm_PrimaryColor(long struct, HmdColor value) { memCopy(value.address(), struct + CompositorStageRenderSettings.M_PRIMARYCOLOR, HmdColor.SIZEOF); }
    /** Unsafe version of {@link #m_SecondaryColor(HmdColor) m_SecondaryColor}. */
    public static void nm_SecondaryColor(long struct, HmdColor value) { memCopy(value.address(), struct + CompositorStageRenderSettings.M_SECONDARYCOLOR, HmdColor.SIZEOF); }
    /** Unsafe version of {@link #m_flVignetteInnerRadius(float) m_flVignetteInnerRadius}. */
    public static void nm_flVignetteInnerRadius(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorStageRenderSettings.M_FLVIGNETTEINNERRADIUS, value); }
    /** Unsafe version of {@link #m_flVignetteOuterRadius(float) m_flVignetteOuterRadius}. */
    public static void nm_flVignetteOuterRadius(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorStageRenderSettings.M_FLVIGNETTEOUTERRADIUS, value); }
    /** Unsafe version of {@link #m_flFresnelStrength(float) m_flFresnelStrength}. */
    public static void nm_flFresnelStrength(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorStageRenderSettings.M_FLFRESNELSTRENGTH, value); }
    /** Unsafe version of {@link #m_bBackfaceCulling(boolean) m_bBackfaceCulling}. */
    public static void nm_bBackfaceCulling(long struct, boolean value) { UNSAFE.putByte(null, struct + CompositorStageRenderSettings.M_BBACKFACECULLING, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #m_bGreyscale(boolean) m_bGreyscale}. */
    public static void nm_bGreyscale(long struct, boolean value) { UNSAFE.putByte(null, struct + CompositorStageRenderSettings.M_BGREYSCALE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #m_bWireframe(boolean) m_bWireframe}. */
    public static void nm_bWireframe(long struct, boolean value) { UNSAFE.putByte(null, struct + CompositorStageRenderSettings.M_BWIREFRAME, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link CompositorStageRenderSettings} structs. */
    public static class Buffer extends StructBuffer<CompositorStageRenderSettings, Buffer> implements NativeResource {

        private static final CompositorStageRenderSettings ELEMENT_FACTORY = CompositorStageRenderSettings.create(-1L);

        /**
         * Creates a new {@code CompositorStageRenderSettings.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CompositorStageRenderSettings#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected CompositorStageRenderSettings getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link HmdColor} view of the {@code m_PrimaryColor} field. */
        @NativeType("HmdColor_t")
        public HmdColor m_PrimaryColor() { return CompositorStageRenderSettings.nm_PrimaryColor(address()); }
        /** Returns a {@link HmdColor} view of the {@code m_SecondaryColor} field. */
        @NativeType("HmdColor_t")
        public HmdColor m_SecondaryColor() { return CompositorStageRenderSettings.nm_SecondaryColor(address()); }
        /** Returns the value of the {@code m_flVignetteInnerRadius} field. */
        public float m_flVignetteInnerRadius() { return CompositorStageRenderSettings.nm_flVignetteInnerRadius(address()); }
        /** Returns the value of the {@code m_flVignetteOuterRadius} field. */
        public float m_flVignetteOuterRadius() { return CompositorStageRenderSettings.nm_flVignetteOuterRadius(address()); }
        /** Returns the value of the {@code m_flFresnelStrength} field. */
        public float m_flFresnelStrength() { return CompositorStageRenderSettings.nm_flFresnelStrength(address()); }
        /** Returns the value of the {@code m_bBackfaceCulling} field. */
        @NativeType("bool")
        public boolean m_bBackfaceCulling() { return CompositorStageRenderSettings.nm_bBackfaceCulling(address()); }
        /** Returns the value of the {@code m_bGreyscale} field. */
        @NativeType("bool")
        public boolean m_bGreyscale() { return CompositorStageRenderSettings.nm_bGreyscale(address()); }
        /** Returns the value of the {@code m_bWireframe} field. */
        @NativeType("bool")
        public boolean m_bWireframe() { return CompositorStageRenderSettings.nm_bWireframe(address()); }

        /** Copies the specified {@link HmdColor} to the {@code m_PrimaryColor} field. */
        public CompositorStageRenderSettings.Buffer m_PrimaryColor(@NativeType("HmdColor_t") HmdColor value) { CompositorStageRenderSettings.nm_PrimaryColor(address(), value); return this; }
        /** Passes the {@code m_PrimaryColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CompositorStageRenderSettings.Buffer m_PrimaryColor(java.util.function.Consumer<HmdColor> consumer) { consumer.accept(m_PrimaryColor()); return this; }
        /** Copies the specified {@link HmdColor} to the {@code m_SecondaryColor} field. */
        public CompositorStageRenderSettings.Buffer m_SecondaryColor(@NativeType("HmdColor_t") HmdColor value) { CompositorStageRenderSettings.nm_SecondaryColor(address(), value); return this; }
        /** Passes the {@code m_SecondaryColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CompositorStageRenderSettings.Buffer m_SecondaryColor(java.util.function.Consumer<HmdColor> consumer) { consumer.accept(m_SecondaryColor()); return this; }
        /** Sets the specified value to the {@code m_flVignetteInnerRadius} field. */
        public CompositorStageRenderSettings.Buffer m_flVignetteInnerRadius(float value) { CompositorStageRenderSettings.nm_flVignetteInnerRadius(address(), value); return this; }
        /** Sets the specified value to the {@code m_flVignetteOuterRadius} field. */
        public CompositorStageRenderSettings.Buffer m_flVignetteOuterRadius(float value) { CompositorStageRenderSettings.nm_flVignetteOuterRadius(address(), value); return this; }
        /** Sets the specified value to the {@code m_flFresnelStrength} field. */
        public CompositorStageRenderSettings.Buffer m_flFresnelStrength(float value) { CompositorStageRenderSettings.nm_flFresnelStrength(address(), value); return this; }
        /** Sets the specified value to the {@code m_bBackfaceCulling} field. */
        public CompositorStageRenderSettings.Buffer m_bBackfaceCulling(@NativeType("bool") boolean value) { CompositorStageRenderSettings.nm_bBackfaceCulling(address(), value); return this; }
        /** Sets the specified value to the {@code m_bGreyscale} field. */
        public CompositorStageRenderSettings.Buffer m_bGreyscale(@NativeType("bool") boolean value) { CompositorStageRenderSettings.nm_bGreyscale(address(), value); return this; }
        /** Sets the specified value to the {@code m_bWireframe} field. */
        public CompositorStageRenderSettings.Buffer m_bWireframe(@NativeType("bool") boolean value) { CompositorStageRenderSettings.nm_bWireframe(address(), value); return this; }

    }

}