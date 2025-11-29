package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
@Singleton
@TaskDesc(name = "Attacking kephri", priority = 10, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aZ  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aZ.class */
public class aZ extends AbstractC0035bh {
    private static /* synthetic */ String[] lIllIlIIlll;
    private /* synthetic */ boolean eB;
    private /* synthetic */ int ec;
    private static /* synthetic */ int[] lIllIlIlIIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIlIlllIIlIII(chatMessage.getMessage().contains(lIllIlIIlll[lIllIlIlIIl[0]]) ? 1 : 0) && lIIlIlllIIlIIl(this.cu.getTickCount() - this.ec, lIllIlIlIIl[1])) {
            this.eB = lIllIlIlIIl[2];
        }
        if (lIIlIlllIIlIII(chatMessage.getMessage().contains(lIllIlIIlll[lIllIlIlIIl[2]]) ? 1 : 0)) {
            this.eB = lIllIlIlIIl[0];
        }
    }

    static {
        lIIlIlllIIIlll();
        lIIlIlllIIIIlI();
    }

    private static String lIIlIlllIIIIII(String llllllllllllllllIlIlIIIllIlllllI, String llllllllllllllllIlIlIIIllIllllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIIllIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIlIlIIIllIlllIll = llllllllllllllllIlIlIIIllIllllIl.toCharArray();
        int llllllllllllllllIlIlIIIllIlllIlI = lIllIlIlIIl[0];
        char[] charArray = str.toCharArray();
        int llllllllllllllllIlIlIIIllIllIIll = charArray.length;
        int i = lIllIlIlIIl[0];
        while (lIIlIlllIIlIIl(i, llllllllllllllllIlIlIIIllIllIIll)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllIlIlIIIllIlllIll[llllllllllllllllIlIlIIIllIlllIlI % llllllllllllllllIlIlIIIllIlllIll.length]));
            "".length();
            llllllllllllllllIlIlIIIllIlllIlI++;
            i++;
            "".length();
            if (((134 ^ 158) ^ (159 ^ 131)) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIlIlllIIIIIl(String llllllllllllllllIlIlIIIllIlIlIIl, String llllllllllllllllIlIlIIIllIlIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIllIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIlIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIllIlIlIlI) {
            llllllllllllllllIlIlIIIllIlIlIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected aZ(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig, EnumC0036bi.ATTACK);
    }

    private static void lIIlIlllIIIlll() {
        lIllIlIlIIl = new int[7];
        lIllIlIlIIl[0] = (85 ^ 94) & ((135 ^ 140) ^ (-1));
        lIllIlIlIIl[1] = 107 ^ 110;
        lIllIlIlIIl[2] = " ".length();
        lIllIlIlIIl[3] = "  ".length();
        lIllIlIlIIl[4] = "   ".length();
        lIllIlIlIIl[5] = (250 ^ 167) ^ (86 ^ 15);
        lIllIlIlIIl[6] = (9 ^ 47) ^ (87 ^ 121);
    }

    private static boolean lIIlIlllIIlIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.ec = lIllIlIlIIl[0];
        this.eB = lIllIlIlIIl[0];
        f((boolean) lIllIlIlIIl[0]);
    }

    private static boolean lIIlIlllIIlIII(int i) {
        return i != 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return lIIlIlllIIlIII(this.eB ? 1 : 0) ? lIIlIlllIIlIII(this.cW.butterfly() ? 1 : 0) ? this.cW.mageGearAkkha() : this.cW.rangeGearAkkha() : super.br();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bq() {
        return this.eB;
    }

    private static String lIIlIllIllllll(String llllllllllllllllIlIlIIIllIIllIlI, String llllllllllllllllIlIlIIIllIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIllIIllIll.getBytes(StandardCharsets.UTF_8)), lIllIlIlIIl[6]), "DES");
            Cipher llllllllllllllllIlIlIIIllIIllllI = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIllIIllllI.init(lIllIlIlIIl[3], secretKeySpec);
            return new String(llllllllllllllllIlIlIIIllIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIllIIlllIl) {
            llllllllllllllllIlIlIIIllIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlllIIllII(Object obj) {
        return obj == null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.kephriSpecialGear();
    }

    private static void lIIlIlllIIIIlI() {
        lIllIlIIlll = new String[lIllIlIlIIl[5]];
        lIllIlIIlll[lIllIlIlIIl[0]] = lIIlIllIllllll("DIRTJGe/FQw=", "koiGx");
        lIllIlIIlll[lIllIlIlIIl[2]] = lIIlIlllIIIIII("ETcZHSETdgQeZBQ5HQEoEiIV", "wVpqD");
        lIllIlIIlll[lIllIlIlIIl[3]] = lIIlIllIllllll("2AqhooSJKCg=", "VUmXT");
        lIllIlIIlll[lIllIlIlIIl[4]] = lIIlIlllIIIIIl("MS63M0J1Qsg=", "dBdjp");
    }

    private static boolean lIIlIlllIIlIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh
    protected boolean bL() {
        Player local = Players.getLocal();
        Actor interacting = local.getInteracting();
        if (lIIlIlllIIlIlI(interacting) && lIIlIlllIIlIll(interacting.getName().contains(lIllIlIIlll[lIllIlIlIIl[3]]) ? 1 : 0)) {
            return lIllIlIlIIl[0];
        }
        NPC bO = bO();
        if (lIIlIlllIIllII(bO)) {
            this.eB = lIllIlIlIIl[0];
            return lIllIlIlIIl[0];
        } else if (!lIIlIlllIIlIll(bR() ? 1 : 0) || lIIlIlllIIlIII(bV() ? 1 : 0)) {
            return lIllIlIlIIl[0];
        } else {
            if (lIIlIlllIIlIII(bO.getWorldArea().isInMeleeDistance(local.getWorldLocation()) ? 1 : 0)) {
                this.eB = lIllIlIlIIl[0];
            }
            a(bO, (boolean) lIllIlIlIIl[2]);
            "".length();
            bO.interact(lIllIlIIlll[lIllIlIlIIl[4]]);
            this.aY.c();
            this.ec = this.cu.getTickCount();
            return lIllIlIlIIl[2];
        }
    }
}
