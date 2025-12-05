/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Animation
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Animation;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSSkeleton;

public interface RSAnimation
extends Animation {
    @Import(value="skeleton")
    public RSSkeleton getSkeleton();

    @Import(value="transformCount")
    public int getTransformCount();

    @Import(value="transformSkeletonLabels")
    public int[] getTransformTypes();

    @Import(value="transformXs")
    public int[] getTranslatorX();

    @Import(value="transformYs")
    public int[] getTranslatorY();

    @Import(value="transformZs")
    public int[] getTranslatorZ();

    @Import(value="hasAlphaTransform")
    public boolean isShowing();
}

