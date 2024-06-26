package me.cortex.voxy.client.core.rendering;

import me.cortex.voxy.client.core.gl.GlBuffer;

import static org.lwjgl.opengl.GL30C.GL_R8UI;
import static org.lwjgl.opengl.GL30C.GL_RED_INTEGER;
import static org.lwjgl.opengl.GL42.GL_UNSIGNED_BYTE;
import static org.lwjgl.opengl.GL45C.glClearNamedBufferData;

public class NvMeshViewport extends Viewport<NvMeshViewport, NvMeshFarWorldRenderer> {
    GlBuffer visibilityBuffer;
    public NvMeshViewport(NvMeshFarWorldRenderer renderer) {
        super(renderer);
        this.visibilityBuffer = new GlBuffer(renderer.maxSections*4L);
        glClearNamedBufferData(this.visibilityBuffer.id, GL_R8UI, GL_RED_INTEGER, GL_UNSIGNED_BYTE, new int[1]);
    }

    protected void delete0() {
        this.visibilityBuffer.free();
    }
}
