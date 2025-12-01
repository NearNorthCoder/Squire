package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.movement.pathfinder.model.poh.HousePortal;
import net.unethicalite.api.movement.pathfinder.model.poh.JewelryBox;
import net.unethicalite.client.managers.RegionManager;
@TaskDesc(name = "Grab teleport to GE", priority = 18337, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.R  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/R.class */
public class R extends S {
    private static /* synthetic */ int[] llllIIIlIIlI;
    private static /* synthetic */ String[] llllIIIlIIII;

    private static String lIIIlllIlllIlIl(String lllllllllllllllIIllIIIIIIIlllllI, String lllllllllllllllIIllIIIIIIIllllll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIIIllllll.getBytes(StandardCharsets.UTF_8)), llllIIIlIIlI[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIlIIlI[4], lllllllllllllllIIllIIIIIIlIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIIIIlIIIIIl) {
            lllllllllllllllIIllIIIIIIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIlllllIl(int i) {
        return i == 0;
    }

    private static boolean lIIIlllIllllllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.S
    public boolean ci() {
        if (lIIIlllIllllIll(cn() ? 1 : 0)) {
            return llllIIIlIIlI[0];
        }
        Player local = Players.getLocal();
        if (!lIIIlllIlllllII(local) && !lIIIlllIlllllIl(Movement.shouldWalk() ? 1 : 0) && !lIIIlllIllllIll(Inventory.contains(ck()) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIIIlllIllllllI(nearest.getArea().distanceTo(local.getWorldLocation()), llllIIIlIIlI[1])) {
                Movement.walkTo(nearest.getArea().getCenter());
                "".length();
                return llllIIIlIIlI[2];
            } else if (lIIIlllIlllllIl(Bank.isOpen() ? 1 : 0)) {
                return Bank.open();
            } else {
                if (!lIIIlllIlllllIl(Bank.contains(ck()) ? 1 : 0)) {
                    Bank.withdraw(ck(), llllIIIlIIlI[2], Bank.WithdrawMode.ITEM);
                    return llllIIIlIIlI[2];
                }
                Log.info(llllIIIlIIII[llllIIIlIIlI[0]]);
                String str = llllIIIlIIII[llllIIIlIIlI[2]];
                Object[] objArr = new Object[llllIIIlIIlI[2]];
                objArr[llllIIIlIIlI[0]] = Boolean.valueOf(cj());
                Log.info(str, objArr);
                this.cW.forceStop();
                return llllIIIlIIlI[2];
            }
        }
        return llllIIIlIIlI[0];
    }

    private static boolean lIIIlllIlllllII(Object obj) {
        return obj == null;
    }

    private static boolean lIIIllllIIIIIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIlllIlllllll(int i, int i2) {
        return i != i2;
    }

    static {
        lIIIlllIllllIlI();
        lIIIlllIllllIIl();
    }

    private static void lIIIlllIllllIlI() {
        llllIIIlIIlI = new int[13];
        llllIIIlIIlI[0] = ((78 ^ 108) ^ (122 ^ 73)) & (((((119 + 17) - (-26)) + 6) ^ (((95 + 171) - 125) + 44)) ^ (-" ".length()));
        llllIIIlIIlI[1] = 44 ^ 32;
        llllIIIlIIlI[2] = " ".length();
        llllIIIlIIlI[3] = (-24577) & 32583;
        llllIIIlIIlI[4] = "  ".length();
        llllIIIlIIlI[5] = "   ".length();
        llllIIIlIIlI[6] = (-6403) & 16191;
        llllIIIlIIlI[7] = (-16833) & 26622;
        llllIIIlIIlI[8] = (-3090) & 16369;
        llllIIIlIIlI[9] = (-((-30621) & 32702)) & (-16641) & 32063;
        llllIIIlIIlI[10] = (-((-11877) & 28263)) & (-33) & 24431;
        llllIIIlIIlI[11] = 198 ^ 194;
        llllIIIlIIlI[12] = (((37 + 164) - 200) + 175) ^ (((92 + 15) - (-68)) + 9);
    }

    private static String lIIIlllIlllIllI(String lllllllllllllllIIllIIIIIIlIIllIl, String lllllllllllllllIIllIIIIIIlIIllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIIIIlIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIIIIlIIllll.init(llllIIIlIIlI[4], lllllllllllllllIIllIIIIIIlIlIIII);
            return new String(lllllllllllllllIIllIIIIIIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIIIIlIIlllI) {
            lllllllllllllllIIllIIIIIIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlllIllllIIl() {
        llllIIIlIIII = new String[llllIIIlIIlI[11]];
        llllIIIlIIII[llllIIIlIIlI[0]] = lIIIlllIlllIlIl("frCZBexMdjXj+/GSWVXXfjEAt1FhEy7iDPF+7FzzRPI3irXZ0ha28z0wWtRAOt8b2GMktYjNtLCqqHEyxr2wLg==", "KSXnP");
        llllIIIlIIII[llllIIIlIIlI[2]] = lIIIlllIlllIllI("jc1hCfnu83Aas466FNk5whoDIQsZEekjEG6uEZMaDl6KMLEPJFheQQ==", "srQIk");
        llllIIIlIIII[llllIIIlIIlI[4]] = lIIIlllIlllIlIl("wFgMLp9wPtux5DHr2V9UmNFKy1ZmB+Hz", "OjLXx");
        llllIIIlIIII[llllIIIlIIlI[5]] = lIIIlllIlllIlIl("1h4L2FS/2bggfoJxK8p7DPAAJ3Zmgm2G", "mECrt");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean cj() {
        if (lIIIlllIlllllIl(RegionManager.hasJewelryBox().equals(JewelryBox.ORNATE) ? 1 : 0) && lIIIlllIlllllIl(RegionManager.hasMountedGlory() ? 1 : 0) && !lIIIlllIllllIll(RegionManager.getHousePortals().contains(HousePortal.VARROCK) ? 1 : 0)) {
            return llllIIIlIIlI[0];
        }
        ?? r0 = llllIIIlIIlI[2];
        "".length();
        return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static boolean lIIIlllIllllIll(int i) {
        return i != 0;
    }

    private Predicate<Item> ck() {
        return lIIIlllIllllIll(cj() ? 1 : 0) ? item -> {
            if (lIIIlllIlllllll(item.getId(), llllIIIlIIlI[6]) && lIIIlllIlllllll(item.getId(), llllIIIlIIlI[7]) && lIIIlllIlllllll(item.getId(), llllIIIlIIlI[8]) && lIIIlllIlllllll(item.getId(), llllIIIlIIlI[9]) && !lIIIllllIIIIIII(item.getId(), llllIIIlIIlI[10])) {
                return llllIIIlIIlI[0];
            }
            ?? r0 = llllIIIlIIlI[2];
            "".length();
            return 0 != 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
        } : item2 -> {
            if (lIIIlllIlllllll(item2.getId(), llllIIIlIIlI[3]) && lIIIlllIlllllIl(item2.getName().contains(llllIIIlIIII[llllIIIlIIlI[4]]) ? 1 : 0) && !lIIIlllIllllIll(item2.getName().contains(llllIIIlIIII[llllIIIlIIlI[5]]) ? 1 : 0)) {
                return llllIIIlIIlI[0];
            }
            ?? r0 = llllIIIlIIlI[2];
            "".length();
            return (102 ^ 98) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        };
    }

    @Inject
    protected R(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }
}
