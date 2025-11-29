package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.ExperienceGained;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Mining", register = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.s  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/s.class */
public class C0018s extends Task {
    private /* synthetic */ boolean C;
    private static /* synthetic */ String[] lllllIllIIIl;
    private final /* synthetic */ int[] z;
    private /* synthetic */ int A;
    private static /* synthetic */ int[] lllllIllIIlI;
    private /* synthetic */ boolean B;
    private final /* synthetic */ SquireMinerConfig y;
    private final /* synthetic */ SquireMiner x;

    private static boolean lIIlIIllllllIll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIlIIllllllIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIIlllllIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIIlllllllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private WorldPoint s() {
        return Players.getLocal().getWorldLocation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIIlIIlllllIlII(message.contains(lllllIllIIIl[lllllIllIIlI[27]]) ? 1 : 0)) {
            this.B = lllllIllIIlI[3];
            if (lIIlIIlllllIlII(Movement.isRunEnabled() ? 1 : 0)) {
                sleep(lllllIllIIlI[3]);
                "".length();
                if ((((((158 + 108) - 91) + 68) ^ (((35 + 114) - 76) + 96)) & (((((176 + 177) - 235) + 122) ^ (((66 + 74) - 35) + 65)) ^ (-" ".length()))) < 0) {
                    return;
                }
            } else {
                sleep(lllllIllIIlI[5]);
            }
        }
        if (lIIlIIlllllIlII(message.contains(lllllIllIIIl[lllllIllIIlI[28]]) ? 1 : 0)) {
            this.C = lllllIllIIlI[1];
        }
        if (lIIlIIlllllIlII(message.contains(lllllIllIIIl[lllllIllIIlI[29]]) ? 1 : 0)) {
            this.C = lllllIllIIlI[3];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v119, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v127, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v131, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v135, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v146, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v175, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v177, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v90, types: [boolean] */
    public boolean run() {
        if (lIIlIIlllllIIll(this.y.activity(), EnumC0000a.GRANITE)) {
            return lllllIllIIlI[1];
        }
        if (lIIlIIlllllIlII(this.y.waterskins()) && lIIlIIlllllIlIl(Inventory.contains(this.z) ? 1 : 0)) {
            int[] iArr = new int[lllllIllIIlI[3]];
            iArr[lllllIllIIlI[1]] = lllllIllIIlI[9];
            if (lIIlIIlllllIlIl(Equipment.contains(iArr) ? 1 : 0)) {
                System.out.println(lllllIllIIIl[lllllIllIIlI[1]]);
                return lllllIllIIlI[1];
            }
        }
        int[] iArr2 = new int[lllllIllIIlI[3]];
        iArr2[lllllIllIIlI[1]] = lllllIllIIlI[2];
        if (lIIlIIlllllIllI(Inventory.getCount(iArr2), this.y.waterskins())) {
            int[] iArr3 = new int[lllllIllIIlI[3]];
            iArr3[lllllIllIIlI[1]] = lllllIllIIlI[2];
            Inventory.getFirst(iArr3).interact(lllllIllIIIl[lllllIllIIlI[3]]);
            return lllllIllIIlI[3];
        }
        if (lIIlIIlllllIlll(Inventory.getFreeSlots(), lllllIllIIlI[5]) && lIIlIIlllllIlII(Inventory.contains(item -> {
            return item.getName().contains(lllllIllIIIl[lllllIllIIlI[30]]);
        }) ? 1 : 0)) {
            Inventory.dropAll(item2 -> {
                return item2.getName().contains(lllllIllIIIl[lllllIllIIlI[10]]);
            });
            "".length();
        }
        if (lIIlIIlllllIlIl(Movement.isRunEnabled() ? 1 : 0) && lIIlIIlllllIllI(Movement.getRunEnergy(), lllllIllIIlI[10])) {
            Movement.toggleRun();
            return lllllIllIIlI[3];
        } else if (lIIlIIlllllIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lllllIllIIlI[1];
        } else {
            Player local = Players.getLocal();
            if (lIIlIIllllllIII(local)) {
                return lllllIllIIlI[1];
            }
            if (lIIlIIllllllIIl(this.A, lllllIllIIlI[11]) && lIIlIIlllllIlll(local.distanceTo(EnumC0002c.SOUTH_FOUR.d()), lllllIllIIlI[12])) {
                Log.info(lllllIllIIIl[lllllIllIIlI[5]]);
                this.C = lllllIllIIlI[3];
            }
            if (!lIIlIIlllllIlIl(Inventory.isFull() ? 1 : 0) || (lIIlIIlllllIlII(local.isAnimating() ? 1 : 0) && lIIlIIlllllIlIl(a(local) ? 1 : 0))) {
                return lllllIllIIlI[1];
            }
            WorldPoint worldPoint = new WorldPoint(lllllIllIIlI[13], lllllIllIIlI[14], lllllIllIIlI[1]);
            int[] iArr4 = new int[lllllIllIIlI[3]];
            iArr4[lllllIllIIlI[1]] = lllllIllIIlI[15];
            List at = TileObjects.getAt(worldPoint, iArr4);
            WorldPoint worldPoint2 = new WorldPoint(lllllIllIIlI[13], lllllIllIIlI[16], lllllIllIIlI[1]);
            int[] iArr5 = new int[lllllIllIIlI[3]];
            iArr5[lllllIllIIlI[1]] = lllllIllIIlI[15];
            List at2 = TileObjects.getAt(worldPoint2, iArr5);
            WorldPoint worldPoint3 = new WorldPoint(lllllIllIIlI[13], lllllIllIIlI[17], lllllIllIIlI[1]);
            int[] iArr6 = new int[lllllIllIIlI[3]];
            iArr6[lllllIllIIlI[1]] = lllllIllIIlI[15];
            List at3 = TileObjects.getAt(worldPoint3, iArr6);
            WorldPoint worldPoint4 = new WorldPoint(lllllIllIIlI[18], lllllIllIIlI[19], lllllIllIIlI[1]);
            int[] iArr7 = new int[lllllIllIIlI[3]];
            iArr7[lllllIllIIlI[1]] = lllllIllIIlI[15];
            List at4 = TileObjects.getAt(worldPoint4, iArr7);
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIIlIIllllllIlI(tileObject.getId(), lllllIllIIlI[15]) && lIIlIIlllllIlII(EnumC0002c.SOUTH_FOUR.a(tileObject.getWorldLocation()) ? 1 : 0)) {
                    ?? r0 = lllllIllIIlI[3];
                    "".length();
                    return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllllIllIIlI[1];
            });
            if (lIIlIIllllllIII(nearest)) {
                Movement.walkTo(new WorldPoint(lllllIllIIlI[20], lllllIllIIlI[21], lllllIllIIlI[1]));
                "".length();
                return lllllIllIIlI[3];
            } else if (lIIlIIlllllIlIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Movement.walkTo(new WorldPoint(lllllIllIIlI[20], lllllIllIIlI[21], lllllIllIIlI[1]));
                "".length();
                return lllllIllIIlI[3];
            } else if (lIIlIIlllllIlII(this.C ? 1 : 0) && lIIlIIlllllIlII(Players.getLocal().isAnimating() ? 1 : 0)) {
                return lllllIllIIlI[1];
            } else {
                WorldPoint worldPoint5 = new WorldPoint(lllllIllIIlI[22], lllllIllIIlI[14], lllllIllIIlI[1]);
                if ((lIIlIIlllllIlII(s().equals(worldPoint5) ? 1 : 0) && !lIIlIIlllllIlIl(this.B ? 1 : 0)) || !lIIlIIlllllIlIl(this.C ? 1 : 0) || lIIlIIlllllIllI(worldPoint5.distanceTo2D(s()), lllllIllIIlI[11])) {
                    sleep(lllllIllIIlI[23]);
                    this.B = lllllIllIIlI[1];
                    this.x.a();
                    ((TileObject) at2.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[7]]);
                    return lllllIllIIlI[1];
                } else if (lIIlIIlllllIlII(s().equals(new WorldPoint(lllllIllIIlI[22], lllllIllIIlI[16], lllllIllIIlI[1])) ? 1 : 0) && lIIlIIlllllIlII(this.B ? 1 : 0)) {
                    this.B = lllllIllIIlI[1];
                    this.C = lllllIllIIlI[1];
                    this.x.a();
                    ((TileObject) at3.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[0]]);
                    return lllllIllIIlI[1];
                } else if (lIIlIIlllllIlII(s().equals(new WorldPoint(lllllIllIIlI[22], lllllIllIIlI[17], lllllIllIIlI[1])) ? 1 : 0) && lIIlIIlllllIlII(this.B ? 1 : 0)) {
                    this.B = lllllIllIIlI[1];
                    this.C = lllllIllIIlI[1];
                    this.x.a();
                    ((TileObject) at4.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[23]]);
                    return lllllIllIIlI[1];
                } else if (lIIlIIlllllIlII(s().equals(new WorldPoint(lllllIllIIlI[18], lllllIllIIlI[17], lllllIllIIlI[1])) ? 1 : 0) && lIIlIIlllllIlII(this.B ? 1 : 0)) {
                    this.B = lllllIllIIlI[1];
                    this.C = lllllIllIIlI[1];
                    this.x.a();
                    ((TileObject) at.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[24]]);
                    return lllllIllIIlI[1];
                } else {
                    return lllllIllIIlI[3];
                }
            }
        }
    }

    private static boolean lIIlIIllllllIlI(int i, int i2) {
        return i == i2;
    }

    private static void lIIlIIlllIIlIll() {
        lllllIllIIIl = new String[lllllIllIIlI[11]];
        lllllIllIIIl[lllllIllIIlI[1]] = lIIlIIlllIIlIII("XuFJ5LQCgdlPkoaK43GGzxnHKQHV9okRK95kpgl5Rde/lABNc9QoBQjwAg2MrMmY29OXblVLyTb8LL/UBXCY346BxsgruXLZPdgF6zE3FIY=", "twBUM");
        lllllIllIIIl[lllllIllIIlI[3]] = lIIlIIlllIIlIIl("BiopJA==", "BXFTt");
        lllllIllIIIl[lllllIllIIlI[5]] = lIIlIIlllIIlIIl("GAo+OTQxQ3lqMiwAIS8idQojajB1ESI9fXURKDk0IRckJDZ7", "UcMJQ");
        lllllIllIIIl[lllllIllIIlI[7]] = lIIlIIlllIIlIlI("GvAH7YTRLk4=", "mZSWd");
        lllllIllIIIl[lllllIllIIlI[0]] = lIIlIIlllIIlIlI("HRZCv20C7MY=", "QhXyh");
        lllllIllIIIl[lllllIllIIlI[23]] = lIIlIIlllIIlIlI("l/A/mehUWMs=", "ssFyi");
        lllllIllIIIl[lllllIllIIlI[24]] = lIIlIIlllIIlIII("f7MGKb3GTyw=", "CLWtF");
        lllllIllIIIl[lllllIllIIlI[27]] = lIIlIIlllIIlIII("uAa6CyRuCMYgpdQPTm/oA04siAbsiw5XWqDt6ScqI5OgaMw+wlO1Sw==", "OpFyR");
        lllllIllIIIl[lllllIllIIlI[28]] = lIIlIIlllIIlIIl("CCgQQR4wKQQGFnEzCkECJCYXEwpxNAoMFnEgFwAdODMATw==", "QGeas");
        lllllIllIIIl[lllllIllIIlI[29]] = lIIlIIlllIIlIlI("aD7c7zdeSfD65LzyGW2PiA==", "TxFCZ");
        lllllIllIIIl[lllllIllIIlI[10]] = lIIlIIlllIIlIIl("Dj8xJRs9KA==", "IMPKr");
        lllllIllIIIl[lllllIllIIlI[30]] = lIIlIIlllIIlIlI("gv32LC9opBg=", "dBbyB");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean a(Player player) {
        if (!lIIlIIllllllIlI(player.getAnimation(), lllllIllIIlI[25]) || lIIlIIllllllIll(player.getAnimation(), lllllIllIIlI[26])) {
            ?? r0 = lllllIllIIlI[3];
            "".length();
            return "  ".length() <= 0 ? ((((12 + 64) - (-34)) + 22) ^ (((149 + 136) - 280) + 167)) & (((((133 + 76) - 55) + 30) ^ (((137 + 22) - 122) + 107)) ^ (-" ".length())) : r0;
        }
        return lllllIllIIlI[1];
    }

    private static boolean lIIlIIlllllIlII(int i) {
        return i != 0;
    }

    private static boolean lIIlIIlllllllIl(int i, int i2) {
        return i < i2;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.A += lllllIllIIlI[3];
    }

    private static boolean lIIlIIlllllIllI(int i, int i2) {
        return i > i2;
    }

    private static String lIIlIIlllIIlIlI(String lllllllllllllllIIlIIlIIIlIlIlIll, String lllllllllllllllIIlIIlIIIlIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllIllIIlI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIIIlIlIlllI) {
            lllllllllllllllIIlIIlIIIlIlIlllI.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlllIIlIII(String lllllllllllllllIIlIIlIIIlIlIIIII, String lllllllllllllllIIlIIlIIIlIIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIIlIIlllll.getBytes(StandardCharsets.UTF_8)), lllllIllIIlI[28]), "DES");
            Cipher lllllllllllllllIIlIIlIIIlIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIIIlIlIIIlI.init(lllllIllIIlI[5], lllllllllllllllIIlIIlIIIlIlIIIll);
            return new String(lllllllllllllllIIlIIlIIIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIIIlIlIIIIl) {
            lllllllllllllllIIlIIlIIIlIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlllIIlIIl(String lllllllllllllllIIlIIlIIIlIIIlIll, String lllllllllllllllIIlIIlIIIlIIIllll) {
        String lllllllllllllllIIlIIlIIIlIIIlIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIlIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIlIIIlIIIllll.toCharArray();
        int lllllllllllllllIIlIIlIIIlIIIllII = lllllIllIIlI[1];
        char[] charArray2 = lllllllllllllllIIlIIlIIIlIIIlIll2.toCharArray();
        int lllllllllllllllIIlIIlIIIlIIIIlIl = charArray2.length;
        int i = lllllIllIIlI[1];
        while (lIIlIIlllllllIl(i, lllllllllllllllIIlIIlIIIlIIIIlIl)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIIlIIIlIIIllII % charArray.length]));
            "".length();
            lllllllllllllllIIlIIlIIIlIIIllII++;
            i++;
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIlllllIlIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Inject
    public C0018s(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        int[] iArr = new int[lllllIllIIlI[0]];
        iArr[lllllIllIIlI[1]] = lllllIllIIlI[2];
        iArr[lllllIllIIlI[3]] = lllllIllIIlI[4];
        iArr[lllllIllIIlI[5]] = lllllIllIIlI[6];
        iArr[lllllIllIIlI[7]] = lllllIllIIlI[8];
        this.z = iArr;
        this.A = lllllIllIIlI[1];
        this.C = lllllIllIIlI[3];
        this.x = squireMiner;
        this.y = squireMinerConfig;
    }

    private static boolean lIIlIIlllllIlll(int i, int i2) {
        return i <= i2;
    }

    static {
        lIIlIIlllllIIlI();
        lIIlIIlllIIlIll();
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (lIIlIIlllllllII(experienceGained.getSkill(), Skill.MINING)) {
            this.A = lllllIllIIlI[1];
        }
    }

    private static boolean lIIlIIllllllIII(Object obj) {
        return obj == null;
    }

    private static void lIIlIIlllllIIlI() {
        lllllIllIIlI = new int[31];
        lllllIllIIlI[0] = 73 ^ 77;
        lllllIllIIlI[1] = (145 ^ 128) & ((135 ^ 150) ^ (-1));
        lllllIllIIlI[2] = (-((-8455) & 24903)) & (-4225) & 22495;
        lllllIllIIlI[3] = " ".length();
        lllllIllIIlI[4] = (-18591) & 20415;
        lllllIllIIlI[5] = "  ".length();
        lllllIllIIlI[6] = (-((-6051) & 32695)) & (-201) & 28671;
        lllllIllIIlI[7] = "   ".length();
        lllllIllIIlI[8] = (-28873) & 30701;
        lllllIllIIlI[9] = (-((-30985) & 32175)) & (-4097) & 32255;
        lllllIllIIlI[10] = 101 ^ 111;
        lllllIllIIlI[11] = 1 ^ 13;
        lllllIllIIlI[12] = (((66 + 94) - 35) + 22) ^ (((83 + 26) - 6) + 53);
        lllllIllIIlI[13] = (-24865) & 28029;
        lllllIllIIlI[14] = (-25730) & 28637;
        lllllIllIIlI[15] = (-4865) & 16251;
        lllllIllIIlI[16] = (-((-2909) & 12159)) & (-129) & 12287;
        lllllIllIIlI[17] = (-((-585) & 29290)) & (-1) & 31615;
        lllllIllIIlI[18] = (-" ".length()) & (-801) & 3967;
        lllllIllIIlI[19] = (-((-27291) & 32443)) & (-129) & 8191;
        lllllIllIIlI[20] = (-((-6401) & 23441)) & (-12559) & 32766;
        lllllIllIIlI[21] = (-(25 ^ 6)) & (-24706) & 27647;
        lllllIllIIlI[22] = (-130) & 3295;
        lllllIllIIlI[23] = 76 ^ 73;
        lllllIllIIlI[24] = (((78 + 145) - 169) + 107) ^ (((31 + 49) - 76) + 163);
        lllllIllIIlI[25] = (-9033) & 14281;
        lllllIllIIlI[26] = (-((-18017) & 28536)) & (-4609) & 16375;
        lllllIllIIlI[27] = 66 ^ 69;
        lllllIllIIlI[28] = 52 ^ 60;
        lllllIllIIlI[29] = 190 ^ 183;
        lllllIllIIlI[30] = "   ".length() ^ (204 ^ 196);
    }
}
