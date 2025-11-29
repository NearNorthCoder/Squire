/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Attacking Baboons", priority=10, blocking=true, register=true)
public class aM
extends aI {
    private static /* synthetic */ String[] llIIlIllIlI;
    private static /* synthetic */ int[] llIIlIllIll;

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (aM.lIlIIIIllIIIll(chatMessage.getMessage().contains(llIIlIllIlI[llIIlIllIll[2]]) ? 1 : 0)) {
            this.sleep(llIIlIllIll[3]);
        }
    }

    private static String lIlIIIIlIllllI(String llllllllllllllllIIlllllIIlIIIlll, String llllllllllllllllIIlllllIIlIIIllI) {
        try {
            SecretKeySpec llllllllllllllllIIlllllIIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllllIIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllllIIlIIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllllIIlIIlIIl.init(llIIlIllIll[4], llllllllllllllllIIlllllIIlIIlIlI);
            return new String(llllllllllllllllIIlllllIIlIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllllIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllllIIlIIlIII) {
            llllllllllllllllIIlllllIIlIIlIII.printStackTrace();
            return null;
        }
    }

    static {
        aM.lIlIIIIllIIIlI();
        aM.lIlIIIIllIIIIl();
    }

    private static boolean lIlIIIIllIIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.babaBaboonAttackStyle();
    }

    private static boolean lIlIIIIllIIlII(Object object) {
        return object == null;
    }

    private static boolean lIlIIIIllIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIllIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIIllIIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIIIIllIIIII(String llllllllllllllllIIlllllIIIlllIlI, String llllllllllllllllIIlllllIIIllIlll) {
        try {
            SecretKeySpec llllllllllllllllIIlllllIIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllllIIIllIlll.getBytes(StandardCharsets.UTF_8)), llIIlIllIll[1]), "DES");
            Cipher llllllllllllllllIIlllllIIIllllII = Cipher.getInstance("DES");
            llllllllllllllllIIlllllIIIllllII.init(llIIlIllIll[4], llllllllllllllllIIlllllIIIllllIl);
            return new String(llllllllllllllllIIlllllIIIllllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllllIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllllIIIlllIll) {
            llllllllllllllllIIlllllIIIlllIll.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIIlIlllll(String llllllllllllllllIIlllllIIIlIIlIl, String llllllllllllllllIIlllllIIIlIIlII) {
        llllllllllllllllIIlllllIIIlIIlIl = new String(Base64.getDecoder().decode(llllllllllllllllIIlllllIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllllIIIlIlIII = new StringBuilder();
        char[] llllllllllllllllIIlllllIIIlIIlll = llllllllllllllllIIlllllIIIlIIlII.toCharArray();
        int llllllllllllllllIIlllllIIIlIIllI = llIIlIllIll[0];
        char[] llllllllllllllllIIlllllIIIlIIIII = llllllllllllllllIIlllllIIIlIIlIl.toCharArray();
        int llllllllllllllllIIlllllIIIIlllll = llllllllllllllllIIlllllIIIlIIIII.length;
        int llllllllllllllllIIlllllIIIIllllI = llIIlIllIll[0];
        while (aM.lIlIIIIllIlIII(llllllllllllllllIIlllllIIIIllllI, llllllllllllllllIIlllllIIIIlllll)) {
            char llllllllllllllllIIlllllIIIlIlIll = llllllllllllllllIIlllllIIIlIIIII[llllllllllllllllIIlllllIIIIllllI];
            llllllllllllllllIIlllllIIIlIlIII.append((char)(llllllllllllllllIIlllllIIIlIlIll ^ llllllllllllllllIIlllllIIIlIIlll[llllllllllllllllIIlllllIIIlIIllI % llllllllllllllllIIlllllIIIlIIlll.length]));
            "".length();
            ++llllllllllllllllIIlllllIIIlIIllI;
            ++llllllllllllllllIIlllllIIIIllllI;
            "".length();
            if ("  ".length() >= ((0x79 ^ 0x43) & ~(0x6B ^ 0x51))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllllIIIlIlIII);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var1_1;
        if (aM.lIlIIIIllIIIll(this.cW.redX() ? 1 : 0)) {
            return llIIlIllIll[0];
        }
        NPC llllllllllllllllIIlllllIIlIlIllI = NPCs.getNearest(nPC -> {
            int n2;
            if (aM.lIlIIIIllIIIll(nPC.getName().equals(llIIlIllIlI[llIIlIllIll[5]]) ? 1 : 0) && aM.lIlIIIIllIIlll(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIllIll[2];
                "".length();
                if (((139 + 157 - 69 + 28 ^ 77 + 30 - 10 + 78) & (98 + 80 - -35 + 10 ^ 6 + 139 - 61 + 59 ^ -" ".length())) == " ".length()) {
                    return ((0xEC ^ 0xA9 ^ (0xD4 ^ 0x88)) & (0xE5 ^ 0x9B ^ (0x71 ^ 0x16) ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIIlIllIll[0];
            }
            return n2 != 0;
        });
        if (aM.lIlIIIIllIIlII(llllllllllllllllIIlllllIIlIlIllI)) {
            return llIIlIllIll[0];
        }
        NPC llllllllllllllllIIlllllIIlIlIlIl = NPCs.getNearest(nPC -> nPC.getName().contains(llIIlIllIlI[llIIlIllIll[4]]));
        if (aM.lIlIIIIllIIlIl(llllllllllllllllIIlllllIIlIlIlIl) && aM.lIlIIIIllIIllI(llllllllllllllllIIlllllIIlIlIllI.distanceTo((Locatable)llllllllllllllllIIlllllIIlIlIlIl), llIIlIllIll[1])) {
            return llIIlIllIll[0];
        }
        this.bp();
        var1_1.interact(llIIlIllIlI[llIIlIllIll[0]]);
        return llIIlIllIll[2];
    }

    @Inject
    protected aM(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void lIlIIIIllIIIlI() {
        llIIlIllIll = new int[7];
        aM.llIIlIllIll[0] = (0x12 ^ 0x28) & ~(0x3C ^ 6);
        aM.llIIlIllIll[1] = 0xBF ^ 0xB7;
        aM.llIIlIllIll[2] = " ".length();
        aM.llIIlIllIll[3] = 0x60 ^ 0x65;
        aM.llIIlIllIll[4] = "  ".length();
        aM.llIIlIllIll[5] = "   ".length();
        aM.llIIlIllIll[6] = 124 + 98 - 144 + 70 ^ 31 + 3 - 27 + 137;
    }

    private static void lIlIIIIllIIIIl() {
        llIIlIllIlI = new String[llIIlIllIll[6]];
        aM.llIIlIllIlI[aM.llIIlIllIll[0]] = aM.lIlIIIIlIllllI("ii5X9KnI3o8=", "gfDAr");
        aM.llIIlIllIlI[aM.llIIlIllIll[2]] = aM.lIlIIIIlIlllll("CyxUOARpOREICj4+WRtFJSwLHQBpLxYPCS0oC1oEPW0AFRA=", "IMyze");
        aM.llIIlIllIlI[aM.llIIlIllIll[4]] = aM.lIlIIIIllIIIII("d9bygSEDhp0=", "fnlKm");
        aM.llIIlIllIlI[aM.llIIlIllIll[5]] = aM.lIlIIIIlIlllll("BCo1NQgo", "FKWZg");
    }
}

