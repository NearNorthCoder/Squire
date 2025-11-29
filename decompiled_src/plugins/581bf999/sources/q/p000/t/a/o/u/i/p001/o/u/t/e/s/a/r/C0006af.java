package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking potion", priority = 200)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.af  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/af.class */
public class C0006af extends Z {
    private final /* synthetic */ C cI;
    private static /* synthetic */ String[] llIlIIIIIll;
    private static /* synthetic */ int[] llIlIIIIlII;
    private final /* synthetic */ SquireAutoTOA cJ;

    private static boolean lIlIIlIIIlllll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIlIIIlllII(int i) {
        return i == 0;
    }

    private static boolean lIlIIlIIIlllIl(int i) {
        return i > 0;
    }

    private static boolean lIlIIlIIlIIIII(Object obj) {
        return obj != null;
    }

    private static void lIlIIlIIIllIIl() {
        llIlIIIIIll = new String[llIlIIIIlII[2]];
        llIlIIIIIll[llIlIIIIlII[0]] = lIlIIlIIIllIII("DfgbKQTBUZo=", "pueqE");
    }

    static {
        lIlIIlIIIllIlI();
        lIlIIlIIIllIIl();
    }

    private static String lIlIIlIIIllIII(String llllllllllllllllIIlllIIIlIIIllll, String llllllllllllllllIIlllIIIlIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIIIlIIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIIIlIIlIIIl.init(llIlIIIIlII[3], secretKeySpec);
            return new String(llllllllllllllllIIlllIIIlIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIIIlIIlIIII) {
            llllllllllllllllIIlllIIIlIIlIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    public boolean run() {
        if (!lIlIIlIIIllIll(this.cJ.e() ? 1 : 0) && !lIlIIlIIIlllII(bc() ? 1 : 0) && !lIlIIlIIIlllIl(Vars.getBit(llIlIIIIlII[1])) && !lIlIIlIIIlllII(this.cI.am() ? 1 : 0)) {
            EnumC0000a[] a = EnumC0000a.a(Equipment.fromSlot(EquipmentInventorySlot.WEAPON));
            int length = a.length;
            int i = llIlIIIIlII[0];
            while (lIlIIlIIIllllI(i, length)) {
                EnumC0000a enumC0000a = a[i];
                Skill[] m = enumC0000a.m();
                int length2 = m.length;
                int i2 = llIlIIIIlII[0];
                while (lIlIIlIIIllllI(i2, length2)) {
                    Skill skill = m[i2];
                    if (lIlIIlIIIlllll(Skills.getLevel(skill) + ((int) (0.5d * enumC0000a.a(skill))), Skills.getBoostedLevel(skill))) {
                        Item first = Inventory.getFirst(item -> {
                            return item.getName().startsWith(enumC0000a.l());
                        });
                        if (lIlIIlIIlIIIII(first)) {
                            first.interact(llIlIIIIIll[llIlIIIIlII[0]]);
                            this.cI.ao();
                            return llIlIIIIlII[2];
                        }
                    }
                    i2++;
                    "".length();
                    if (((((86 + 52) - 39) + 70) ^ (((22 + 94) - (-37)) + 20)) <= 0) {
                        return ((((124 + 113) - 98) + 22) ^ (((50 + 107) - 78) + 69)) & (((167 ^ 133) ^ (33 ^ 54)) ^ (-" ".length()));
                    }
                }
                i++;
                "".length();
                if (((161 ^ 139) & ((40 ^ 2) ^ (-1))) < 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            return llIlIIIIlII[0];
        }
        return llIlIIIIlII[0];
    }

    @Inject
    protected C0006af(Client client, C c, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cI = c;
        this.cJ = squireAutoTOA;
    }

    private static void lIlIIlIIIllIlI() {
        llIlIIIIlII = new int[4];
        llIlIIIIlII[0] = (3 ^ 70) & ((96 ^ 37) ^ (-1));
        llIlIIIIlII[1] = (-((-12329) & 29755)) & (-326) & 32095;
        llIlIIIIlII[2] = " ".length();
        llIlIIIIlII[3] = "  ".length();
    }

    private static boolean lIlIIlIIIllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIlIIIllIll(int i) {
        return i != 0;
    }
}
