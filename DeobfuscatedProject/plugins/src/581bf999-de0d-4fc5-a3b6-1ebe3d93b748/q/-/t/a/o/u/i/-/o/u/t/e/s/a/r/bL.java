/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bM;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.y;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@Singleton
@TaskDesc(name="Attacking final warden", priority=40)
public class bL
extends bM {
    private final /* synthetic */ C gL;
    private static /* synthetic */ String[] llIllIIllll;
    private static /* synthetic */ int[] llIllIlIIII;
    private /* synthetic */ boolean gM;
    private final /* synthetic */ y gK;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        int n2;
        boolean bl2;
        void llllllllllllllllIIlIllIllllIIlII;
        bL llllllllllllllllIIlIllIllllIIlIl;
        int[] nArray = new int[llIllIlIIII[1]];
        nArray[bL.llIllIlIIII[0]] = llIllIlIIII[2];
        nArray[bL.llIllIlIIII[3]] = llIllIlIIII[4];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (bL.lIlIlIIllIIlII(nPC)) {
            return llIllIlIIII[0];
        }
        if (bL.lIlIlIIllIIlIl(llllllllllllllllIIlIllIllllIIlIl.cq() ? 1 : 0)) {
            if (bL.lIlIlIIllIIllI(llllllllllllllllIIlIllIllllIIlIl.gM ? 1 : 0)) {
                llllllllllllllllIIlIllIllllIIlIl.gM = llIllIlIIII[3];
                llllllllllllllllIIlIllIllllIIlIl.gK.h(llIllIlIIII[0]);
            }
            if (bL.lIlIlIIllIIllI(llllllllllllllllIIlIllIllllIIlIl.gL.as() ? 1 : 0)) {
                return llIllIlIIII[0];
            }
        }
        int n3 = llllllllllllllllIIlIllIllllIIlII.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation());
        if (!bL.lIlIlIIllIIlIl(llllllllllllllllIIlIllIllllIIlIl.cq() ? 1 : 0) || bL.lIlIlIIllIIlIl(n3)) {
            bl2 = llIllIlIIII[3];
            "".length();
            if (" ".length() == 0) {
                return ((0x7D ^ 0x6C ^ (0x47 ^ 0x12)) & (4 ^ 0x1C ^ (8 ^ 0x54) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIllIlIIII[0];
        }
        boolean llllllllllllllllIIlIllIllllIIIlI = bl2;
        llllllllllllllllIIlIllIllllIIlIl.a((NPC)llllllllllllllllIIlIllIllllIIlII, llllllllllllllllIIlIllIllllIIIlI);
        "".length();
        llllllllllllllllIIlIllIllllIIlII.interact(llIllIIllll[llIllIlIIII[0]]);
        Item llllllllllllllllIIlIllIllllIIIIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (bL.lIlIlIIllIIlIl(llllllllllllllllIIlIllIllllIIlIl.cq() ? 1 : 0)) {
            n2 = llIllIlIIII[3];
            "".length();
            if (((0xB2 ^ 0xA2) & ~(0x8B ^ 0x9B)) == "  ".length()) {
                return ((0x95 ^ 0xBF) & ~(0xA0 ^ 0x8A)) != 0;
            }
        } else if (bL.lIlIlIIllIIlll(llllllllllllllllIIlIllIllllIIIIl) && bL.lIlIlIIllIIlIl(llllllllllllllllIIlIllIllllIIlIl.Q(llllllllllllllllIIlIllIllllIIIIl) ? 1 : 0)) {
            n2 = llIllIlIIII[5];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0xDA ^ 0xAE ^ (0xD9 ^ 0xA7)) & (0x70 ^ 0x13 ^ (8 ^ 0x61) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIllIlIIII[6];
        }
        llllllllllllllllIIlIllIllllIIlIl.sleep(n2);
        return llIllIlIIII[3];
    }

    private static void lIlIlIIllIIIlI() {
        llIllIIllll = new String[llIllIlIIII[5]];
        bL.llIllIIllll[bL.llIllIlIIII[0]] = bL.lIlIlIIllIIIII("2j9rY2aoYn8=", "Yntwp");
        bL.llIllIIllll[bL.llIllIlIIII[3]] = bL.lIlIlIIllIIIIl("3pqEb3vahlM=", "hHlFG");
        bL.llIllIIllll[bL.llIllIlIIII[1]] = bL.lIlIlIIllIIIIl("SO2a/Ku+Gog3vPWWjtn9dw==", "GIYfF");
        bL.llIllIIllll[bL.llIllIlIIII[6]] = bL.lIlIlIIllIIIII("IqiLCCMUZKA=", "LHyLN");
    }

    private static String lIlIlIIllIIIII(String llllllllllllllllIIlIllIlllIIIlII, String llllllllllllllllIIlIllIlllIIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIlllIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIlllIIIIll.getBytes(StandardCharsets.UTF_8)), llIllIlIIII[8]), "DES");
            Cipher llllllllllllllllIIlIllIlllIIlIII = Cipher.getInstance("DES");
            llllllllllllllllIIlIllIlllIIlIII.init(llIllIlIIII[1], llllllllllllllllIIlIllIlllIIlIIl);
            return new String(llllllllllllllllIIlIllIlllIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIlllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllIlllIIIlll) {
            llllllllllllllllIIlIllIlllIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIllIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIIllIIlII(Object object) {
        return object == null;
    }

    static {
        bL.lIlIlIIllIIIll();
        bL.lIlIlIIllIIIlI();
    }

    private static boolean lIlIlIIllIIllI(int n2) {
        return n2 == 0;
    }

    private boolean Q(Item item) {
        int n2;
        String string = item.getName().toLowerCase();
        if (!bL.lIlIlIIllIIllI(string.contains(llIllIIllll[llIllIlIIII[3]]) ? 1 : 0) || !bL.lIlIlIIllIIllI(string.contains(llIllIIllll[llIllIlIIII[1]]) ? 1 : 0) || bL.lIlIlIIllIIlIl(string.contains(llIllIIllll[llIllIlIIII[6]]) ? 1 : 0)) {
            n2 = llIllIlIIII[3];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return ((0x28 ^ 0x42 ^ (0x1E ^ 0x29)) & (0x65 ^ 0x25 ^ (0x70 ^ 0x6D) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIllIlIIII[0];
        }
        return n2 != 0;
    }

    private static void lIlIlIIllIIIll() {
        llIllIlIIII = new int[9];
        bL.llIllIlIIII[0] = (0x3B ^ 0x27 ^ (0xAA ^ 0x83)) & (0xB3 ^ 0x92 ^ (0x14 ^ 0) ^ -" ".length());
        bL.llIllIlIIII[1] = "  ".length();
        bL.llIllIlIIII[2] = 0xFFFFBFFB & 0x6DF5;
        bL.llIllIlIIII[3] = " ".length();
        bL.llIllIlIIII[4] = 0xFFFFBFFF & 0x6DF2;
        bL.llIllIlIIII[5] = 0x5C ^ 0x58;
        bL.llIllIlIIII[6] = "   ".length();
        bL.llIllIlIIII[7] = 0x95 ^ 0xA7;
        bL.llIllIlIIII[8] = 0x8E ^ 0xAE ^ (0x8F ^ 0xA7);
    }

    private static boolean lIlIlIIllIIlll(Object object) {
        return object != null;
    }

    @Override
    public void r() {
        this.gM = llIllIlIIII[0];
    }

    private static String lIlIlIIllIIIIl(String llllllllllllllllIIlIllIlllIlIIll, String llllllllllllllllIIlIllIlllIlIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIlllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIllIlllIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIllIlllIlIlIl.init(llIllIlIIII[1], llllllllllllllllIIlIllIlllIlIllI);
            return new String(llllllllllllllllIIlIllIlllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllIlllIlIlII) {
            llllllllllllllllIIlIllIlllIlIlII.printStackTrace();
            return null;
        }
    }

    @Inject
    protected bL(Client client, z z2, TOAConfig tOAConfig, y y2, C c2) {
        super(client, z2, tOAConfig);
        this.gM = llIllIlIIII[0];
        this.gK = y2;
        this.gL = c2;
    }

    @Override
    public int bt() {
        int n2;
        if (bL.lIlIlIIllIIlIl(this.cq() ? 1 : 0)) {
            n2 = llIllIlIIII[7];
            "".length();
            if (null != null) {
                return (62 + 126 - 187 + 153 ^ 143 + 65 - 68 + 33) & (0x6B ^ 0x36 ^ (0x7A ^ 0x10) ^ -" ".length());
            }
        } else {
            n2 = llIllIlIIII[3];
        }
        return n2;
    }
}

