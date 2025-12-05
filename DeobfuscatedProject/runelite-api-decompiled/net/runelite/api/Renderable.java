/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.Model;
import net.runelite.api.Node;

public interface Renderable
extends Node {
    public Model getModel();

    public int getModelHeight();

    public void setModelHeight(int var1);

    public void setHidden(boolean var1);

    public boolean isHidden();
}

