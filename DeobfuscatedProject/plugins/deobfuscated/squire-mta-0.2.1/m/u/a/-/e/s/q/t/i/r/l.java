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
package m.u.a.-.e.s.q.t.i.r;

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
import m.u.a.-.e.s.q.t.i.r.b;
import m.u.a.-.e.s.q.t.i.r.c;
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
public class l
extends b {
    private static final /* synthetic */ int S;
    private static /* synthetic */ String[] lllIlIlIlIlI;
    private final /* synthetic */ SquireMTA U;
    static final /* synthetic */ int R;
    private final /* synthetic */ Client T;
    private static /* synthetic */ int[] lllIlIlIlIll;
    private /* synthetic */ int Y;
    private final /* synthetic */ InfoBoxManager W;
    private final /* synthetic */ List<String> X;
    private final /* synthetic */ ItemManager V;
    private /* synthetic */ k Z;

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
    private l(MagicArenaConfig magicArenaConfig, Client client, SquireMTA squireMTA, ItemManager itemManager, InfoBoxManager infoBoxManager) {
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

    private static void lIIIllIIIIlIIIl() {
        lllIlIlIlIll = new int[8];
        l.lllIlIlIlIll[0] = 2;
        l.lllIlIlIlIll[1] = (0x58 ^ 0x47) & ~(0x37 ^ 0x28);
        l.lllIlIlIlIll[2] = 1;
        l.lllIlIlIlIll[3] = 0xFFFFB5F6 & 0x7E9F;
        l.lllIlIlIlIll[4] = -(0xFFFFEF47 & 0x74BF) & (0xFFFFFEFE & Short.MAX_VALUE);
        l.lllIlIlIlIll[5] = 3;
        l.lllIlIlIlIll[6] = 0x78 ^ 0x7C;
        l.lllIlIlIlIll[7] = 0x7A ^ 0x6A;
    }

    private static boolean lIIIllIIIIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    protected int a(Item[] itemArray) {
        void lllllllllllllllIIllIllIIIlIIIlIl;
        int n2 = lllIlIlIlIll[1];
        if (l.lIIIllIIIIlIllI(itemArray)) {
            void lllllllllllllllIIllIllIIIlIIIlII;
            return (int)lllllllllllllllIIllIllIIIlIIIlII;
        }
        void lllllllllllllllIIllIllIIIlIIIIll = lllllllllllllllIIllIllIIIlIIIlIl;
        int lllllllllllllllIIllIllIIIlIIIIlI = ((void)lllllllllllllllIIllIllIIIlIIIIll).length;
        int lllllllllllllllIIllIllIIIlIIIIIl = lllIlIlIlIll[1];
        while (l.lIIIllIIIIlIlll(lllllllllllllllIIllIllIIIlIIIIIl, lllllllllllllllIIllIllIIIlIIIIlI)) {
            l lllllllllllllllIIllIllIIIlIIIllI;
            void lllllllllllllllIIllIllIIIlIIIIII = lllllllllllllllIIllIllIIIlIIIIll[lllllllllllllllIIllIllIIIlIIIIIl];
            lllllllllllllllIIllIllIIIlIIIlII += lllllllllllllllIIllIllIIIlIIIllI.a(lllllllllllllllIIllIllIIIlIIIIII.getId());
            ++lllllllllllllllIIllIllIIIlIIIIIl;
            0;
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
        l lllllllllllllllIIllIllIIIlIlIIIl;
        void lllllllllllllllIIllIllIIIlIlIIII;
        if (l.lIIIllIIIIlIlII(this.c() ? 1 : 0)) {
            return;
        }
        ItemContainer lllllllllllllllIIllIllIIIlIIllll = lllllllllllllllIIllIllIIIlIlIIII.getItemContainer();
        if (l.lIIIllIIIIlIlIl(lllllllllllllllIIllIllIIIlIIllll, lllllllllllllllIIllIllIIIlIlIIIl.T.getItemContainer(InventoryID.INVENTORY))) {
            lllllllllllllllIIllIllIIIlIlIIIl.Y = lllllllllllllllIIllIllIIIlIlIIIl.a(lllllllllllllllIIllIllIIIlIIllll.getItems());
            if (l.lIIIllIIIIlIllI((Object)lllllllllllllllIIllIllIIIlIlIIIl.Z)) {
                AsyncBufferedImage lllllllllllllllIIllIllIIIlIIlllI = lllllllllllllllIIllIllIIIlIlIIIl.V.getImage(lllIlIlIlIll[4]);
                lllllllllllllllIIllIllIIIlIlIIIl.Z = new k((BufferedImage)lllllllllllllllIIllIllIIIlIIlllI, (Plugin)lllllllllllllllIIllIllIIIlIlIIIl.U);
                lllllllllllllllIIllIllIIIlIlIIIl.W.addInfoBox((InfoBox)lllllllllllllllIIllIllIIIlIlIIIl.Z);
            }
            lllllllllllllllIIllIllIIIlIlIIIl.Z.setCount(lllllllllllllllIIllIllIIIlIlIIIl.Y);
        }
    }

    private static String lIIIllIIIIIllIl(String lllllllllllllllIIllIllIIIIllIIll, String lllllllllllllllIIllIllIIIIlIllIl) {
        lllllllllllllllIIllIllIIIIllIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIIIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllIIIIllIIIl = new StringBuilder();
        char[] lllllllllllllllIIllIllIIIIllIIII = lllllllllllllllIIllIllIIIIlIllIl.toCharArray();
        int lllllllllllllllIIllIllIIIIlIllll = lllIlIlIlIll[1];
        char[] lllllllllllllllIIllIllIIIIlIlIIl = lllllllllllllllIIllIllIIIIllIIll.toCharArray();
        int lllllllllllllllIIllIllIIIIlIlIII = lllllllllllllllIIllIllIIIIlIlIIl.length;
        int lllllllllllllllIIllIllIIIIlIIlll = lllIlIlIlIll[1];
        while (l.lIIIllIIIIlIlll(lllllllllllllllIIllIllIIIIlIIlll, lllllllllllllllIIllIllIIIIlIlIII)) {
            char lllllllllllllllIIllIllIIIIllIlII = lllllllllllllllIIllIllIIIIlIlIIl[lllllllllllllllIIllIllIIIIlIIlll];
            lllllllllllllllIIllIllIIIIllIIIl.append((char)(lllllllllllllllIIllIllIIIIllIlII ^ lllllllllllllllIIllIllIIIIllIIII[lllllllllllllllIIllIllIIIIlIllll % lllllllllllllllIIllIllIIIIllIIII.length]));
            0;
            ++lllllllllllllllIIllIllIIIIlIllll;
            ++lllllllllllllllIIllIllIIIIlIIlll;
            0;
            if (2 > ((0x22 ^ 0x28) & ~(0x66 ^ 0x6C))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIllIIIIllIIIl);
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
            0;
            if ((0x73 ^ 0x77) == 0) {
                return ((0x24 ^ 0x65) & ~(0x26 ^ 0x67)) != 0;
            }
        } else {
            n2 = lllIlIlIlIll[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIllIIIIlIIlI(Object object) {
        return object != null;
    }

    private static String lIIIllIIIIIlllI(String lllllllllllllllIIllIllIIIIIlllII, String lllllllllllllllIIllIllIIIIIllIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIIIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllIIIIlIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllIIIIlIIIII.init(lllIlIlIlIll[0], lllllllllllllllIIllIllIIIIlIIIIl);
            return new String(lllllllllllllllIIllIllIIIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllIIIIIlllll) {
            lllllllllllllllIIllIllIIIIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIIlIlIl(Object object, Object object2) {
        return object == object2;
    }

    public int B() {
        return this.Y;
    }

    private static void lIIIllIIIIlIIII() {
        lllIlIlIlIlI = new String[lllIlIlIlIll[0]];
        l.lllIlIlIlIlI[l.lllIlIlIlIll[1]] = l."Mud battlestaff";
        l.lllIlIlIlIlI[l.lllIlIlIlIll[2]] = l."Mystic mud staff";
    }
}

