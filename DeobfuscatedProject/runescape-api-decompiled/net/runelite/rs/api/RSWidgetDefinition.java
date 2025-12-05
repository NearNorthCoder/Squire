/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;
import net.runelite.rs.api.RSEvictingDualNodeHashTable;
import net.runelite.rs.api.RSWidget;

public interface RSWidgetDefinition {
    @Import(value="Widget_interfaceComponents")
    public RSWidget[][] getWidgets();

    @Import(value="loadInterface")
    public boolean loadInterface(int var1);

    @Import(value="Widget_cachedSprites")
    public RSEvictingDualNodeHashTable getWidgetSpriteCache();

    @Import(value="Widget_cachedModels")
    public RSEvictingDualNodeHashTable getModelsCache();

    @Import(value="Widget_cachedFonts")
    public RSEvictingDualNodeHashTable getFontsCache();

    @Import(value="Widget_cachedSpriteMasks")
    public RSEvictingDualNodeHashTable getSpriteMasksCache();

    @Import(value="getWidgetChild")
    public RSWidget getWidgetChild(int var1, int var2);
}

