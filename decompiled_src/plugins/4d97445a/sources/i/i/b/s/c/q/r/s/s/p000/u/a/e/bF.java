package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.repeat.RepeatPlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.packets.NPCPackets;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.InputManager;
@TaskDesc(name = "Tracking shop repeats", register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bF  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bF.class */
public class bF extends Task {
    private static /* synthetic */ int[] lIlllIlI;
    private final /* synthetic */ RepeatPlugin gv;
    private final /* synthetic */ InputManager gw;
    private /* synthetic */ boolean gx;
    private final /* synthetic */ Client gu;
    private static /* synthetic */ String[] lIllIllI;
    private final /* synthetic */ AtomicBoolean gr = new AtomicBoolean(lIlllIlI[0]);
    private final /* synthetic */ AtomicReference<MenuAutomated> gs = new AtomicReference<>(null);
    private final /* synthetic */ List<MenuAutomated> gt = new ArrayList();
    private /* synthetic */ String gy = lIllIllI[lIlllIlI[0]];

    static {
        lIlIIlIIlI();
        lIlIIIllll();
    }

    private static String lIlIIIllII(String llIlllIIllIlllI, String llIlllIIllIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllIIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlllIIlllIIII = Cipher.getInstance("Blowfish");
            llIlllIIlllIIII.init(lIlllIlI[2], secretKeySpec);
            return new String(llIlllIIlllIIII.doFinal(Base64.getDecoder().decode(llIlllIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllIIllIlIlI) {
            llIlllIIllIlIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (!lIlIIlIIll(Shop.isOpen() ? 1 : 0) || !lIlIIlIlII(this.gr.get() ? 1 : 0)) {
            this.gx = lIlllIlI[0];
        } else if (lIlIIlIlII(this.gx ? 1 : 0)) {
            this.gt.clear();
            this.gx = lIlllIlI[1];
        }
    }

    private static boolean lIlIIlIlll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    public boolean run() {
        if (lIlIIlIlII(this.gr.get() ? 1 : 0)) {
            return lIlllIlI[0];
        }
        MenuAutomated menuAutomated = this.gs.get();
        if (lIlIIlIlll(menuAutomated)) {
            this.gr.set(lIlllIlI[0]);
            return lIlllIlI[0];
        } else if (lIlIIlIlII(Shop.isOpen() ? 1 : 0)) {
            NPCPackets.createNpcThirdActionPacket(menuAutomated.getIdentifier(), (boolean) lIlllIlI[0]).send();
            return lIlllIlI[1];
        } else if (lIlIIlIIll(this.gt.isEmpty() ? 1 : 0)) {
            this.gr.set(lIlllIlI[0]);
            this.gs.set(null);
            return lIlllIlI[0];
        } else {
            for (MenuAutomated menuAutomated2 : this.gt) {
                this.gu.interact(menuAutomated2);
                "".length();
                if ((-"   ".length()) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            Keyboard.type(lIlllIlI[4]);
            this.gr.set(lIlllIlI[0]);
            return lIlllIlI[1];
        }
    }

    private static boolean lIlIIlIIll(int i2) {
        return i2 != 0;
    }

    private static void lIlIIIllll() {
        lIllIllI = new String[lIlllIlI[5]];
        lIllIllI[lIlllIlI[0]] = lIlIIIlIll("", "JzIxf");
        lIllIllI[lIlllIlI[1]] = lIlIIIllII("/uxer2QtpZU=", "qQbiL");
        lIllIllI[lIlllIlI[2]] = lIlIIIllIl("35sNjBpcr/s=", "CuYPE");
        lIllIllI[lIlllIlI[3]] = lIlIIIlIll("cAQmAnQqASoIfXxZGws5KQY9Thk5FSoGKD8C", "LgInI");
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        if (!lIlIIlIlII(this.gt.isEmpty() ? 1 : 0) || lIlIIlIIll(this.gx ? 1 : 0) || !lIlIIlIIll(menuEntryAdded.getTarget().contains(this.gy) ? 1 : 0) || lIlIIlIllI(menuEntryAdded.getType(), MenuAction.NPC_FIRST_OPTION.getId())) {
            return;
        }
        this.gu.createMenuEntry(this.gu.getMenuOptionCount()).setOption(lIllIllI[lIlllIlI[3]]).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            Point mouseCanvasPosition = Static.getClient().getMouseCanvasPosition();
            this.gs.set(MenuAutomated.builder().target(menuEntryAdded.getTarget()).identifier(menuEntryAdded.getIdentifier()).opcode(MenuAction.NPC_THIRD_OPTION).option(menuEntryAdded.getOption()).param0(menuEntryAdded.getActionParam0()).param1(menuEntryAdded.getActionParam1()).clickX(mouseCanvasPosition.getX()).clickY(mouseCanvasPosition.getY()).build());
            this.gr.set(lIlllIlI[1]);
            this.gv.a(mouseCanvasPosition);
        });
        "".length();
    }

    private static boolean lIlIIlIlII(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    @Inject
    public bF(Client client, RepeatPlugin repeatPlugin, InputManager inputManager) {
        this.gu = client;
        this.gv = repeatPlugin;
        this.gw = inputManager;
    }

    private static boolean lIlIIlIllI(int i2, int i3) {
        return i2 != i3;
    }

    private static void lIlIIlIIlI() {
        lIlllIlI = new int[7];
        lIlllIlI[0] = ((((128 + 22) - 80) + 80) ^ (((161 + 9) - 27) + 34)) & (((25 ^ 84) ^ (81 ^ 59)) ^ (-" ".length()));
        lIlllIlI[1] = " ".length();
        lIlllIlI[2] = "  ".length();
        lIlllIlI[3] = "   ".length();
        lIlllIlI[4] = (((92 + 5) - 5) + 82) ^ (((69 + 123) - 136) + 125);
        lIlllIlI[5] = (206 ^ 199) ^ (67 ^ 78);
        lIlllIlI[6] = (235 ^ 144) ^ (244 ^ 135);
    }

    private static String lIlIIIlIll(String llIlllIlIIIlIll, String llIlllIlIIIllll) {
        String llIlllIlIIIlIll2 = new String(Base64.getDecoder().decode(llIlllIlIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllIlIIIlllI = new StringBuilder();
        char[] llIlllIlIIIllIl = llIlllIlIIIllll.toCharArray();
        int llIlllIlIIIllII = lIlllIlI[0];
        char[] charArray = llIlllIlIIIlIll2.toCharArray();
        int length = charArray.length;
        int i2 = lIlllIlI[0];
        while (lIlIIllIIl(i2, length)) {
            llIlllIlIIIlllI.append((char) (charArray[i2] ^ llIlllIlIIIllIl[llIlllIlIIIllII % llIlllIlIIIllIl.length]));
            "".length();
            llIlllIlIIIllII++;
            i2++;
            "".length();
            if (((((145 + 12) - 142) + 164) ^ (((85 + 36) - 52) + 114)) < ((9 ^ 47) ^ (152 ^ 186))) {
                return null;
            }
        }
        return String.valueOf(llIlllIlIIIlllI);
    }

    private static String lIlIIIllIl(String llIlllIIllllIIl, String llIlllIIllllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIIllllIlI.getBytes(StandardCharsets.UTF_8)), lIlllIlI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlllIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllIIlllllII) {
            llIlllIIlllllII.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void b(MenuOptionClicked menuOptionClicked) {
        if (lIlIIlIlII(this.gx ? 1 : 0)) {
            if (lIlIIlIIll(menuOptionClicked.getMenuOption().contains(lIllIllI[lIlllIlI[1]]) ? 1 : 0)) {
                this.gy = Text.removeTags(menuOptionClicked.getMenuTarget());
                return;
            }
            return;
        }
        String menuOption = menuOptionClicked.getMenuOption();
        if (!lIlIIlIlIl(menuOption) || lIlIIlIlII(menuOption.contains(lIllIllI[lIlllIlI[2]]) ? 1 : 0)) {
            return;
        }
        this.gt.add(MenuAutomated.builder().option(menuOption).param0(menuOptionClicked.getParam0()).param1(menuOptionClicked.getParam1()).identifier(menuOptionClicked.getId()).opcode(menuOptionClicked.getMenuAction()).target(menuOptionClicked.getMenuTarget()).build());
        "".length();
    }

    private static boolean lIlIIllIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIlIlIl(Object obj) {
        return obj != null;
    }
}
