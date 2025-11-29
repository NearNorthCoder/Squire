/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Dialog
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
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
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Handing in sword", priority=10, blocking=true)
public class l
extends Task {
    private final /* synthetic */ a aa;
    private static /* synthetic */ int[] llIlIlllIIlI;
    private static /* synthetic */ String[] llIlIlllIIIl;

    public boolean run() {
        l lllllllllllllllIlIIIIIlIlIIlIlIl;
        if (l.lIIIIIlllllIlll(this.aa.f() ? 1 : 0)) {
            return llIlIlllIIlI[0];
        }
        if (l.lIIIIIllllllIII((Object)lllllllllllllllIlIIIIIlIlIIlIlIl.aa.k())) {
            return llIlIlllIIlI[0];
        }
        if (l.lIIIIIllllllIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIlIlllIIlI[0];
        }
        if (l.lIIIIIllllllIIl(Dialog.getText().contains(llIlIlllIIIl[llIlIlllIIlI[0]]) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[llIlIlllIIlI[1]];
            dialogOptionArray[l.llIlIlllIIlI[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[l.llIlIlllIIlI[2]] = DialogOption.PLAIN_CONTINUE;
            dialogOptionArray[l.llIlIlllIIlI[3]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[l.llIlIlllIIlI[4]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[l.llIlIlllIIlI[5]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return llIlIlllIIlI[2];
        }
        Player lllllllllllllllIlIIIIIlIlIIlIlII = Players.getLocal();
        if (l.lIIIIIllllllIII(lllllllllllllllIlIIIIIlIlIIlIlII.getInteracting())) {
            return llIlIlllIIlI[0];
        }
        this.aa.a(llIlIlllIIIl[llIlIlllIIlI[2]]);
        "".length();
        this.sleep(llIlIlllIIlI[3]);
        return llIlIlllIIlI[2];
    }

    static {
        l.lIIIIIlllllIllI();
        l.lIIIIIlllllIlIl();
    }

    private static boolean lIIIIIllllllIII(Object object) {
        return object != null;
    }

    private static void lIIIIIlllllIllI() {
        llIlIlllIIlI = new int[7];
        l.llIlIlllIIlI[0] = (0xFB ^ 0x9A ^ (0xF ^ 0x37)) & (0xE8 ^ 0x93 ^ (0x34 ^ 0x16) ^ -" ".length());
        l.llIlIlllIIlI[1] = 104 + 56 - -30 + 6 ^ 1 + 156 - 5 + 41;
        l.llIlIlllIIlI[2] = " ".length();
        l.llIlIlllIIlI[3] = "  ".length();
        l.llIlIlllIIlI[4] = "   ".length();
        l.llIlIlllIIlI[5] = 0xCF ^ 0x86 ^ (0x8A ^ 0xC7);
        l.llIlIlllIIlI[6] = 20 + 177 - 149 + 159 ^ 78 + 42 - -20 + 59;
    }

    private static String lIIIIIlllllIIll(String lllllllllllllllIlIIIIIlIlIIIlIlI, String lllllllllllllllIlIIIIIlIlIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlIlIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIIlIlIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIIlIlIIIlllI.init(llIlIlllIIlI[3], lllllllllllllllIlIIIIIlIlIIIllll);
            return new String(lllllllllllllllIlIIIIIlIlIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIlIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIIlIlIIIllIl) {
            lllllllllllllllIlIIIIIlIlIIIllIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIlllllIlII(String lllllllllllllllIlIIIIIlIIlllllIl, String lllllllllllllllIlIIIIIlIIlllllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlIlIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIIlllllII.getBytes(StandardCharsets.UTF_8)), llIlIlllIIlI[6]), "DES");
            Cipher lllllllllllllllIlIIIIIlIlIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIIlIlIIIIIIl.init(llIlIlllIIlI[3], lllllllllllllllIlIIIIIlIlIIIIIlI);
            return new String(lllllllllllllllIlIIIIIlIlIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIIlIlIIIIIII) {
            lllllllllllllllIlIIIIIlIlIIIIIII.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIlllllIlIl() {
        llIlIlllIIIl = new String[llIlIlllIIlI[3]];
        l.llIlIlllIIIl[l.llIlIlllIIlI[0]] = l.lIIIIIlllllIIll("wpbshL789AK6RgwxJDmONw==", "OQivb");
        l.llIlIlllIIIl[l.llIlIlllIIlI[2]] = l.lIIIIIlllllIlII("PdycYyYqJ4U=", "lyjKA");
    }

    @Inject
    public l(a a2) {
        this.aa = a2;
    }

    private static boolean lIIIIIllllllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlllllIlll(int n2) {
        return n2 == 0;
    }
}

