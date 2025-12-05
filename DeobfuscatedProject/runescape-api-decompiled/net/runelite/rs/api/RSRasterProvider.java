/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MainBufferProvider
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.awt.Component;
import java.awt.Image;
import net.runelite.api.MainBufferProvider;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSAbstractRasterProvider;

public interface RSRasterProvider
extends RSAbstractRasterProvider,
MainBufferProvider {
    @Import(value="image")
    public Image getImage();

    @Import(value="image")
    public void setImage(Image var1);

    @Import(value="component")
    public Component getCanvas();
}

