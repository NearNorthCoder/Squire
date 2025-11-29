/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.api.Point
 *  net.runelite.api.SpritePixels
 *  net.runelite.api.events.ClientTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.util.ImageUtil
 *  net.unethicalite.client.Static
 */
package gg.squire.basics.repeat;

import com.google.inject.Provides;
import gg.squire.basics.repeat.SquireQuickMenuConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.repeat.BulkCleaningHerbsTask;
import gg.squire.basics.repeat.BulkOpeningTask;
import gg.squire.basics.repeat.BulkSearchTask;
import gg.squire.basics.repeat.QuickAlchingTask;
import gg.squire.basics.repeat.TrackingShopRepeatsTask;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.SpritePixels;
import net.runelite.api.events.ClientTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.ImageUtil;
import net.unethicalite.client.Static;

@PluginDescriptor(name="Squire Quick Menus", enabledByDefault=false)
@SquireUtil
public class RepeatPlugin
extends SquirePlugin {
    private  SpritePixels[] gp;
    private static  int[] lIIIlIlIl;
    private  SpritePixels[] go;
    private static  String[] lIIIlIIIl;
    @Inject
    private  ExecutorService gc;
    @Inject
    private  Client v;
    public static final  String gn;
    private  boolean gq;

    public SpritePixels[] cQ() {
        return this.gp;
    }

    /*
     * WARNING - void declaration
     */
    public void f(boolean bl2) {
        void var1;
        SpritePixels[] spritePixelsArray = this.v.getCrossSprites();
        if spritePixelsArray == null {
            return;
        }
        int var2 = 1;
        while ((var2 < ((void)var1).length)) {
            SpritePixels spritePixels;
            RepeatPlugin var3;
            void var4;
            if ((intllIIllIIIlIlIll)) {
                spritePixels = var3.gp[var2];
                0;
                if null != null {
                    return;
                }
            } else {
                spritePixels = var3.go[var2];
            }
            var1[var2] = spritePixels;
            ++var2;
            0;
            if null == null continue;
            return;
        }
        this.gq = bl2;
    }

    @Provides
    SquireQuickMenuConfig u(ConfigManager configManager) {
        return (SquireQuickMenuConfig)configManager.getConfig(SquireQuickMenuConfig.class);
    }

    public boolean cR() {
        return this.gq;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 1;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 1;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (((0x3B ^ 0x7E ^ (0x3E ^ 0x48)) & (18 + 59 - -21 + 37 ^ 116 + 2 - -13 + 49 ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static int var15(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public SpritePixels[] cP() {
        return this.go;
    }

    /*
     * WARNING - void declaration
     */
    private void cO() {
        RepeatPlugin var16;
        void var17;
        SpritePixels[] spritePixelsArray = this.v.getCrossSprites();
        if spritePixelsArray == null {
            return;
        }
        var16.go = new SpritePixels[((void)var17).length];
        var16.gp = new SpritePixels[((void)var17).length];
        System.arraycopy(var17, 1, var16.go, 1, var16.go.length);
        int var18 = 1;
        while (var18 < var16.go.length) {
            SpritePixels var19;
            SpritePixels var20 = var16.go[var18];
            BufferedImage var21 = var20.toBufferedImage();
            ImageUtil.recolorImage((BufferedImage)var21, (Color)new Color(6, 7, 8, 9));
            0;
            var16.gp[var18] = var19 = ImageUtil.getImageSpritePixels((BufferedImage)var21, (Client)var16.v);
            ++var18;
            0;
            if null == null continue;
            return;
        }
    }

    static {
        RepeatPlugin.var22();
        RepeatPlugin.var23();
        gn = lIIIlIIIl[3];
    }

    public void a(Point point) {
        this.f(2);
        Static.getClientThread().execute(() -> this.v.invokeMenuAction(lIIIlIIIl[1], lIIIlIIIl[2], lIIIlIlIl[10], MenuAction.GAME_OBJECT_FIFTH_OPTION.getId(), 1, 1, point.getX(), point.getY()));
    }

    protected void onStop() {
        this.f(1);
    }

    protected void onStart() {
        this.gc.submit(this::cO);
        0;
    }

    @Subscribe
    public void b(ClientTick clientTick) {
        if ((this.cR( != 0) ? 1 : 0) && (RepeatPlugin.var15(System.currentTimeMillis( >= 0) - this.v.getMouseLastPressedMillis(), 400L))) {
            this.f(1);
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[0];
        classArray[1] = TrackingShopRepeatsTask.class;
        classArray[2] = BulkOpeningTask.class;
        classArray[3] = QuickAlchingTask.class;
        classArray[4] = BulkCleaningHerbsTask.class;
        classArray[5] = BulkSearchTask.class;
        return classArray;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }
}

