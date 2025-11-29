/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Necromancy
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.C;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

@TaskDesc(name="Summon Thrall", priority=150, register=true)
public class aa
extends C {
    private static /* synthetic */ int[] llllIlIIIIll;
    /* synthetic */ boolean dC;
    /* synthetic */ boolean dD;
    private static /* synthetic */ String[] llllIlIIIIlI;

    private static boolean lIIlIIIIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIIIIllIIll(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    protected aa(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
        this.dC = llllIlIIIIll[0];
        this.dD = llllIlIIIIll[0];
    }

    private static boolean lIIlIIIIIlIllll(int n2) {
        return n2 != 0;
    }

    private static void lIIlIIIIIlIllIl() {
        llllIlIIIIll = new int[9];
        aa.llllIlIIIIll[0] = " ".length();
        aa.llllIlIIIIll[1] = (0x66 ^ 0x5D) & ~(0x60 ^ 0x5B);
        aa.llllIlIIIIll[2] = 36 + 30 - -11 + 81 ^ 124 + 0 - 55 + 98;
        aa.llllIlIIIIll[3] = "  ".length();
        aa.llllIlIIIIll[4] = 0x7D ^ 0x19;
        aa.llllIlIIIIll[5] = 0x9C ^ 0x9A;
        aa.llllIlIIIIll[6] = -(0xFFFFADBF & 0x5743) & (0xFFFFBDFF & 0x777F);
        aa.llllIlIIIIll[7] = -(45 + 73 - 88 + 100) & (0xFFFFBFEF & 0x6FFB);
        aa.llllIlIIIIll[8] = 0x24 ^ 0x2C;
    }

    static {
        aa.lIIlIIIIIlIllIl();
        aa.lIIlIIIIIlIllII();
    }

    private static boolean lIIlIIIIIllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIIIlIlllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        void lllllllllllllllIIlIllIlllIIlIIlI;
        if (aa.lIIlIIIIIllIIIl(varbitChanged.getVarbitId(), llllIlIIIIll[6]) && aa.lIIlIIIIIllIIll(varbitChanged.getValue(), llllIlIIIIll[0])) {
            this.dC = llllIlIIIIll[0];
        }
        if (aa.lIIlIIIIIllIIIl(lllllllllllllllIIlIllIlllIIlIIlI.getVarbitId(), llllIlIIIIll[7]) && aa.lIIlIIIIIllIIll(lllllllllllllllIIlIllIlllIIlIIlI.getValue(), llllIlIIIIll[0])) {
            lllllllllllllllIIlIllIlllIIlIIll.dD = llllIlIIIIll[0];
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        aa lllllllllllllllIIlIllIlllIIllIll;
        void lllllllllllllllIIlIllIlllIIllIlI;
        NPC nPC = SquireNightmarePlugin.d();
        if (aa.lIIlIIIIIlIlllI(nPC)) {
            return llllIlIIIIll[1];
        }
        String[] stringArray = new String[llllIlIIIIll[0]];
        stringArray[aa.llllIlIIIIll[1]] = llllIlIIIIlI[llllIlIIIIll[1]];
        if (aa.lIIlIIIIIlIllll(lllllllllllllllIIlIllIlllIIllIlI.hasAction(stringArray) ? 1 : 0)) {
            lllllllllllllllIIlIllIlllIIllIll.dC = llllIlIIIIll[0];
            lllllllllllllllIIlIllIlllIIllIll.dD = llllIlIIIIll[0];
        }
        String[] stringArray2 = new String[llllIlIIIIll[0]];
        stringArray2[aa.llllIlIIIIll[1]] = llllIlIIIIlI[llllIlIIIIll[0]];
        if (aa.lIIlIIIIIllIIII(lllllllllllllllIIlIllIlllIIllIlI.hasAction(stringArray2) ? 1 : 0)) {
            return llllIlIIIIll[1];
        }
        SpellBook.Necromancy lllllllllllllllIIlIllIlllIIllIIl = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (aa.lIIlIIIIIlIllll(lllllllllllllllIIlIllIlllIIllIll.cp() ? 1 : 0) && aa.lIIlIIIIIlIllll(lllllllllllllllIIlIllIlllIIllIll.dC ? 1 : 0)) {
            Magic.cast((Spell)lllllllllllllllIIlIllIlllIIllIIl, (int)llllIlIIIIll[1], (int)llllIlIIIIll[2]);
            lllllllllllllllIIlIllIlllIIllIll.dC = llllIlIIIIll[1];
            lllllllllllllllIIlIllIlllIIllIll.sleep(llllIlIIIIll[3]);
            return llllIlIIIIll[0];
        }
        if (aa.lIIlIIIIIllIIII(lllllllllllllllIIlIllIlllIIllIll.cQ ? 1 : 0) && aa.lIIlIIIIIllIIII(lllllllllllllllIIlIllIlllIIllIll.cR ? 1 : 0)) {
            return llllIlIIIIll[1];
        }
        if (aa.lIIlIIIIIllIIIl(Combat.getSpecEnergy(), llllIlIIIIll[4])) {
            return llllIlIIIIll[1];
        }
        SpellBook.Necromancy lllllllllllllllIIlIllIlllIIllIII = SpellBook.Necromancy.DEATH_CHARGE;
        if (aa.lIIlIIIIIlIllll(lllllllllllllllIIlIllIlllIIllIII.canCast() ? 1 : 0) && aa.lIIlIIIIIlIllll(lllllllllllllllIIlIllIlllIIllIll.dD ? 1 : 0)) {
            Magic.cast((Spell)lllllllllllllllIIlIllIlllIIllIII, (int)llllIlIIIIll[1], (int)llllIlIIIIll[2]);
            lllllllllllllllIIlIllIlllIIllIll.dD = llllIlIIIIll[1];
            return llllIlIIIIll[0];
        }
        return llllIlIIIIll[1];
    }

    private boolean cp() {
        int n2;
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (aa.lIIlIIIIIlIllll(necromancy.canCast() ? 1 : 0) && aa.lIIlIIIIIllIIlI(Skills.getBoostedLevel((Skill)Skill.PRAYER), llllIlIIIIll[5])) {
            n2 = llllIlIIIIll[0];
            "".length();
            if (" ".length() >= (0x3B ^ 0x3F)) {
                return ((0x29 ^ 0x14) & ~(0x38 ^ 5)) != 0;
            }
        } else {
            n2 = llllIlIIIIll[1];
        }
        return n2 != 0;
    }

    private static String lIIlIIIIIlIlIll(String lllllllllllllllIIlIllIlllIIIlIlI, String lllllllllllllllIIlIllIlllIIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlllIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlllIIIIlll.getBytes(StandardCharsets.UTF_8)), llllIlIIIIll[8]), "DES");
            Cipher lllllllllllllllIIlIllIlllIIIllII = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIlllIIIllII.init(llllIlIIIIll[3], lllllllllllllllIIlIllIlllIIIllIl);
            return new String(lllllllllllllllIIlIllIlllIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIlllIIIlIll) {
            lllllllllllllllIIlIllIlllIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIIllIIII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIIIlIllII() {
        llllIlIIIIlI = new String[llllIlIIIIll[3]];
        aa.llllIlIIIIlI[aa.llllIlIIIIll[1]] = aa.lIIlIIIIIlIlIll("7XGaN6QU2j4=", "wgRsO");
        aa.llllIlIIIIlI[aa.llllIlIIIIll[0]] = aa.lIIlIIIIIlIlIll("W60yO5H166I=", "KSkPG");
    }
}

