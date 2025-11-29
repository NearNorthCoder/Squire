/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum4;
import gg.squire.runecrafting.SquireGOTRConfig;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.unethicalite.api.entities.TileObjects;

public class RunecraftingEventHandler
extends Overlay {
    private final  Client aM;
    private  TileObject aP;
    private final  SquireGOTRPlugin aN;
    
    private final  SquireGOTRConfig aO;

    static {
        f.var2();
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, GameObject gameObject) {
        void var3_3;
        void var3;
        if gameObject == null {
            return;
        }
        Shape var4 = var3.getConvexHull();
        if var4 == null {
            return;
        }
        Color color = ColorScheme.BRAND_ORANGE;
        graphics2D.setColor(color);
        graphics2D.draw((Shape)var3_3);
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), 2));
        graphics2D.fill((Shape)var3_3);
    }

    @Inject
    RunecraftingEventHandler(Client client, SquireGOTRPlugin squireGOTRPlugin, SquireGOTRConfig squireGOTRConfig) {
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.aM = client;
        this.aN = squireGOTRPlugin;
        this.aO = squireGOTRConfig;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        d d2 = this.aN.h();
        if ((Object != nulld2)) {
            String[] stringArray = new String[0];
            stringArray[1] = d2.T();
            this.aP = TileObjects.getNearest((String[])stringArray);
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if ((this.aO.highlightTarget( == 0) ? 1 : 0)) {
            return null;
        }
        this.a(graphics2D, (GameObject)this.aP);
        return null;
    }

}

