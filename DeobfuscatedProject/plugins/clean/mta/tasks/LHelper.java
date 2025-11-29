/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.Player
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.ItemContainerChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.ItemManager
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.infobox.InfoBox
 *  net.runelite.client.ui.overlay.infobox.InfoBoxManager
 *  net.runelite.client.util.AsyncBufferedImage
 */
package gg.squire.mta.tasks;

import gg.squire.mta.MagicArenaConfig;
import gg.squire.mta.SquireMTA;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import gg.squire.mta.tasks.MtaTaskBase;
import gg.squire.mta.tasks.GameEnum8;
import m.u.a.-.e.s.q.t.i.r.k;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Player;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.InfoBox;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.util.AsyncBufferedImage;

@Singleton
public class LHelper
extends MtaTaskBase {
    private static final  int S;
    
    private final  SquireMTA U;
    static final  int R;
    private final  Client T;
    
    private  int Y;
    private final  InfoBoxManager W;
    private final  List<String> X;
    private final  ItemManager V;
    private  k Z;

    @Subscribe
    public void a(GameTick gameTick) {
        if (l.lIIIllIIIIlIlII(this.c() ? 1 : 0) && l.lIIIllIIIIlIIlI((Object)this.Z)) {
            this.W.removeIf(infoBox -> infoBox instanceof k);
            this.Z = null;
        }
    }

    private static boolean lIIIllIIIIlIlII(int n2) {
        return n2 == 0;
    }

    @Inject
    private LHelper(MagicArenaConfig magicArenaConfig, Client client, SquireMTA squireMTA, ItemManager itemManager, InfoBoxManager infoBoxManager) {
        super(magicArenaConfig);
        String[] stringArray = new String[lllIlIlIlIll[0]];
        stringArray[l.lllIlIlIlIll[1]] = lllIlIlIlIlI[lllIlIlIlIll[1]];
        stringArray[l.lllIlIlIlIll[2]] = lllIlIlIlIlI[lllIlIlIlIll[2]];
        this.X = Arrays.asList(stringArray);
        this.T = client;
        this.U = squireMTA;
        this.V = itemManager;
        this.W = infoBoxManager;
    }

    private int a(int n2) {
        switch (n2) {
            case 6904: {
                return lllIlIlIlIll[2];
            }
            case 6905: {
                return lllIlIlIlIll[0];
            }
            case 6906: {
                return lllIlIlIlIll[5];
            }
            case 6907: {
                return lllIlIlIlIll[6];
            }
        }
        return lllIlIlIlIll[1];
    }

    private static boolean lIIIllIIIIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    protected int a(Item[] itemArray) {
        void var1;
        int n2 = lllIlIlIlIll[1];
        if (l.lIIIllIIIIlIllI(itemArray)) {
            void var2;
            return (int)var2;
        }
        void var3 = var1;
        int var4 = ((void)var3).length;
        int var5 = lllIlIlIlIll[1];
        while (l.lIIIllIIIIlIlll(var5, var4)) {
            l var6;
            void var7 = var3[var5];
            var2 += var6.a(var7.getId());
            ++var5;

            if ((0x56 ^ 0x52) == (0x29 ^ 0x2D)) continue;
            return (0x12 ^ 0x58) & ~(0xF3 ^ 0xB9);
        }
        return n2;
    }

    public List<String> o() {
        return this.X;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        l var8;
        void var9;
        if (l.lIIIllIIIIlIlII(this.c() ? 1 : 0)) {
            return;
        }
        ItemContainer var10 = var9.getItemContainer();
        if (l.lIIIllIIIIlIlIl(var10, var8.T.getItemContainer(InventoryID.INVENTORY))) {
            var8.Y = var8.a(var10.getItems());
            if (l.lIIIllIIIIlIllI((Object)var8.Z)) {
                AsyncBufferedImage var11 = var8.V.getImage(lllIlIlIlIll[4]);
                var8.Z = new k((BufferedImage)var11, (Plugin)var8.U);
                var8.W.addInfoBox((InfoBox)var8.Z);
            }
            var8.Z.setCount(var8.Y);
        }
    }

        return String.valueOf(var12);
    }

    @Override
    public c d() {
        return c.GRAVEYARD;
    }

    private static boolean lIIIllIIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        l.lIIIllIIIIlIIIl();
        l.lIIIllIIIIlIIII();
        S = lllIlIlIlIll[3];
        R = lllIlIlIlIll[7];
    }

    private static boolean lIIIllIIIIlIllI(Object object) {
        return object == null;
    }

    @Override
    public boolean c() {
        int n2;
        Player player = this.T.getLocalPlayer();
        if (l.lIIIllIIIIlIIlI(player) && l.lIIIllIIIIlIIll(player.getWorldLocation().getRegionID(), lllIlIlIlIll[3]) && l.lIIIllIIIIlIIll(player.getWorldLocation().getPlane(), lllIlIlIlIll[2])) {
            n2 = lllIlIlIlIll[2];

            if ((0x73 ^ 0x77) == 0) {
                return false;
            }
        } else {
            n2 = lllIlIlIlIll[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIllIIIIlIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIIllIIIIlIlIl(Object object, Object object2) {
        return object == object2;
    }

    public int B() {
        return this.Y;
    }

    private static void lIIIllIIIIlIIII() {
        lllIlIlIlIlI = new String[lllIlIlIlIll[0]];
        l.lllIlIlIlIlI[l.lllIlIlIlIll[1]] = "Mud battlestaff";
        l.lllIlIlIlIlI[l.lllIlIlIlIll[2]] = "Mystic mud staff";
    }
}

