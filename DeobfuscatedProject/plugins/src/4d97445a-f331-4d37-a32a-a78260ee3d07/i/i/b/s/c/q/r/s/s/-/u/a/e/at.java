/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.-.u.a.e.am;
import i.i.b.s.c.q.r.s.s.-.u.a.e.as;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Grinding bones", priority=5, blocking=true, register=true)
public class at
extends as {
    private static final /* synthetic */ WorldPoint dg;
    private static final /* synthetic */ int dk;
    private static final /* synthetic */ int dj;
    private static /* synthetic */ String[] llIIlIl;
    private static final /* synthetic */ int di;
    private static final /* synthetic */ WorldPoint dh;
    private static final /* synthetic */ WorldPoint df;
    private static /* synthetic */ int[] llIIllI;
    private /* synthetic */ boolean dl;

    private boolean bE() {
        boolean bl2;
        if (at.llIIlllll(Players.getLocal().getAnimation(), llIIllI[10])) {
            bl2 = llIIllI[2];
            "".length();
            if (((0x1B ^ 0x47) & ~(0x4B ^ 0x17)) != 0) {
                return ((0xD6 ^ 0x95) & ~(0xC2 ^ 0x81)) != 0;
            }
        } else {
            bl2 = llIIllI[1];
        }
        return bl2;
    }

    private static boolean llIIllIlI(int n2) {
        return n2 == 0;
    }

    private static String llIIlIllI(String lllIlIIllIIlIIl, String lllIlIIllIIIIll) {
        lllIlIIllIIlIIl = new String(Base64.getDecoder().decode(lllIlIIllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIIllIIIlll = new StringBuilder();
        char[] lllIlIIllIIIllI = lllIlIIllIIIIll.toCharArray();
        int lllIlIIllIIIlIl = llIIllI[1];
        char[] lllIlIIlIllllll = lllIlIIllIIlIIl.toCharArray();
        int lllIlIIlIlllllI = lllIlIIlIllllll.length;
        int lllIlIIlIllllIl = llIIllI[1];
        while (at.llIlIIIlI(lllIlIIlIllllIl, lllIlIIlIlllllI)) {
            char lllIlIIllIIlIlI = lllIlIIlIllllll[lllIlIIlIllllIl];
            lllIlIIllIIIlll.append((char)(lllIlIIllIIlIlI ^ lllIlIIllIIIllI[lllIlIIllIIIlIl % lllIlIIllIIIllI.length]));
            "".length();
            ++lllIlIIllIIIlIl;
            ++lllIlIIlIllllIl;
            "".length();
            if (" ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lllIlIIllIIIlll);
    }

    private static boolean llIIlllll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public at(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        super(squireEcto, squireEctoConfig);
    }

    private static boolean llIIllIll(Object object) {
        return object == null;
    }

    private static boolean llIlIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private boolean bF() {
        boolean bl2;
        if (at.llIIlllll(Players.getLocal().getAnimation(), llIIllI[11])) {
            bl2 = llIIllI[2];
            "".length();
            if (-"  ".length() > 0) {
                return ((68 + 10 - 9 + 175 ^ 81 + 82 - -16 + 19) & (0xA3 ^ 0x95 ^ (0x69 ^ 0x6D) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIIllI[1];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllIlIIllllIIIl;
        if (at.llIlIIIIl(chatMessage.getType(), ChatMessageType.SPAM) && at.llIlIIIIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String lllIlIIllllIIII = lllIlIIllllIIIl.getMessage();
        if (at.llIIlllIl(lllIlIIllllIIII.contains(llIIlIl[llIIllI[12]]) ? 1 : 0)) {
            lllIlIIllllIIlI.dl = llIIllI[2];
        }
    }

    private static String llIIlIlll(String lllIlIIllIlIlll, String lllIlIIllIlIllI) {
        try {
            SecretKeySpec lllIlIIllIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIllIlIllI.getBytes(StandardCharsets.UTF_8)), llIIllI[12]), "DES");
            Cipher lllIlIIllIllIll = Cipher.getInstance("DES");
            lllIlIIllIllIll.init(llIIllI[0], lllIlIIllIlllII);
            return new String(lllIlIIllIllIll.doFinal(Base64.getDecoder().decode(lllIlIIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIllIllIlI) {
            lllIlIIllIllIlI.printStackTrace();
            return null;
        }
    }

    private boolean bD() {
        boolean bl2;
        if (at.llIIlllll(Players.getLocal().getAnimation(), llIIllI[9])) {
            bl2 = llIIllI[2];
            "".length();
            if (((0x2C ^ 0x29 ^ (0x88 ^ 0xC6)) & (0x36 ^ 0xF ^ (0xC0 ^ 0xB2) ^ -" ".length())) != 0) {
                return ((0xFE ^ 0x9D ^ (0x6F ^ 0x29)) & (0x67 ^ 0x79 ^ (0x66 ^ 0x5D) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIIllI[1];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        at lllIlIIllllIlll;
        void lllIlIIllllIllI;
        if (at.llIIllIlI(am.ECTO_UPSTAIRS.bo() ? 1 : 0)) {
            return;
        }
        if (at.llIlIIIII(lllIlIIllllIllI.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED) && at.llIIlllll(lllIlIIllllIllI.getItemId(), lllIlIIllllIlll.de.bonesToUse().groundItemId)) {
            lllIlIIllllIlll.dd.q(lllIlIIllllIlll.dd.bl() + llIIllI[2]);
        }
    }

    static {
        at.llIIllIIl();
        at.llIIllIII();
        di = llIIllI[9];
        dj = llIIllI[10];
        dk = llIIllI[11];
        df = new WorldPoint(llIIllI[15], llIIllI[16], llIIllI[2]);
        dg = new WorldPoint(llIIllI[17], llIIllI[16], llIIllI[2]);
        dh = new WorldPoint(llIIllI[18], llIIllI[16], llIIllI[2]);
    }

    private static boolean llIlIIIII(Object object, Object object2) {
        return object == object2;
    }

    private static void llIIllIIl() {
        llIIllI = new int[20];
        at.llIIllI[0] = "  ".length();
        at.llIIllI[1] = (0x7E ^ 0x16 ^ (0xFC ^ 0xA0)) & (0x5E ^ 0x66 ^ (5 ^ 9) ^ -" ".length());
        at.llIIllI[2] = " ".length();
        at.llIIllI[3] = 0xFFFF879F & 0x7FEB;
        at.llIIllI[4] = "   ".length();
        at.llIIllI[5] = 0x6F ^ 4 ^ (0xE4 ^ 0x8B);
        at.llIIllI[6] = "  ".length() ^ (0x22 ^ 0x25);
        at.llIIllI[7] = 2 ^ 4;
        at.llIIllI[8] = 0x31 ^ 0x78 ^ (0xCD ^ 0x83);
        at.llIIllI[9] = 0xFFFFD6F7 & 0x2F79;
        at.llIIllI[10] = -(0xFFFFC2AF & 0x7DD7) & (0xFFFFC7FE & 0x7EF7);
        at.llIIllI[11] = -(0xFFFFFDCD & 0x7BBB) & (0xFFFFFFFA & Short.MAX_VALUE);
        at.llIIllI[12] = 0xBD ^ 0xB5;
        at.llIIllI[13] = 63 + 132 - 36 + 5 ^ 159 + 156 - 283 + 141;
        at.llIIllI[14] = 0x74 ^ 0x41 ^ (0x59 ^ 0x66);
        at.llIIllI[15] = 0xFFFFEEDF & 0x1F6C;
        at.llIIllI[16] = -(0xFFFF92B4 & 0x7D7F) & (0xFFFFBFFF & 0x5DF7);
        at.llIIllI[17] = -(0xFFFFF487 & 0x5B7D) & (0xFFFFFFFF & 0x5E4F);
        at.llIIllI[18] = -(0xFFFFFF3E & 0x71F7) & (0xFFFFFF7F & Short.MAX_VALUE);
        at.llIIllI[19] = 0xB7 ^ 0xBC;
    }

    private static boolean llIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIlIlIl(String lllIlIIlllIIllI, String lllIlIIlllIIIll) {
        try {
            SecretKeySpec lllIlIIlllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIlllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIIlllIlIII = Cipher.getInstance("Blowfish");
            lllIlIIlllIlIII.init(llIIllI[0], lllIlIIlllIlIIl);
            return new String(lllIlIIlllIlIII.doFinal(Base64.getDecoder().decode(lllIlIIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIlllIIlll) {
            lllIlIIlllIIlll.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean bB() {
        at lllIlIIlllllllI;
        int[] nArray = new int[llIIllI[0]];
        nArray[at.llIIllI[1]] = this.de.bonesToUse().itemId;
        nArray[at.llIIllI[2]] = llIIllI[3];
        if (at.llIIllIlI(Inventory.containsAllOf((int[])nArray) ? 1 : 0)) {
            return llIIllI[1];
        }
        if (at.llIIllIlI(am.ECTOFUNTUS.bo() ? 1 : 0) && at.llIIllIlI(am.ECTO_UPSTAIRS.bo() ? 1 : 0)) {
            return lllIlIIlllllllI.dd.bk();
        }
        if (at.llIIllIlI(am.ECTO_UPSTAIRS.bo() ? 1 : 0)) {
            String[] stringArray = new String[llIIllI[2]];
            stringArray[at.llIIllI[1]] = llIIlIl[llIIllI[1]];
            TileObject lllIlIIllllllIl = TileObjects.getNearest((String[])stringArray);
            if (at.llIIllIll(lllIlIIllllllIl)) {
                return llIIllI[1];
            }
            lllIlIIllllllIl.interact(llIIlIl[llIIllI[2]]);
            return llIIllI[2];
        }
        TileObject lllIlIIllllllIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if (at.llIIlllIl(tileObject.getName().equals(llIIlIl[llIIllI[13]]) ? 1 : 0)) {
                String[] stringArray = new String[llIIllI[2]];
                stringArray[at.llIIllI[1]] = llIIlIl[llIIllI[14]];
                if (at.llIIlllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIIllI[2];
                    "".length();
                    if (null == null) return n2 != 0;
                    return ((0x4B ^ 0x53 ^ (0x5D ^ 0x43)) & (0x37 ^ 0x4F ^ (0x15 ^ 0x6B) ^ -" ".length())) != 0;
                }
            }
            n2 = llIIllI[1];
            return n2 != 0;
        });
        String[] stringArray = new String[llIIllI[2]];
        stringArray[at.llIIllI[1]] = llIIlIl[llIIllI[0]];
        TileObject lllIlIIllllllII = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[llIIllI[2]];
        stringArray2[at.llIIllI[1]] = llIIlIl[llIIllI[4]];
        TileObject lllIlIIlllllIll = TileObjects.getNearest((String[])stringArray2);
        if (!at.llIIlllII(lllIlIIllllllIl) || !at.llIIlllII(lllIlIIllllllII) || at.llIIllIll(lllIlIIlllllIll)) {
            Log.info((String)llIIlIl[llIIllI[5]]);
            return llIIllI[1];
        }
        if (at.llIIlllIl(lllIlIIlllllllI.dl ? 1 : 0)) {
            lllIlIIllllllIl.interact(llIIlIl[llIIllI[6]]);
            lllIlIIlllllllI.dl = llIIllI[1];
            return llIIllI[2];
        }
        if (at.llIIlllIl(lllIlIIlllllllI.bD() ? 1 : 0)) {
            lllIlIIllllllIl.interact(llIIlIl[llIIllI[7]]);
            return llIIllI[2];
        }
        if (at.llIIlllIl(lllIlIIlllllllI.bE() ? 1 : 0)) {
            lllIlIIlllllIll.interact(llIIlIl[llIIllI[8]]);
            return llIIllI[2];
        }
        int[] nArray2 = new int[llIIllI[2]];
        nArray2[at.llIIllI[1]] = lllIlIIlllllllI.de.bonesToUse().itemId;
        Item lllIlIIlllllIlI = Inventory.getFirst((int[])nArray2);
        if (at.llIIllIll(lllIlIIlllllIlI)) {
            return llIIllI[1];
        }
        if (at.llIIlllIl(lllIlIIlllllllI.bF() ? 1 : 0)) {
            lllIlIIlllllIlI.useOn(lllIlIIllllllII);
            lllIlIIlllllllI.sleep(llIIllI[0]);
            return llIIllI[2];
        }
        if (at.llIIllllI(lllIlIIllllllIl.distanceTo(Players.getLocal().getWorldLocation()), llIIllI[7])) {
            lllIlIIlllllIlI.useOn(lllIlIIllllllII);
            lllIlIIlllllllI.sleep(llIIllI[4]);
            return llIIllI[2];
        }
        return llIIllI[1];
    }

    private static boolean llIIlllII(Object object) {
        return object != null;
    }

    private static boolean llIIllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlllIl(int n2) {
        return n2 != 0;
    }

    private static void llIIllIII() {
        llIIlIl = new String[llIIllI[19]];
        at.llIIlIl[at.llIIllI[1]] = at.llIIlIlIl("j0NP+VI9kadYTG9tPkSdlQ==", "UKIPk");
        at.llIIlIl[at.llIIllI[2]] = at.llIIlIlIl("3uwWPxGWeJnyXX3oI8o/ig==", "eauDT");
        at.llIIlIl[at.llIIllI[0]] = at.llIIlIllI("JCA1Lwoa", "hOTKo");
        at.llIIlIl[at.llIIllI[4]] = at.llIIlIlIl("N6n2lGmSzGk=", "aPYMM");
        at.llIIlIl[at.llIIllI[5]] = at.llIIlIlll("HRKMcY8Vrd4=", "Bdgkf");
        at.llIIlIl[at.llIIllI[6]] = at.llIIlIllI("Og8PHg==", "mfazT");
        at.llIIlIl[at.llIIllI[7]] = at.llIIlIlIl("syY/3qoNbDM=", "rQTCg");
        at.llIIlIl[at.llIIllI[8]] = at.llIIlIlIl("gjmh8TJm9oQ=", "MIakm");
        at.llIIlIl[at.llIIllI[12]] = at.llIIlIlIl("NcF8rqp5xZJnEk01g0cr3lxeGXU9pmdD", "qrahp");
        at.llIIlIl[at.llIIllI[13]] = at.llIIlIlIl("oJoe81D4gPOy4Pvi+ikwjA==", "HVgUW");
        at.llIIlIl[at.llIIllI[14]] = at.llIIlIlIl("Z03j6yEyv4A=", "WHPXy");
    }
}

