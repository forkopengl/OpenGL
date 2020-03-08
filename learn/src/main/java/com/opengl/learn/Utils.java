package com.opengl.learn;

import android.content.Context;
import android.opengl.GLSurfaceView;

import java.lang.reflect.Constructor;

public class Utils {

    public static GLSurfaceView.Renderer createRender(String name, Context context) {
        GLSurfaceView.Renderer render = null;
        try {
            Class clazz = Class.forName(name);
            Constructor constroctor = clazz.getConstructor(Context.class);
            render = (GLSurfaceView.Renderer) constroctor.newInstance(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return render;
    }
}
