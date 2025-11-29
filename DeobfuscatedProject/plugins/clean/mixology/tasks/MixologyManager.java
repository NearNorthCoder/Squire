/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Perspective
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.mixology.SquireMixology;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class MixologyManager
extends Overlay {

    private final  SquireMixology H;
    private static final  Logger G;

    private static void lIIlIlIlllIlIIl() {
        lllllllllIll = new String[llllllllllII[3]];
        g.lllllllllIll[g.llllllllllII[1]] = "poly is null";
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block9: {
            block10: {
                SquireMixology var1;
                SquireMixology var2;
                block8: {
                    g var3;
                    void var4;
                    if (g.lIIlIlIlllIlllI(object, (Object)this)) {
                        return llllllllllII[3];
                    }
                    if (g.lIIlIlIlllIlIll(var4 instanceof g)) {
                        return llllllllllII[1];
                    }
                    g var5 = (MixologyManager) ar4;
                    if (g.lIIlIlIlllIlIll(var5.a((Object)var3) ? 1 : 0)) {
                        return llllllllllII[1];
                    }
                    var2 = var3.c();
                    var1 = var5.c();
                    if (!g.lIIlIlIlllIllIl((Object)var2)) break block8;
                    if (!g.lIIlIlIlllIllll((Object)var1)) break block9;

                    if (2 != 2) {
                        return ((49 + 33 - -16 + 37 ^ 81 + 12 - 58 + 151) & (0x16 ^ 8 ^ (0xB8 ^ 0x9B) ^ -1)) != 0;
                    }
                    break block10;
                }
                if (!g.lIIlIlIlllIlIll(((Object)((Object)var2)).equals((Object)var1) ? 1 : 0)) break block9;
            }
            return llllllllllII[1];
        }
        return llllllllllII[3];
    }

    private static boolean lIIlIlIlllIlIll(int n2) {
        return n2 == 0;
    }

    public String toString() {
        return "MixologyOverlay(plugin=" + String.valueOf((Object)this.c()) + ")";
    }

    public  Plugin getPlugin() {
        return this.c();
    }

    public SquireMixology c() {
        return this.H;
    }

    static {
        g.lIIlIlIlllIlIlI();
        g.lIIlIlIlllIlIIl();
        G = LoggerFactory.getLogger(MixologyManager.class);
    }

    private static boolean lIIlIlIlllIllIl(Object object) {
        return object == null;
    }

    @Inject
    private MixologyManager(SquireMixology squireMixology) {
        this.H = squireMixology;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }

    private static boolean lIIlIlIlllIlllI(Object object, Object object2) {
        return object == object2;
    }

    protected boolean a(Object object) {
        return object instanceof g;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3 = llllllllllII[9];
        int n4 = llllllllllII[3];
        SquireMixology squireMixology = this.c();
        int n5 = n4 * llllllllllII[9];
        if (g.lIIlIlIlllIllIl((Object)squireMixology)) {
            n2 = llllllllllII[10];

            if (((0xDF ^ 0x90) & ~(0x7F ^ 0x30) & ~((0x4F ^ 0xE) & ~(0x32 ^ 0x73)) & ~((0x38 ^ 0x31) & ~(3 ^ 0xA))) != ((0xEA ^ 0xAB) & ~(0xF1 ^ 0xB0))) {
                return (0x17 ^ 0xC) & ~(0xDA ^ 0xC1);
            }
        } else {
            void var6;
            n2 = var6.hashCode();
        }
        n4 = n5 + n2;
        return n4;
    }

    private static boolean lIIlIlIlllIllll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        int[] nArray = new int[llllllllllII[0]];
        nArray[g.llllllllllII[1]] = llllllllllII[2];
        nArray[g.llllllllllII[3]] = llllllllllII[4];
        nArray[g.llllllllllII[5]] = llllllllllII[6];
        List list = NPCs.getAll((int[])nArray);
        if (g.lIIlIlIlllIlIll(list.isEmpty() ? 1 : 0)) {
            void var7;
            int var8 = llllllllllII[1];
            while (g.lIIlIlIlllIllII(var8, var7.size())) {
                void var9;
                Color var10 = new Color(llllllllllII[7], llllllllllII[1], llllllllllII[1], llllllllllII[8]);
                Polygon var11 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)((NPC)var7.get(var8)).getLocalLocation());
                if (g.lIIlIlIlllIllIl(var11)) {
                    System.out.println(lllllllllIll[llllllllllII[1]]);
                    return null;
                }
                OverlayUtil.renderPolygon((Graphics2D)var9, (Shape)var11, (Color)Color.GREEN, (Stroke)new BasicStroke(1.0f));
                ++var8;

                return null;
            }
        }
        return null;
    }

    private static boolean lIIlIlIlllIllII(int n2, int n3) {
        return n2 < n3;
    }
}

