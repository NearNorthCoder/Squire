package gg.squire.account;

import com.google.inject.Provides;
import gg.squire.account.GodsApi.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0018e;
import o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0033t;
import o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0034u;
import o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0039z;
import o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.H;
import o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac;
import o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.L;
import o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.V;
import o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aD;
import o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aN;
import org.pf4j.Extension;
@Extension
@PluginDescriptor(name = "Squire Sotf Builder", enabledByDefault = false)
@SquireUtil
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:gg/squire/account/AccBuilderSotf.class */
public class AccBuilderSotf extends Script {
    public static /* synthetic */ long b;
    private static /* synthetic */ int[] llIllIIlII;
    static /* synthetic */ int n;
    private static /* synthetic */ String[] llIllIIIll;
    @Inject
    public /* synthetic */ BuilderConfig p;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ String k;
    @Inject
    private /* synthetic */ OverlayManager u;

    /* renamed from: o  reason: collision with root package name */
    private static /* synthetic */ InterfaceC0003ac[] f2o;
    public static /* synthetic */ long g;
    /* synthetic */ boolean s;
    @Inject
    private /* synthetic */ Client t;
    public static /* synthetic */ String l;
    public static /* synthetic */ String c;
    public static /* synthetic */ int f;
    public static /* synthetic */ boolean d;
    public static /* synthetic */ List<InterfaceC0003ac> a;
    public static /* synthetic */ String h;
    @Inject
    private /* synthetic */ BuilderInfoBox v;
    public static /* synthetic */ String m;
    public static /* synthetic */ String j;
    /* synthetic */ WorldArea q = new WorldArea(llIllIIlII[0], llIllIIlII[1], llIllIIlII[2], llIllIIlII[3], llIllIIlII[4]);
    /* synthetic */ String r = llIllIIIll[llIllIIlII[4]];

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
        if (lIllIlIlllllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    @Subscribe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(GameTick gameTick) {
        C0018e.y();
        int wildyLevel = Game.getWildyLevel();
        Player local = Players.getLocal();
        int combatLevel = local.getCombatLevel();
        if (lIllIlIllllII(Players.getNearest(player -> {
            if (lIllIllIIIlIl(player, local) && lIllIlIlllllI(a(wildyLevel, combatLevel, player) ? 1 : 0)) {
                ?? r0 = llIllIIlII[5];
                "".length();
                return ((7 ^ 77) ^ (5 ^ 75)) < " ".length() ? ((203 ^ 191) ^ (118 ^ 50)) & (((146 ^ 138) ^ (65 ^ 105)) ^ (-" ".length())) : r0;
            }
            return llIllIIlII[4];
        })) && (!lIllIllIIIIlI(Game.getWildyLevel()) || lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(aD.pf), llIllIIlII[18]))) {
            int[] iArr = new int[llIllIIlII[5]];
            iArr[llIllIIlII[4]] = llIllIIlII[19];
            if (lIllIlIlllIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIllIIlII[5]];
                iArr2[llIllIIlII[4]] = llIllIIlII[20];
            }
            if (lIllIlIlllIll(this.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (lIllIlIllllll(Vars.getBit(QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), llIllIIlII[21])) {
            String[] strArr = new String[llIllIIlII[5]];
            strArr[llIllIIlII[4]] = llIllIIIll[llIllIIlII[22]];
            if (lIllIlIllllII(NPCs.getNearest(strArr))) {
                int[] iArr3 = new int[llIllIIlII[5]];
                iArr3[llIllIIlII[4]] = llIllIIlII[23];
                if (lIllIlIllllII(NPCs.getNearest(iArr3))) {
                    int[] iArr4 = new int[llIllIIlII[5]];
                    iArr4[llIllIIlII[4]] = llIllIIlII[23];
                    if (lIllIlIlllIll(NPCs.getNearest(iArr4).isDead() ? 1 : 0)) {
                        c = llIllIIIll[llIllIIlII[24]];
                        int[] iArr5 = new int[llIllIIlII[5]];
                        iArr5[llIllIIlII[4]] = llIllIIlII[25];
                        if (lIllIlIlllIll(Equipment.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIllIIlII[5]];
                            iArr6[llIllIIlII[4]] = llIllIIlII[25];
                            Inventory.getFirst(iArr6).interact(llIllIIIll[llIllIIlII[26]]);
                        }
                        int[] iArr7 = new int[llIllIIlII[5]];
                        iArr7[llIllIIlII[4]] = llIllIIlII[25];
                        if (lIllIlIlllllI(Equipment.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[llIllIIlII[5]];
                            iArr8[llIllIIlII[4]] = llIllIIlII[23];
                            NPCs.getNearest(iArr8).interact(llIllIIIll[llIllIIlII[27]]);
                            Movement.walkTo(new WorldPoint(L.gn.getX() - llIllIIlII[11], L.gn.getY() + llIllIIlII[11], llIllIIlII[4]));
                            "".length();
                        }
                    }
                }
                if (lIllIlIlllllI(i.containsKey(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIllIlIlllllI(L.gm ? 1 : 0)) {
                        String[] strArr2 = new String[llIllIIlII[5]];
                        strArr2[llIllIIlII[4]] = llIllIIIll[llIllIIlII[28]];
                        WorldPoint worldLocation = NPCs.getNearest(strArr2).getWorldLocation();
                        WorldPoint worldPoint = new WorldPoint(worldLocation.getX(), worldLocation.getY() + llIllIIlII[5], worldLocation.getPlane());
                        WorldPoint worldPoint2 = new WorldPoint(worldLocation.getX(), worldLocation.getY() - llIllIIlII[5], worldLocation.getPlane());
                        WorldPoint worldPoint3 = new WorldPoint(worldLocation.getX() + llIllIIlII[5], worldLocation.getY(), worldLocation.getPlane());
                        WorldPoint worldPoint4 = new WorldPoint(worldLocation.getX() - llIllIIlII[5], worldLocation.getY(), worldLocation.getPlane());
                        if (lIllIlIlllIll(i.containsKey(worldPoint) ? 1 : 0)) {
                            C0018e.c(worldPoint);
                            Time.sleepTicks(llIllIIlII[5]);
                            "".length();
                            if (lIllIlIllllIl(Players.getLocal().getInteracting())) {
                                String[] strArr3 = new String[llIllIIlII[5]];
                                strArr3[llIllIIlII[4]] = llIllIIIll[llIllIIlII[29]];
                                NPCs.getNearest(strArr3).interact(llIllIIIll[llIllIIlII[30]]);
                                return;
                            }
                            return;
                        } else if (lIllIlIlllllI(i.containsKey(worldPoint) ? 1 : 0) && lIllIlIlllIll(i.containsKey(worldPoint2) ? 1 : 0)) {
                            C0018e.c(worldPoint2);
                            Time.sleepTicks(llIllIIlII[5]);
                            "".length();
                            if (lIllIlIllllIl(Players.getLocal().getInteracting())) {
                                String[] strArr4 = new String[llIllIIlII[5]];
                                strArr4[llIllIIlII[4]] = llIllIIIll[llIllIIlII[31]];
                                NPCs.getNearest(strArr4).interact(llIllIIIll[llIllIIlII[32]]);
                                return;
                            }
                            return;
                        } else if (lIllIlIlllllI(i.containsKey(worldPoint) ? 1 : 0) && lIllIlIlllllI(i.containsKey(worldPoint2) ? 1 : 0) && lIllIlIlllIll(i.containsKey(worldPoint3) ? 1 : 0)) {
                            C0018e.c(worldPoint3);
                            Time.sleepTicks(llIllIIlII[5]);
                            "".length();
                            if (lIllIlIllllIl(Players.getLocal().getInteracting())) {
                                String[] strArr5 = new String[llIllIIlII[5]];
                                strArr5[llIllIIlII[4]] = llIllIIIll[llIllIIlII[33]];
                                NPCs.getNearest(strArr5).interact(llIllIIIll[llIllIIlII[18]]);
                                return;
                            }
                            return;
                        } else if (lIllIlIlllllI(i.containsKey(worldPoint) ? 1 : 0) && lIllIlIlllllI(i.containsKey(worldPoint2) ? 1 : 0) && lIllIlIlllllI(i.containsKey(worldPoint3) ? 1 : 0) && lIllIlIlllIll(i.containsKey(worldPoint4) ? 1 : 0)) {
                            C0018e.c(worldPoint4);
                            Time.sleepTicks(llIllIIlII[5]);
                            "".length();
                            if (lIllIlIllllIl(Players.getLocal().getInteracting())) {
                                String[] strArr6 = new String[llIllIIlII[5]];
                                strArr6[llIllIIlII[4]] = llIllIIIll[llIllIIlII[34]];
                                NPCs.getNearest(strArr6).interact(llIllIIIll[llIllIIlII[35]]);
                                return;
                            }
                            return;
                        }
                    }
                    if (lIllIlIlllIll(L.gm ? 1 : 0)) {
                        WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
                        WorldPoint worldPoint5 = new WorldPoint(worldLocation2.getX() + llIllIIlII[5], worldLocation2.getWorldY(), llIllIIlII[4]);
                        WorldPoint worldPoint6 = new WorldPoint(worldLocation2.getX(), worldLocation2.getWorldY() + llIllIIlII[5], llIllIIlII[4]);
                        WorldPoint worldPoint7 = new WorldPoint(worldLocation2.getX() + llIllIIlII[5], worldLocation2.getWorldY() + llIllIIlII[5], llIllIIlII[4]);
                        if (lIllIlIlllIll(i.containsKey(worldPoint5) ? 1 : 0)) {
                            c = llIllIIIll[llIllIIlII[36]];
                            Movement.walkTo(worldPoint5);
                            "".length();
                        }
                        if (lIllIlIlllIll(i.containsKey(worldPoint6) ? 1 : 0) && lIllIlIlllIll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                            c = llIllIIIll[llIllIIlII[37]];
                            Movement.walkTo(worldPoint6);
                            "".length();
                        }
                        if (lIllIlIlllIll(i.containsKey(worldPoint7) ? 1 : 0) && lIllIlIlllIll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0) && lIllIlIlllIll(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                            c = llIllIIIll[llIllIIlII[38]];
                            Movement.walkTo(worldPoint7);
                            "".length();
                        }
                    }
                }
            }
        }
        if (lIllIlIlllllI(Dialog.isOpen() ? 1 : 0) && lIllIlIllllII(Dialog.getText())) {
            if (lIllIlIlllllI(Dialog.getText().contains(llIllIIIll[llIllIIlII[39]]) ? 1 : 0)) {
                H.ga = llIllIIlII[5];
            }
            if (!lIllIlIlllIll(Dialog.getText().contains(llIllIIIll[llIllIIlII[40]]) ? 1 : 0) || lIllIlIlllllI(Dialog.getText().contains(llIllIIIll[llIllIIlII[41]]) ? 1 : 0)) {
            }
            if (lIllIlIlllllI(Dialog.getText().contains(llIllIIIll[llIllIIlII[42]]) ? 1 : 0)) {
            }
        }
        i.forEach(worldPoint8, num -> {
            i.put(worldPoint8, Integer.valueOf(num.intValue() - llIllIIlII[5]));
            "".length();
        });
        i.entrySet().removeIf(entry -> {
            if (lIllIllIIIIlI(((Integer) entry.getValue()).intValue())) {
                ?? r0 = llIllIIlII[5];
                "".length();
                return "   ".length() == (109 ^ 105) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIllIIlII[4];
        });
        "".length();
        C0018e.I();
    }

    private static boolean lIllIlIllllll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIllIllIIIIlI(int i2) {
        return i2 <= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(int i2, int i3, Player player) {
        int combatLevel = player.getCombatLevel();
        int i4 = i3 + i2;
        if (lIllIllIIIIll(combatLevel, i3 - i2) && lIllIllIIIIIl(combatLevel, i4)) {
            ?? r0 = llIllIIlII[5];
            "".length();
            return 0 != 0 ? ((149 ^ 198) ^ (232 ^ 158)) & (((((63 + 164) - 68) + 18) ^ (((15 + 111) - 3) + 25)) ^ (-" ".length())) : r0;
        }
        return llIllIIlII[4];
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig) configManager.getConfig(BuilderConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (lIllIlIlllllI(configChanged.getGroup().equalsIgnoreCase(llIllIIIll[llIllIIlII[15]]) ? 1 : 0) && lIllIlIlllllI(configChanged.getKey().contains(llIllIIIll[llIllIIlII[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (!lIllIlIlllllI(this.s ? 1 : 0)) {
                d = llIllIIlII[5];
                return;
            }
            d = llIllIIlII[4];
            "".length();
            if ("  ".length() < 0) {
            }
        }
    }

    private static boolean lIllIlIllllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllIllIIIIll(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIllIlIlllllI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    protected void shutDown() {
        this.u.remove(this.v);
        "".length();
        d = llIllIIlII[5];
        f2o = new InterfaceC0003ac[llIllIIlII[4]];
        L.gn = null;
        n = llIllIIlII[4];
        f = llIllIIlII[4];
        System.out.print(llIllIIIll[llIllIIlII[17]]);
        super.stop();
    }

    private static boolean lIllIllIIIlII(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIllIllIIIllI(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIllIlIllIllI(String llllllllllllllllllIIIlIlIIllIllI, String llllllllllllllllllIIIlIlIIllIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIIlIlIIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIIIlIlIIllIlIl.toCharArray();
        int llllllllllllllllllIIIlIlIIllIIlI = llIllIIlII[4];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllllIIIlIlIIlIlIlI = llIllIIlII[4];
        while (lIllIllIIIllI(llllllllllllllllllIIIlIlIIlIlIlI, length)) {
            sb.append((char) (charArray2[llllllllllllllllllIIIlIlIIlIlIlI] ^ charArray[llllllllllllllllllIIIlIlIIllIIlI % charArray.length]));
            "".length();
            llllllllllllllllllIIIlIlIIllIIlI++;
            llllllllllllllllllIIIlIlIIlIlIlI++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    protected int loop() {
        if (lIllIlIlllIlI(Game.getState(), GameState.LOGGED_IN)) {
            if (lIllIlIlllIll(a.isEmpty() ? 1 : 0)) {
                if (!lIllIlIllllII(j) || lIllIlIllllIl(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (lIllIlIlllllI(a.get(llIllIIlII[4]).ah() ? 1 : 0)) {
                    if (lIllIlIlllllI(a.get(llIllIIlII[4]).ag().contains(llIllIIIll[llIllIIlII[5]]) ? 1 : 0)) {
                        f += llIllIIlII[5];
                    }
                    System.out.println("Achieved " + a.get(llIllIIlII[4]).ag() + " goal");
                    a.remove(llIllIIlII[4]);
                    "".length();
                    return llIllIIlII[6];
                } else if (lIllIlIlllIlI(Game.getState(), GameState.LOGGED_IN)) {
                    while (lIllIlIlllllI(C0018e.z() ? 1 : 0) && lIllIlIlllIll(d ? 1 : 0) && lIllIlIllllll(C0018e.j(llIllIIlII[7]), llIllIIlII[8]) && lIllIlIlllIll(Dialog.isOpen() ? 1 : 0)) {
                        c = llIllIIIll[llIllIIlII[9]];
                        C0018e.A();
                        Time.sleepTicks(llIllIIlII[5]);
                        "".length();
                        "".length();
                        if (!(true ^ true)) {
                            return (82 ^ 79) & ((118 ^ 107) ^ (-1));
                        }
                    }
                    int i2 = llIllIIlII[4];
                    try {
                        i2 = a.get(llIllIIlII[4]).af();
                        "".length();
                        if ((-" ".length()) >= ((48 ^ 58) ^ (161 ^ 175))) {
                            return ((53 ^ 48) ^ (208 ^ 180)) & (((70 ^ 107) ^ (99 ^ 47)) ^ (-" ".length()));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return i2;
                }
            }
            if (lIllIlIlllllI(a.isEmpty() ? 1 : 0)) {
                if (lIllIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(aN.pW), llIllIIlII[10])) {
                    c = llIllIIIll[llIllIIlII[10]];
                    Movement.walkTo(aN.pW);
                    "".length();
                }
                if (lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(aN.pW), llIllIIlII[10])) {
                    c = llIllIIIll[llIllIIlII[11]];
                }
            }
        }
        return llIllIIlII[12];
    }

    private static boolean lIllIlIlllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllIllIIIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIllIlIlllIII() {
        llIllIIIll = new String[llIllIIlII[90]];
        llIllIIIll[llIllIIlII[4]] = lIllIlIllIlIl("po0ox1TucmjOeNEWwr7bYA11SZ4T7/9/QmvMRT+QKP5wlp0p2gCjqMDfV3P9AWgYIt8WrYP7zhSeEw3S6wolkFO7r34COwKQjJDmKNkVcpTy8++Tx84xGvf5vtM1CG//dYp5cJyB7QS+z7hSUOWhoK1ipqcVhortceFwYyjNzOk=", "iVzRq");
        llIllIIIll[llIllIIlII[5]] = lIllIlIllIllI("KB8kHzA=", "YjAlD");
        llIllIIIll[llIllIIlII[9]] = lIllIlIllIlIl("1eg9sF2i/VZYzVt8KjzWdJIGVdNrgfQg", "hZIKQ");
        llIllIIIll[llIllIIlII[10]] = lIllIlIllIlll("VP4Ab61yxCKjYxpD4tnP+h8oL0nJTQRK", "ynhtr");
        llIllIIIll[llIllIIlII[11]] = lIllIlIllIlIl("XycJQWOv8vZ2tbSi/Uy9gYd0r2+L8Uvm", "QEbnn");
        llIllIIIll[llIllIIlII[13]] = lIllIlIllIlIl("Lky1IAnuIJy/7UsSPWTsXvr+rhi0ppxeYhWH3Se0hr0=", "jjysV");
        llIllIIIll[llIllIIlII[14]] = lIllIlIllIllI("IzAGPTMYLgEucAQoTwY+FWcsJTkTLE8aPwQhTygzEygaJyQ=", "pGoIP");
        llIllIIIll[llIllIIlII[15]] = lIllIlIllIllI("Cz8WEjIKNxESMRE=", "cPyfT");
        llIllIIIll[llIllIIlII[16]] = lIllIlIllIlIl("9l9quBtjkYY=", "THiEt");
        llIllIIIll[llIllIIlII[17]] = lIllIlIllIlll("jeaPnddxk/UHiW/zUPbJ4N2+pcE7wkQg2RKwtXyKfr8=", "bwsPQ");
        llIllIIIll[llIllIIlII[22]] = lIllIlIllIlIl("/bkz891TSwxz/iU2XkDvEg==", "glNQZ");
        llIllIIIll[llIllIIlII[24]] = lIllIlIllIlll("vUQ+fQetBL0/etJVpjpjmM65Z3s+XTTl", "xrkFk");
        llIllIIIll[llIllIIlII[26]] = lIllIlIllIllI("HA8ECAY=", "Kfadb");
        llIllIIIll[llIllIIlII[27]] = lIllIlIllIllI("GTUxLioz", "XAEOI");
        llIllIIIll[llIllIIlII[28]] = lIllIlIllIllI("HS8bJho5IRh1JScvACYL", "KNuUn");
        llIllIIIll[llIllIIlII[29]] = lIllIlIllIllI("ADMnND0kPSRnAjozPDQs", "VRIGI");
        llIllIIIll[llIllIIlII[30]] = lIllIlIllIlll("CIPsPe5pgyM=", "gQVqK");
        llIllIIIll[llIllIIlII[31]] = lIllIlIllIllI("AhMBAiQmHQJRGzgTGgI1", "TroqP");
        llIllIIIll[llIllIIlII[32]] = lIllIlIllIllI("FgEOKwg8", "WuzJk");
        llIllIIIll[llIllIIlII[33]] = lIllIlIllIlIl("TySMV0lgtA02LEi8S0eQTA==", "gPLnW");
        llIllIIIll[llIllIIlII[18]] = lIllIlIllIlll("hIxf3IJcYAY=", "QhxHF");
        llIllIIIll[llIllIIlII[34]] = lIllIlIllIlIl("ZvrxjcoGeG1KXX7kdrMVfA==", "sCwTm");
        llIllIIIll[llIllIIlII[35]] = lIllIlIllIlIl("OMyJrUnYFv4=", "COecD");
        llIllIIIll[llIllIIlII[36]] = lIllIlIllIlIl("BwakRlvSU8Z3zDJz4ocOnQ==", "PWCal");
        llIllIIIll[llIllIIlII[37]] = lIllIlIllIlll("YCJkyPdeNQg/Mo9pPlj4yQ==", "rvZYu");
        llIllIIIll[llIllIIlII[38]] = lIllIlIllIllI("HAoRPz4eChgwagAMBWVx", "pcvWJ");
        llIllIIIll[llIllIIlII[39]] = lIllIlIllIlll("+Ovoquy8wjqxS8KmSKDBNQ==", "keqkH");
        llIllIIIll[llIllIIlII[40]] = lIllIlIllIlll("DUGbJgZIaEJ7xw9zHAGmoicuEz4REmQM", "Tyygf");
        llIllIIIll[llIllIIlII[41]] = lIllIlIllIllI("AGUZDxVBJhsfBw==", "aEwjb");
        llIllIIIll[llIllIIlII[42]] = lIllIlIllIllI("MWsEGzkUL0cAKRQnRxY1WD8PEWwbPhNUIx5rHhs5CmsNHS4=", "xKgtL");
        llIllIIIll[llIllIIlII[43]] = lIllIlIllIllI("Oh0MVQ4CBBwbQRdSHhoSQxcXGhMEGg==", "cryuf");
        llIllIIIll[llIllIIlII[44]] = lIllIlIllIllI("FhsbSyw2GxoMIXgTAActeBIAGWk6ARYCJz8=", "XtokI");
        llIllIIIll[llIllIIlII[45]] = lIllIlIllIlll("Y9u/XlLNKKpYRUY7kOzE2KGYlAdAiPPV", "dfVAS");
        llIllIIIll[llIllIIlII[46]] = lIllIlIllIllI("EyBvLCYBAW5JT35t", "DEOho");
        llIllIIIll[llIllIIlII[47]] = lIllIlIllIlll("BXR553Y1nAHjUwYNI077m9iB0764YyshSiyG1PDmU5cwPDUC8y2KR9rMdt90LyM5PRb9E1+Y+JfrIkbl0KOy9kpuJACa3zPHS83pPY28PmdJi1HA+c30Jw==", "jYkUS");
        llIllIIIll[llIllIIlII[48]] = lIllIlIllIlIl("OZK5gsVmsLqGlwDNFhXvCbcAKAoKx/0ISpcUqya8plN7ojdG2Z3/UetM1nqoFCspNlFb8G84EhYGI3xh0t9lX/d6FqJ3EPye/GCHIGprHWfW7DDHi3O92rrOgL+Nnhwy3N3l5Lmprg/eL/YEMVNkreb/s3FUkhI6+td2C2yaaNc=", "jDbat");
        llIllIIIll[llIllIIlII[49]] = lIllIlIllIlIl("NQtJ3wmGM8l4va3L5DcJke9jPSOcoQdc", "nFupJ");
        llIllIIIll[llIllIIlII[50]] = lIllIlIllIlll("Ta/oaMozTa0=", "Fgywz");
        llIllIIIll[llIllIIlII[51]] = lIllIlIllIlIl("eO4x25L6jXs=", "pLEmK");
        llIllIIIll[llIllIIlII[52]] = lIllIlIllIllI("HTMkBQ==", "RCAks");
        llIllIIIll[llIllIIlII[53]] = lIllIlIllIllI("ISsLKGwxNgE/", "uYnML");
        llIllIIIll[llIllIIlII[54]] = lIllIlIllIlll("3klOdgMIp+0l2663p+WGZA==", "THKLl");
        llIllIIIll[llIllIIlII[55]] = lIllIlIllIlll("hNzeURqM9L8=", "gyrGo");
        llIllIIIll[llIllIIlII[56]] = lIllIlIllIlIl("ZOzV+KbhpYSqsQHsmAhivnKgWOq66d7H", "AtcrA");
        llIllIIIll[llIllIIlII[59]] = lIllIlIllIllI("JzgmBiMiLXQQLSsxdBE3Kw==", "FTTcB");
        llIllIIIll[llIllIIlII[61]] = lIllIlIllIlll("lV+NN5vWUBo=", "PyljP");
        llIllIIIll[llIllIIlII[62]] = lIllIlIllIllI("NCM8YyR3MDclMz9iJiwxIw==", "WBRDP");
        llIllIIIll[llIllIIlII[63]] = lIllIlIllIllI("Jxc0VAFkBD8SFixWLhsUMA==", "DvZsu");
        llIllIIIll[llIllIIlII[66]] = lIllIlIllIlll("Q8Mx9wbitqg=", "qKzgE");
        llIllIIIll[llIllIIlII[67]] = lIllIlIllIlll("LUp14JnHs6E=", "LDclv");
        llIllIIIll[llIllIIlII[68]] = lIllIlIllIlIl("nDCUiDKoqg0=", "VnNLP");
        llIllIIIll[llIllIIlII[69]] = lIllIlIllIlIl("Ny0fTjLJj8Q=", "IHlub");
        llIllIIIll[llIllIIlII[70]] = lIllIlIllIlIl("oWju8BMdl1H8kSFVEeEegg==", "OoiKH");
        llIllIIIll[llIllIIlII[3]] = lIllIlIllIllI("BREXPGsVDB0r", "QcrYK");
        llIllIIIll[llIllIIlII[71]] = lIllIlIllIlIl("QnjGNrZETuc=", "PWsOM");
        llIllIIIll[llIllIIlII[72]] = lIllIlIllIllI("Fj0oCihCISkFN0IzIAcqDDJhKiwQISk=", "bUAdC");
        llIllIIIll[llIllIIlII[73]] = lIllIlIllIlIl("LmoIVMtpIGcukGe82FgxvqvOUjMi63dX", "qzabo");
        llIllIIIll[llIllIIlII[74]] = lIllIlIllIllI("NCIHJA==", "pPhTY");
        llIllIIIll[llIllIIlII[75]] = lIllIlIllIlIl("nLkNNtXqdc9cDonzu7CUbw==", "tryKk");
        llIllIIIll[llIllIIlII[76]] = lIllIlIllIlIl("raRnSpE60/Xlj8jFW2hiPok10zpb6H4wSrjObTC6JoSi62A0jDbNb3vsn82Rf+U0", "FPDZZ");
        llIllIIIll[llIllIIlII[77]] = lIllIlIllIllI("OC0MVAYEIwsXHUE2ERFVAiocBwFNYhsBAUEkEBoRQSwWAB0ILB5a", "aBytu");
        llIllIIIll[llIllIIlII[81]] = lIllIlIllIlll("k888hnCPJ+nQqkXQq3qYnQ==", "xXylF");
        llIllIIIll[llIllIIlII[2]] = lIllIlIllIlll("wgkpbdfhx/8=", "AUnHB");
        llIllIIIll[llIllIIlII[80]] = lIllIlIllIlll("nvX1kMU22Qg=", "dSTVE");
        llIllIIIll[llIllIIlII[85]] = lIllIlIllIlIl("HlCbIBLet1Q=", "AZAeK");
        llIllIIIll[llIllIIlII[86]] = lIllIlIllIllI("CDULCw==", "GEnet");
        llIllIIIll[llIllIIlII[87]] = lIllIlIllIllI("Eh8eJho+DQ==", "PjlHs");
        llIllIIIll[llIllIIlII[88]] = lIllIlIllIlIl("KzaHrJfVeM4=", "pUEPm");
        llIllIIIll[llIllIIlII[89]] = lIllIlIllIlll("75f/ETg4Tl0=", "AJLLw");
    }

    private static boolean lIllIllIIIIII(int i2, int i3) {
        return i2 > i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    static {
        lIllIlIlllIIl();
        lIllIlIlllIII();
        a = new ArrayList();
        b = System.currentTimeMillis();
        d = llIllIIlII[4];
        g = System.currentTimeMillis();
        h = llIllIIIll[llIllIIlII[89]];
        i = new HashMap<>();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        InterfaceC0003ac[] interfaceC0003acArr = new InterfaceC0003ac[llIllIIlII[5]];
        interfaceC0003acArr[llIllIIlII[4]] = new aN();
        f2o = interfaceC0003acArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v180, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v189, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v193, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[43]]) ? 1 : 0)) {
            System.out.println(llIllIIIll[llIllIIlII[44]]);
            d = llIllIIlII[5];
        }
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[45]]) ? 1 : 0)) {
            System.out.println(llIllIIIll[llIllIIlII[46]]);
            if (lIllIlIlllIll(Game.getWildyLevel()) && lIllIlIlllIll(Inventory.contains(item -> {
                return item.getName().contains(llIllIIIll[llIllIIlII[88]]);
            }) ? 1 : 0)) {
                d = llIllIIlII[5];
                System.out.println(llIllIIIll[llIllIIlII[47]]);
            }
            if (!lIllIllIIIIlI(Game.getWildyLevel()) || lIllIlIlllllI(Inventory.contains(item2 -> {
                return item2.getName().contains(llIllIIIll[llIllIIlII[87]]);
            }) ? 1 : 0)) {
                d = llIllIIlII[4];
                System.out.println(llIllIIIll[llIllIIlII[48]]);
            }
        }
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[49]]) ? 1 : 0) && lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(V.mh), llIllIIlII[22])) {
            String[] strArr = new String[llIllIIlII[5]];
            strArr[llIllIIlII[4]] = llIllIIIll[llIllIIlII[50]];
            if (lIllIlIllllII(TileObjects.getNearest(strArr))) {
                String[] strArr2 = new String[llIllIIlII[5]];
                strArr2[llIllIIlII[4]] = llIllIIIll[llIllIIlII[51]];
                TileObjects.getNearest(strArr2).interact(llIllIIIll[llIllIIlII[52]]);
                Time.sleepTicks(llIllIIlII[11]);
                "".length();
            }
            String[] strArr3 = new String[llIllIIlII[5]];
            strArr3[llIllIIlII[4]] = llIllIIIll[llIllIIlII[53]];
            if (lIllIlIllllII(TileObjects.getNearest(strArr3))) {
                String[] strArr4 = new String[llIllIIlII[5]];
                strArr4[llIllIIlII[4]] = llIllIIIll[llIllIIlII[54]];
                TileObjects.getNearest(strArr4).interact(llIllIIIll[llIllIIlII[55]]);
                Time.sleepTicks(llIllIIlII[10]);
                "".length();
            }
        }
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[56]]) ? 1 : 0)) {
            Movement.walkTo(new WorldPoint(llIllIIlII[57], llIllIIlII[58], llIllIIlII[4]));
            "".length();
            Time.sleepTicks(llIllIIlII[5]);
            "".length();
        }
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[59]]) ? 1 : 0)) {
            int[] iArr = new int[llIllIIlII[5]];
            iArr[llIllIIlII[4]] = llIllIIlII[60];
            if (lIllIlIlllllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIllIIlII[5]];
                iArr2[llIllIIlII[4]] = llIllIIlII[60];
                Inventory.getFirst(iArr2).interact(llIllIIIll[llIllIIlII[61]]);
            }
        }
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[62]]) ? 1 : 0) && lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(C0039z.eb), llIllIIlII[22])) {
            C0018e.x();
        }
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[63]]) ? 1 : 0) && (!lIllIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(C0034u.df), llIllIIlII[22]) || !lIllIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(C0034u.dh), llIllIIlII[22]) || !lIllIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllIIlII[64], llIllIIlII[65], llIllIIlII[4])), llIllIIlII[15]) || lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(V.mh), llIllIIlII[22]))) {
            WorldPoint worldPoint = new WorldPoint(llIllIIlII[64], llIllIIlII[65], llIllIIlII[4]);
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIllIlIlllllI(tileObject.getName().contains(llIllIIIll[llIllIIlII[85]]) ? 1 : 0)) {
                    String[] strArr5 = new String[llIllIIlII[5]];
                    strArr5[llIllIIlII[4]] = llIllIIIll[llIllIIlII[86]];
                    if (lIllIlIlllllI(tileObject.hasAction(strArr5) ? 1 : 0) && lIllIllIIIIIl(tileObject.getWorldLocation().distanceTo(worldPoint), llIllIIlII[9])) {
                        ?? r0 = llIllIIlII[5];
                        "".length();
                        return (-" ".length()) >= " ".length() ? ((164 ^ 157) ^ (11 ^ 59)) & (((154 ^ 196) ^ (104 ^ 63)) ^ (-" ".length())) : r0;
                    }
                }
                return llIllIIlII[4];
            });
            if (lIllIlIllllII(nearest)) {
                nearest.interact(llIllIIIll[llIllIIlII[66]]);
                Time.sleepTicks(llIllIIlII[13]);
                "".length();
            }
            String[] strArr5 = new String[llIllIIlII[5]];
            strArr5[llIllIIlII[4]] = llIllIIIll[llIllIIlII[67]];
            if (lIllIlIllllII(TileObjects.getNearest(strArr5))) {
                String[] strArr6 = new String[llIllIIlII[5]];
                strArr6[llIllIIlII[4]] = llIllIIIll[llIllIIlII[68]];
                TileObjects.getNearest(strArr6).interact(llIllIIIll[llIllIIlII[69]]);
                Time.sleepTicks(llIllIIlII[11]);
                "".length();
            }
            String[] strArr7 = new String[llIllIIlII[5]];
            strArr7[llIllIIlII[4]] = llIllIIIll[llIllIIlII[70]];
            if (lIllIlIllllII(TileObjects.getNearest(strArr7))) {
                String[] strArr8 = new String[llIllIIlII[5]];
                strArr8[llIllIIlII[4]] = llIllIIIll[llIllIIlII[3]];
                TileObjects.getNearest(strArr8).interact(llIllIIIll[llIllIIlII[71]]);
                Time.sleepTicks(llIllIIlII[10]);
                "".length();
            }
        }
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[72]]) ? 1 : 0)) {
            Movement.walkTo(new WorldPoint(llIllIIlII[57], llIllIIlII[58], llIllIIlII[4]));
            "".length();
            Time.sleepTicks(llIllIIlII[5]);
            "".length();
        }
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[73]]) ? 1 : 0)) {
            int[] iArr3 = new int[llIllIIlII[5]];
            iArr3[llIllIIlII[4]] = llIllIIlII[60];
            if (lIllIlIlllllI(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIllIIlII[5]];
                iArr4[llIllIIlII[4]] = llIllIIlII[60];
                Inventory.getFirst(iArr4).interact(llIllIIIll[llIllIIlII[74]]);
            }
        }
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[75]]) ? 1 : 0)) {
        }
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[76]]) ? 1 : 0)) {
        }
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[77]]) ? 1 : 0)) {
        }
        WorldArea worldArea = new WorldArea(llIllIIlII[78], llIllIIlII[79], llIllIIlII[80], llIllIIlII[76], llIllIIlII[4]);
        if (lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[81]]) ? 1 : 0) && lIllIlIlllllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                if (lIllIlIlllllI(tileObject2.getName().contains(llIllIIIll[llIllIIlII[80]]) ? 1 : 0) && lIllIllIIIIII(tileObject2.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIllIIlII[5])) {
                    ?? r0 = llIllIIlII[5];
                    "".length();
                    return (-"  ".length()) >= 0 ? ((131 ^ 151) ^ (197 ^ 177)) & (((((76 + 159) - 108) + 88) ^ (((42 + 182) - 151) + 110)) ^ (-" ".length())) : r0;
                }
                return llIllIIlII[4];
            });
            if (lIllIlIllllII(nearest2)) {
                nearest2.interact(llIllIIIll[llIllIIlII[2]]);
                Time.sleepTicks(llIllIIlII[16]);
                "".length();
            }
        }
    }

    private static boolean lIllIllIIIIIl(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public void onStart(String... strArr) {
        SquirePlugin.setGlobalMouseRecordings();
        "".length();
        d = llIllIIlII[4];
        System.out.print(llIllIIIll[llIllIIlII[13]]);
        this.u.add(this.v);
        "".length();
        a.clear();
        System.out.println(llIllIIIll[llIllIIlII[14]]);
        a.clear();
        List<InterfaceC0003ac> list = a;
        C0033t[] c0033tArr = new C0033t[llIllIIlII[5]];
        c0033tArr[llIllIIlII[4]] = new C0033t();
        Collections.addAll(list, c0033tArr);
        "".length();
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (lIllIllIIIlII(graphicsObjectCreated.getGraphicsObject().getId(), llIllIIlII[82]) && lIllIllIIIlII(graphicsObjectCreated.getGraphicsObject().getId(), llIllIIlII[83]) && !lIllIlIllllll(graphicsObjectCreated.getGraphicsObject().getId(), llIllIIlII[84])) {
            return;
        }
        if (lIllIlIlllIll(L.gm ? 1 : 0)) {
            L.gm = llIllIIlII[5];
        }
        i.put(WorldPoint.fromLocal(this.t, graphicsObjectCreated.getGraphicsObject().getLocation()), Integer.valueOf(llIllIIlII[11]));
        "".length();
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        if (!lIllIllIIIlII(loginStateChanged.getIndex(), llIllIIlII[28]) && lIllIlIlllIll(n)) {
            C0018e.a(this.r, "rsn: " + k + " account has been banned? - Acc builder SOTF");
            n += llIllIIlII[5];
        }
    }

    private static String lIllIlIllIlIl(String llllllllllllllllllIIIlIlIlIIIllI, String llllllllllllllllllIIIlIlIlIIIlIl) {
        try {
            SecretKeySpec llllllllllllllllllIIIlIlIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIlIlIlIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIlIlIlIIlIII.init(llIllIIlII[9], llllllllllllllllllIIIlIlIlIIlIIl);
            return new String(llllllllllllllllllIIIlIlIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIlIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlIlIlIIIlll) {
            llllllllllllllllllIIIlIlIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIllllII(Object obj) {
        return obj != null;
    }

    private static String lIllIlIllIlll(String llllllllllllllllllIIIlIlIIlIIIIl, String llllllllllllllllllIIIlIlIIlIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIlIIlIIIII.getBytes(StandardCharsets.UTF_8)), llIllIIlII[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllIIlII[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIlIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlIlIIlIIIlI) {
            llllllllllllllllllIIIlIlIIlIIIlI.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(InventoryChanged inventoryChanged) {
        if (lIllIlIlllIlI(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_REMOVED)) {
        }
    }

    private static void lIllIlIlllIIl() {
        llIllIIlII = new int[91];
        llIllIIlII[0] = (-((-10293) & 14845)) & (-16913) & 24575;
        llIllIIlII[1] = (-((-4237) & 20924)) & (-65) & 20351;
        llIllIIlII[2] = (84 ^ 88) ^ (175 ^ 157);
        llIllIIlII[3] = 2 ^ 55;
        llIllIIlII[4] = (251 ^ 197) & ((53 ^ 11) ^ (-1));
        llIllIIlII[5] = " ".length();
        llIllIIlII[6] = 118 ^ 18;
        llIllIIlII[7] = (-((-4105) & 30411)) & (-6177) & 32763;
        llIllIIlII[8] = (-((-1425) & 28055)) & (-1025) & 28654;
        llIllIIlII[9] = "  ".length();
        llIllIIlII[10] = "   ".length();
        llIllIIlII[11] = (112 ^ 28) ^ (65 ^ 41);
        llIllIIlII[12] = (-18436) & 19035;
        llIllIIlII[13] = 100 ^ 97;
        llIllIIlII[14] = (21 ^ 108) ^ (((46 + 25) - 64) + 120);
        llIllIIlII[15] = (183 ^ 147) ^ (82 ^ 113);
        llIllIIlII[16] = 134 ^ 142;
        llIllIIlII[17] = (236 ^ 132) ^ (92 ^ 61);
        llIllIIlII[18] = 127 ^ 107;
        llIllIIlII[19] = (-((-163) & 27879)) & (-4131) & 32382;
        llIllIIlII[20] = (-17729) & 18265;
        llIllIIlII[21] = ((126 + 20) - 108) + 92;
        llIllIIlII[22] = 98 ^ 104;
        llIllIIlII[23] = (-18441) & 28013;
        llIllIIlII[24] = 200 ^ 195;
        llIllIIlII[25] = (-((-8471) & 15767)) & (-8193) & 16351;
        llIllIIlII[26] = 15 ^ 3;
        llIllIIlII[27] = 171 ^ 166;
        llIllIIlII[28] = (((49 + 8) - (-5)) + 123) ^ (((40 + 160) - 92) + 75);
        llIllIIlII[29] = (76 ^ 91) ^ (27 ^ 3);
        llIllIIlII[30] = 9 ^ 25;
        llIllIIlII[31] = (94 ^ 0) ^ (104 ^ 39);
        llIllIIlII[32] = (91 ^ 125) ^ (242 ^ 198);
        llIllIIlII[33] = (247 ^ 178) ^ (85 ^ 3);
        llIllIIlII[34] = 109 ^ 120;
        llIllIIlII[35] = 116 ^ 98;
        llIllIIlII[36] = 40 ^ 63;
        llIllIIlII[37] = (210 ^ 199) ^ (138 ^ 135);
        llIllIIlII[38] = 24 ^ 1;
        llIllIIlII[39] = (100 ^ 49) ^ (41 ^ 102);
        llIllIIlII[40] = 168 ^ 179;
        llIllIIlII[41] = 151 ^ 139;
        llIllIIlII[42] = (72 ^ 99) ^ (149 ^ 163);
        llIllIIlII[43] = (77 ^ 41) ^ (122 ^ 0);
        llIllIIlII[44] = (222 ^ 199) ^ (156 ^ 154);
        llIllIIlII[45] = (3 ^ 25) ^ (78 ^ 116);
        llIllIIlII[46] = (((168 + 172) - 174) + 21) ^ (((113 + 17) - 103) + 127);
        llIllIIlII[47] = 139 ^ 169;
        llIllIIlII[48] = 184 ^ 155;
        llIllIIlII[49] = (((11 + 114) - 74) + 77) ^ (((113 + 161) - 240) + 130);
        llIllIIlII[50] = "   ".length() ^ (224 ^ 198);
        llIllIIlII[51] = (((60 + 9) - (-13)) + 72) ^ (((113 + 64) - 58) + 69);
        llIllIIlII[52] = (92 ^ 90) ^ (139 ^ 170);
        llIllIIlII[53] = 117 ^ 93;
        llIllIIlII[54] = 132 ^ 173;
        llIllIIlII[55] = (39 ^ 12) ^ " ".length();
        llIllIIlII[56] = (((74 + 210) - 210) + 159) ^ (((164 + 50) - 74) + 54);
        llIllIIlII[57] = (-12315) & 15291;
        llIllIIlII[58] = (-537) & 3775;
        llIllIIlII[59] = (((110 + 42) - 75) + 76) ^ (((22 + 139) - 135) + 155);
        llIllIIlII[60] = (-((-1321) & 16185)) & (-16385) & 31679;
        llIllIIlII[61] = 82 ^ 127;
        llIllIIlII[62] = 82 ^ 124;
        llIllIIlII[63] = 186 ^ 149;
        llIllIIlII[64] = (-((-17450) & 29741)) & (-16849) & 32767;
        llIllIIlII[65] = (-24577) & 27826;
        llIllIIlII[66] = (111 ^ 17) ^ (15 ^ 65);
        llIllIIlII[67] = (126 ^ 43) ^ (210 ^ 182);
        llIllIIlII[68] = (101 ^ 31) ^ (46 ^ 102);
        llIllIIlII[69] = (199 ^ 150) ^ (32 ^ 66);
        llIllIIlII[70] = 136 ^ 188;
        llIllIIlII[71] = 20 ^ 34;
        llIllIIlII[72] = (69 ^ 96) ^ (36 ^ 54);
        llIllIIlII[73] = (5 ^ 29) ^ (162 ^ 130);
        llIllIIlII[74] = 62 ^ 7;
        llIllIIlII[75] = 6 ^ 60;
        llIllIIlII[76] = 103 ^ 92;
        llIllIIlII[77] = (5 ^ 20) ^ (16 ^ 61);
        llIllIIlII[78] = (-12673) & 15359;
        llIllIIlII[79] = (-2113) & 11775;
        llIllIIlII[80] = 64 ^ 127;
        llIllIIlII[81] = (68 ^ 74) ^ (116 ^ 71);
        llIllIIlII[82] = (-20509) & 22044;
        llIllIIlII[83] = (-14337) & 15842;
        llIllIIlII[84] = (-12873) & 14318;
        llIllIIlII[85] = 123 ^ 59;
        llIllIIlII[86] = 61 ^ 124;
        llIllIIlII[87] = 206 ^ 140;
        llIllIIlII[88] = 37 ^ 102;
        llIllIIlII[89] = 204 ^ 136;
        llIllIIlII[90] = 90 ^ 31;
    }

    private static boolean lIllIlIlllIll(int i2) {
        return i2 == 0;
    }
}
