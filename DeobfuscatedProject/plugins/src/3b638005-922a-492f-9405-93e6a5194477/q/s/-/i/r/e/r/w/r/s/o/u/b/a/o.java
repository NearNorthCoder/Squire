/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.DialogOption
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;

@TaskDesc(name="Opening sarcophagus", priority=250, blocking=true)
public class o
extends Task {
    private static /* synthetic */ String[] llllIIlIIIl;
    private static /* synthetic */ int[] llllIIlIIlI;
    private final /* synthetic */ SquireBarrows V;

    private static String lIllIIlllllllI(String llllllllllllllllIIIlllIIlIllIllI, String llllllllllllllllIIIlllIIlIllIlll) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIIlIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIIlIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIlllIIlIlllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIlllIIlIlllIlI.init(llllIIlIIlI[2], llllllllllllllllIIIlllIIlIlllIll);
            return new String(llllllllllllllllIIIlllIIlIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIlllIIlIlllIIl) {
            llllllllllllllllIIIlllIIlIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIIIIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIllIlIIIIIIII() {
        llllIIlIIlI = new int[7];
        o.llllIIlIIlI[0] = " ".length();
        o.llllIIlIIlI[1] = "  ".length() & ("  ".length() ^ -" ".length());
        o.llllIIlIIlI[2] = "  ".length();
        o.llllIIlIIlI[3] = 0x48 ^ 0x2F ^ (0x3D ^ 0x5F);
        o.llllIIlIIlI[4] = 0x74 ^ 0x72;
        o.llllIIlIIlI[5] = "   ".length();
        o.llllIIlIIlI[6] = 5 ^ 0x4E ^ (0x2E ^ 0x6D);
    }

    private static boolean lIllIlIIIIlIII(Object object) {
        return object != null;
    }

    private static String lIllIIllllllIl(String llllllllllllllllIIIlllIIlIlIlIIl, String llllllllllllllllIIIlllIIlIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIIlIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), llllIIlIIlI[6]), "DES");
            Cipher llllllllllllllllIIIlllIIlIlIllIl = Cipher.getInstance("DES");
            llllllllllllllllIIIlllIIlIlIllIl.init(llllIIlIIlI[2], llllllllllllllllIIIlllIIlIlIlllI);
            return new String(llllllllllllllllIIIlllIIlIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIlllIIlIlIllII) {
            llllllllllllllllIIIlllIIlIlIllII.printStackTrace();
            return null;
        }
    }

    private static boolean M() {
        String[] stringArray = new String[llllIIlIIlI[0]];
        stringArray[o.llllIIlIIlI[1]] = llllIIlIIIl[llllIIlIIlI[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (o.lIllIlIIIIIIIl(tileObject)) {
            return llllIIlIIlI[1];
        }
        String[] stringArray2 = new String[llllIIlIIlI[2]];
        stringArray2[o.llllIIlIIlI[1]] = llllIIlIIIl[llllIIlIIlI[0]];
        stringArray2[o.llllIIlIIlI[0]] = llllIIlIIIl[llllIIlIIlI[2]];
        tileObject.interact(stringArray2);
        return llllIIlIIlI[0];
    }

    private static boolean lIllIlIIIIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIlIIIIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    static {
        o.lIllIlIIIIIIII();
        o.lIllIIllllllll();
    }

    private static boolean lIllIlIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIIIIIIIl(Object object) {
        return object == null;
    }

    public boolean run() {
        o llllllllllllllllIIIlllIIllIIIIIl;
        if (o.lIllIlIIIIIIlI(this.V.h() ? 1 : 0)) {
            return llllIIlIIlI[1];
        }
        if (o.lIllIlIIIIIIll(Dialog.isOpen() ? 1 : 0)) {
            llllllllllllllllIIIlllIIllIIIIIl.V.k();
            if (o.lIllIlIIIIIlII(llllllllllllllllIIIlllIIllIIIIIl.V.e(), llllIIlIIlI[3])) {
                DialogOption[] dialogOptionArray = new DialogOption[llllIIlIIlI[2]];
                dialogOptionArray[o.llllIIlIIlI[1]] = DialogOption.PLAIN_CONTINUE;
                dialogOptionArray[o.llllIIlIIlI[0]] = DialogOption.CHAT_OPTION_ONE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return llllIIlIIlI[0];
            }
            return llllIIlIIlI[1];
        }
        if (o.lIllIlIIIIIIll(llllllllllllllllIIIlllIIllIIIIIl.V.i() ? 1 : 0) && o.lIllIlIIIIIlIl(llllllllllllllllIIIlllIIllIIIIIl.V.e(), llllIIlIIlI[4])) {
            return llllIIlIIlI[1];
        }
        if (o.lIllIlIIIIIllI((Object)llllllllllllllllIIIlllIIllIIIIIl.V.r(), (Object)llllllllllllllllIIIlllIIllIIIIIl.V.s()) && o.lIllIlIIIIIlll(llllllllllllllllIIIlllIIllIIIIIl.V.e(), llllIIlIIlI[3])) {
            return llllIIlIIlI[1];
        }
        NPC llllllllllllllllIIIlllIIllIIIIII = NPCs.getNearest(d::a);
        if (o.lIllIlIIIIlIII(llllllllllllllllIIIlllIIllIIIIII) && o.lIllIlIIIIIllI(llllllllllllllllIIIlllIIllIIIIII.getInteracting(), Players.getLocal())) {
            return llllIIlIIlI[1];
        }
        return o.M();
    }

    @Inject
    public o(SquireBarrows squireBarrows) {
        this.V = squireBarrows;
    }

    private static void lIllIIllllllll() {
        llllIIlIIIl = new String[llllIIlIIlI[5]];
        o.llllIIlIIIl[o.llllIIlIIlI[1]] = o.lIllIIllllllII("OAkbJyobAAgjMBg=", "khiDE");
        o.llllIIlIIIl[o.llllIIlIIlI[0]] = o.lIllIIllllllIl("gbdeTDsaDmM=", "Enqsl");
        o.llllIIlIIIl[o.llllIIlIIlI[2]] = o.lIllIIlllllllI("vEBEVAyQt74=", "BsHkN");
    }

    private static boolean lIllIlIIIIIIlI(int n2) {
        return n2 == 0;
    }

    private static String lIllIIllllllII(String llllllllllllllllIIIlllIIlIIllIll, String llllllllllllllllIIIlllIIlIIllIlI) {
        llllllllllllllllIIIlllIIlIIllIll = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIIlIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIlllIIlIIllIIl = new StringBuilder();
        char[] llllllllllllllllIIIlllIIlIIllIII = llllllllllllllllIIIlllIIlIIllIlI.toCharArray();
        int llllllllllllllllIIIlllIIlIIlIlll = llllIIlIIlI[1];
        char[] llllllllllllllllIIIlllIIlIIlIIIl = llllllllllllllllIIIlllIIlIIllIll.toCharArray();
        int llllllllllllllllIIIlllIIlIIlIIII = llllllllllllllllIIIlllIIlIIlIIIl.length;
        int llllllllllllllllIIIlllIIlIIIllll = llllIIlIIlI[1];
        while (o.lIllIlIIIIIlll(llllllllllllllllIIIlllIIlIIIllll, llllllllllllllllIIIlllIIlIIlIIII)) {
            char llllllllllllllllIIIlllIIlIIlllII = llllllllllllllllIIIlllIIlIIlIIIl[llllllllllllllllIIIlllIIlIIIllll];
            llllllllllllllllIIIlllIIlIIllIIl.append((char)(llllllllllllllllIIIlllIIlIIlllII ^ llllllllllllllllIIIlllIIlIIllIII[llllllllllllllllIIIlllIIlIIlIlll % llllllllllllllllIIIlllIIlIIllIII.length]));
            "".length();
            ++llllllllllllllllIIIlllIIlIIlIlll;
            ++llllllllllllllllIIIlllIIlIIIllll;
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIlllIIlIIllIIl);
    }
}

