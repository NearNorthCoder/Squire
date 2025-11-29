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
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

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
public class g
extends Overlay {
    private static /* synthetic */ String[] lllllllllIll;
    private static /* synthetic */ int[] llllllllllII;
    private final /* synthetic */ SquireMixology H;
    private static final /* synthetic */ Logger G;

    private static void lIIlIlIlllIlIlI() {
        llllllllllII = new int[12];
        g.llllllllllII[0] = 3;
        g.llllllllllII[1] = (0xE8 ^ 0xAD) & ~(0xD9 ^ 0x9C);
        g.llllllllllII[2] = -(0xFFFFCC93 & 0x7B6D) & (0xFFFFFADF & 0x7FFC);
        g.llllllllllII[3] = 1;
        g.llllllllllII[4] = -(0xFFFFC5E3 & 0x7F3D) & (0xFFFFFFF7 & 0x77FF);
        g.llllllllllII[5] = 2;
        g.llllllllllII[6] = -(0xFFFF9D87 & 0x6F7B) & (0xFFFFBFF7 & 0x7FDE);
        g.llllllllllII[7] = 152 + 212 - 347 + 210 + (0xC8 ^ 0xC6) - (63 + 128 - 43 + 88) + (2 + 4 - -76 + 168);
        g.llllllllllII[8] = 0xAF ^ 0xB6;
        g.llllllllllII[9] = 0x62 ^ 0x59;
        g.llllllllllII[10] = 0xAE ^ 0x9E ^ (0xAB ^ 0xB0);
        g.llllllllllII[11] = 0x55 ^ 0x5D;
    }

    private static void lIIlIlIlllIlIIl() {
        lllllllllIll = new String[llllllllllII[3]];
        g.lllllllllIll[g.llllllllllII[1]] = g."poly is null";
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block9: {
            block10: {
                SquireMixology var6;
                SquireMixology var8;
                block8: {
                    g var10;
                    void var14;
                    if (g.lIIlIlIlllIlllI(object, (Object)this)) {
                        return llllllllllII[3];
                    }
                    if (g.lIIlIlIlllIlIll(var14 instanceof g)) {
                        return llllllllllII[1];
                    }
                    g var2 = (g)var14;
                    if (g.lIIlIlIlllIlIll(var2.a((Object)var10) ? 1 : 0)) {
                        return llllllllllII[1];
                    }
                    var8 = var10.c();
                    var6 = var2.c();
                    if (!g.lIIlIlIlllIllIl((Object)var8)) break block8;
                    if (!g.lIIlIlIlllIllll((Object)var6)) break block9;
                    0;
                    if (2 != 2) {
                        return ((49 + 33 - -16 + 37 ^ 81 + 12 - 58 + 151) & (0x16 ^ 8 ^ (0xB8 ^ 0x9B) ^ -1)) != 0;
                    }
                    break block10;
                }
                if (!g.lIIlIlIlllIlIll(((Object)((Object)var8)).equals((Object)var6) ? 1 : 0)) break block9;
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

    private static String lIIlIlIlllIlIII(String var7, String var3) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), llllllllllII[11]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(llllllllllII[5], var15);
            return new String(var9.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public /* synthetic */ Plugin getPlugin() {
        return this.c();
    }

    public SquireMixology c() {
        return this.H;
    }

    static {
        g.lIIlIlIlllIlIlI();
        g.lIIlIlIlllIlIIl();
        G = LoggerFactory.getLogger(g.class);
    }

    private static boolean lIIlIlIlllIllIl(Object object) {
        return object == null;
    }

    @Inject
    private g(SquireMixology squireMixology) {
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
            0;
            if (((0xDF ^ 0x90) & ~(0x7F ^ 0x30) & ~((0x4F ^ 0xE) & ~(0x32 ^ 0x73)) & ~((0x38 ^ 0x31) & ~(3 ^ 0xA))) != ((0xEA ^ 0xAB) & ~(0xF1 ^ 0xB0))) {
                return (0x17 ^ 0xC) & ~(0xDA ^ 0xC1);
            }
        } else {
            void var1;
            n2 = var1.hashCode();
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
            void var4;
            int var11 = llllllllllII[1];
            while (g.lIIlIlIlllIllII(var11, var4.size())) {
                void var12;
                Color lllllllllllllllIIlIIIIlIllIIIIlI = new Color(llllllllllII[7], llllllllllII[1], llllllllllII[1], llllllllllII[8]);
                Polygon var13 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)((NPC)var4.get(var11)).getLocalLocation());
                if (g.lIIlIlIlllIllIl(var13)) {
                    System.out.println(lllllllllIll[llllllllllII[1]]);
                    return null;
                }
                OverlayUtil.renderPolygon((Graphics2D)var12, (Shape)var13, (Color)Color.GREEN, (Stroke)new BasicStroke(1.0f));
                ++var11;
                0;
                
                return null;
            }
        }
        return null;
    }

    private static boolean lIIlIlIlllIllII(int n2, int n3) {
        return n2 < n3;
    }
}

