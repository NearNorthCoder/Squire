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
package gg.squire.moons.tasks;

import com.google.inject.Inject;
import gg.squire.moons.SquireMoonsOfPeril;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
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
public class MoonsManager
extends Overlay {
    private final  SquireMoonsOfPeril n;

    private static final  Logger m;

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        int[] nArray = new int[lIIIIIIlIIIlI[0]];
        nArray[a.lIIIIIIlIIIlI[1]] = lIIIIIIlIIIlI[2];
        nArray[a.lIIIIIIlIIIlI[3]] = lIIIIIIlIIIlI[4];
        nArray[a.lIIIIIIlIIIlI[5]] = lIIIIIIlIIIlI[6];
        List list = NPCs.getAll((int[])nArray);
        if (a.lIIlIlllIlIIllI(list.isEmpty() ? 1 : 0)) {
            void var1;
            int var2 = lIIIIIIlIIIlI[1];
            while (a.lIIlIlllIlIIlll(var2, var1.size())) {
                void var3;
                Color var4 = new Color(lIIIIIIlIIIlI[7], lIIIIIIlIIIlI[1], lIIIIIIlIIIlI[1], lIIIIIIlIIIlI[8]);
                Polygon var5 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)((NPC)var1.get(var2)).getLocalLocation());
                if (a.lIIlIlllIlIlIII(var5)) {
                    System.out.println(lIIIIIIlIIIIl[lIIIIIIlIIIlI[1]]);
                    return null;
                }
                OverlayUtil.renderPolygon((Graphics2D)var3, (Shape)var5, (Color)Color.GREEN, (Stroke)new BasicStroke(1.0f));
                ++var2;

                if (-3 <= 0) continue;
                return null;
            }
        }
        return null;
    }

    public String toString() {
        return "MoonsOverlay(plugin=" + String.valueOf((Object)this.MoonsManager()) + ")";
    }

    private static boolean lIIlIlllIlIIllI(int n) {
        return n == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block9: {
            block10: {
                SquireMoonsOfPeril var6;
                SquireMoonsOfPeril var7;
                block8: {
                    a var8;
                    void var9;
                    if (a.lIIlIlllIlIlIIl(object, (Object)this)) {
                        return lIIIIIIlIIIlI[3];
                    }
                    if (a.lIIlIlllIlIIllI(var9 instanceof a)) {
                        return lIIIIIIlIIIlI[1];
                    }
                    a var10 = (MoonsManager) ar9;
                    if (a.lIIlIlllIlIIllI(var10.MoonsManager((Object)var8) ? 1 : 0)) {
                        return lIIIIIIlIIIlI[1];
                    }
                    var7 = var8.MoonsManager();
                    var6 = var10.MoonsManager();
                    if (!a.lIIlIlllIlIlIII((Object)var7)) break block8;
                    if (!a.lIIlIlllIlIlIlI((Object)var6)) break block9;

                    if (((0x3E ^ 0x53 ^ (0x75 ^ 0xE)) & (0x83 ^ 0x99 ^ (0x7B ^ 0x77) ^ -1)) != 0) {
                        return ((9 + 15 - -82 + 93 ^ 42 + 44 - 57 + 122) & (5 ^ 0x33 ^ (0x2E ^ 0x48) ^ -1)) != 0;
                    }
                    break block10;
                }
                if (!a.lIIlIlllIlIIllI(((Object)((Object)var7)).equals((Object)var6) ? 1 : 0)) break block9;
            }
            return lIIIIIIlIIIlI[1];
        }
        return lIIIIIIlIIIlI[3];
    }

    private static boolean lIIlIlllIlIlIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlllIlIlIlI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlllIlIlIII(Object object) {
        return object == null;
    }

    protected boolean MoonsManager(Object object) {
        return object instanceof a;
    }

    @Inject
    private MoonsManager(SquireMoonsOfPeril squireMoonsOfPeril) {
        this.n = squireMoonsOfPeril;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }

    public  Plugin getPlugin() {
        return this.MoonsManager();
    }

    private static void lIIlIlllIlIIlII() {
        lIIIIIIlIIIIl = new String[lIIIIIIlIIIlI[3]];
        a.lIIIIIIlIIIIl[a.lIIIIIIlIIIlI[1]] = "poly is null";
    }

    public SquireMoonsOfPeril MoonsManager() {
        return this.n;
    }

    private static boolean lIIlIlllIlIIlll(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n;
        int n2 = lIIIIIIlIIIlI[9];
        int n3 = lIIIIIIlIIIlI[3];
        SquireMoonsOfPeril squireMoonsOfPeril = this.MoonsManager();
        int n4 = n3 * lIIIIIIlIIIlI[9];
        if (a.lIIlIlllIlIlIII((Object)squireMoonsOfPeril)) {
            n = lIIIIIIlIIIlI[10];

            if ((157 + 15 - 167 + 172 ^ 11 + 67 - -89 + 14) <= 3) {
                return (66 + 68 - -32 + 9 ^ 152 + 7 - 117 + 138) & (0x46 ^ 0x31 ^ (0x73 ^ 0x1F) ^ -1);
            }
        } else {
            void var11;
            n = var11.hashCode();
        }
        n3 = n4 + n;
        return n3;
    }

    static {
        a.lIIlIlllIlIIlIl();
        a.lIIlIlllIlIIlII();
        m = LoggerFactory.getLogger(MoonsManager.class);
    }
}

