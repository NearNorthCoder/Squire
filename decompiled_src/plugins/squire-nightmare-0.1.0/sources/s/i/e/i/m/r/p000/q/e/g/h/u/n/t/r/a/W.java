package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.WidgetHiddenChanged;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Collecting items", priority = 2147483646, blocking = true, register = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.W  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/W.class */
public class W extends Y {
    private final /* synthetic */ Client dz;
    private static final /* synthetic */ WorldPoint dy;
    private static final /* synthetic */ Logger dv;
    private final /* synthetic */ C0015l dA;
    private static final /* synthetic */ int dx;
    private static /* synthetic */ String[] llllIllIIIlI;
    private static /* synthetic */ int[] llllIllIIIll;
    private static final /* synthetic */ int dw;

    private static String lIIlIIIlIlIlIIl(String lllllllllllllllIIlIllIIIIlIIlIll, String lllllllllllllllIIlIllIIIIlIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIIIlIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIIIlIIllIl.init(llllIllIIIll[4], lllllllllllllllIIlIllIIIIlIIlllI);
            return new String(lllllllllllllllIIlIllIIIIlIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIIIlIIllII) {
            lllllllllllllllIIlIllIIIIlIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIlIllIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIIlIlIllll(Object obj) {
        return obj == null;
    }

    private static String lIIlIIIlIlIlIII(String lllllllllllllllIIlIllIIIIllIIIII, String lllllllllllllllIIlIllIIIIlIlllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIIIlIllllI = new StringBuilder();
        char[] lllllllllllllllIIlIllIIIIlIlllIl = lllllllllllllllIIlIllIIIIlIlllll.toCharArray();
        int lllllllllllllllIIlIllIIIIlIlllII = llllIllIIIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIllIIIll[0];
        while (lIIlIIIlIllIIIl(i, length)) {
            char lllllllllllllllIIlIllIIIIllIIIIl = charArray[i];
            lllllllllllllllIIlIllIIIIlIllllI.append((char) (lllllllllllllllIIlIllIIIIllIIIIl ^ lllllllllllllllIIlIllIIIIlIlllIl[lllllllllllllllIIlIllIIIIlIlllII % lllllllllllllllIIlIllIIIIlIlllIl.length]));
            "".length();
            lllllllllllllllIIlIllIIIIlIlllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllIIIIlIllllI);
    }

    private static void lIIlIIIlIlIlIll() {
        llllIllIIIll = new int[30];
        llllIllIIIll[0] = (6 ^ 82) & ((242 ^ 166) ^ (-1));
        llllIllIIIll[1] = " ".length();
        llllIllIIIll[2] = (-9457) & 39462138;
        llllIllIIIll[3] = (-28033) & 39480710;
        llllIllIIIll[4] = "  ".length();
        llllIllIIIll[5] = "   ".length();
        llllIllIIIll[6] = 100 ^ 96;
        llllIllIIIll[7] = 173 ^ 168;
        llllIllIIIll[8] = 169 ^ 175;
        llllIllIIIll[9] = (83 ^ 20) ^ (118 ^ 54);
        llllIllIIIll[10] = 96 ^ 104;
        llllIllIIIll[11] = (((41 + 58) - 27) + 56) ^ (((73 + 55) - 118) + 127);
        llllIllIIIll[12] = 75 ^ 65;
        llllIllIIIll[13] = (174 ^ 137) ^ (42 ^ 6);
        llllIllIIIll[14] = 178 ^ 190;
        llllIllIIIll[15] = (((39 + 106) - 69) + 60) ^ (((50 + 117) - 83) + 49);
        llllIllIIIll[16] = (47 ^ 110) ^ (39 ^ 104);
        llllIllIIIll[17] = (-12097) & 16347;
        llllIllIIIll[18] = (-2084) & 24483;
        llllIllIIIll[19] = 141 ^ 130;
        llllIllIIIll[20] = (225 ^ 174) ^ (197 ^ 154);
        llllIllIIIll[21] = 7 ^ 22;
        llllIllIIIll[22] = 145 ^ 131;
        llllIllIIIll[23] = (((2 + 57) - (-84)) + 34) ^ (((82 + 48) - 37) + 69);
        llllIllIIIll[24] = (((100 + 30) - 81) + 82) ^ (((137 + 58) - 176) + 132);
        llllIllIIIll[25] = (101 ^ 70) ^ (93 ^ 107);
        llllIllIIIll[26] = 211 ^ 197;
        llllIllIIIll[27] = (-((-8815) & 29567)) & (-8197) & 32759;
        llllIllIIIll[28] = (-333) & 10109;
        llllIllIIIll[29] = 92 ^ 75;
    }

    private static boolean lIIlIIIlIllIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        if (lIIlIIIlIllIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String message = chatMessage.getMessage();
        if (lIIlIIIlIlIllII(message.contains(llllIllIIIlI[llllIllIIIll[21]]) ? 1 : 0)) {
            this.cW.k((boolean) llllIllIIIll[1]);
        } else if (lIIlIIIlIlIllII(message.contains(llllIllIIIlI[llllIllIIIll[22]]) ? 1 : 0) && lIIlIIIlIlIllII(Inventory.isFull() ? 1 : 0)) {
            this.dA.bi();
            "".length();
            if (lIIlIIIlIlIllIl(Inventory.isFull() ? 1 : 0)) {
                return;
            }
            EquipmentSetup equipmentSetup = ((BankLoadout) this.cV.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
            if (lIIlIIIlIlIllIl(equipmentSetup.isFullyEquipped() ? 1 : 0)) {
                Log.info(llllIllIIIlI[llllIllIIIll[23]]);
                equipmentSetup.swap();
            }
        }
    }

    private static void lIIlIIIlIlIlIlI() {
        llllIllIIIlI = new String[llllIllIIIll[29]];
        llllIllIIIlI[llllIllIIIll[0]] = lIIlIIIlIlIIlll("TLpOYQTnWTC2xtms1SB9R2WaZUpHQWXrzC3SC3NqdpVz05XnrDXVaw==", "zuGuY");
        llllIllIIIlI[llllIllIIIll[1]] = lIIlIIIlIlIlIII("KCEOHxwIOg==", "kNbsy");
        llllIllIIIlI[llllIllIIIll[4]] = lIIlIIIlIlIlIII("PRYGMTMucgA/KyoXACQuKRweUAkJci4VCwM3YxcCByBjAwIKNyAEAgJ+YxMGCDwsBEcFPS8cAgUmYxkTAz8wUQ==", "fRCpg");
        llllIllIIIlI[llllIllIIIll[5]] = lIIlIIIlIlIIlll("JOuHAAiGICh41kcU/U3rrEwHaykmMmBeVMVlf0vCKc1n9lsf7l6Fjw==", "bcDPQ");
        llllIllIIIlI[llllIllIIIll[6]] = lIIlIIIlIlIlIIl("isoJrmAl87c=", "KIasv");
        llllIllIIIlI[llllIllIIIll[7]] = lIIlIIIlIlIlIII("DyUvJyY8YSkpPjgkKTI7Oy8XKj07NWolPTgtLyUmPS4kZiU9JS0jJnQ1Lz4mdHxqPS8=", "TAJFR");
        llllIllIIIlI[llllIllIIIll[8]] = lIIlIIIlIlIlIII("LjI8OAwddjo2FBkzOi0RGjgENRcaInk6Fxk6PDoMHDk3eQ8cMj48DFU6MDcdBnZkeQMI", "uVYYx");
        llllIllIIIlI[llllIllIIIll[9]] = lIIlIIIlIlIIlll("FPyMqtERsdM=", "wIhEn");
        llllIllIIIlI[llllIllIIIll[10]] = lIIlIIIlIlIlIII("HTQhFTUOUCcbLQo1JwAoCT45dAcvHg0nCSMURDcOKhwBNxUvHwp0CDIVCSdPaF4QJgghFwEmBCJQBi1BeEBY", "FpdTa");
        llllIllIIIlI[llllIllIIIll[11]] = lIIlIIIlIlIlIIl("eqr3OP6qkq9TVEH0IvFUypHdMbsWVzHoYW2nzTaerkDIU8Z60apUakyDA2oKtrGb/AZ5nSZoQbs=", "QwBgf");
        llllIllIIIlI[llllIllIIIll[12]] = lIIlIIIlIlIIlll("gSDXLTXMkDo=", "wmFAt");
        llllIllIIIlI[llllIllIIIll[13]] = lIIlIIIlIlIlIII("EyU9Chct", "FKQet");
        llllIllIIIlI[llllIllIIIll[14]] = lIIlIIIlIlIlIIl("P7+d1TwLpkZXzJAk1QNMtw==", "kCRko");
        llllIllIIIlI[llllIllIIIll[15]] = lIIlIIIlIlIlIII("LRgbUQNpHxQAEmkWGw8DIR4bEVcvGAdWDiYC", "Iwuvw");
        llllIllIIIlI[llllIllIIIll[16]] = lIIlIIIlIlIlIII("LDYkGzw/UiIVJDs3Ig4hODw8ekAYHDYzDBAXFRIBExYENCsfEw89DRNbQTwBGRsSMg0TUgI1BBsXAi4BGBxBMxwSHxJ0Rlk=", "wraZh");
        llllIllIIIlI[llllIllIIIll[19]] = lIIlIIIlIlIlIIl("u3zWR51hZYSLoakZdMBqnw==", "wAjLM");
        llllIllIIIlI[llllIllIIIll[20]] = lIIlIIIlIlIIlll("tbnAES8QR0w=", "MiGxR");
        llllIllIIIlI[llllIllIIIll[21]] = lIIlIIIlIlIlIII("CyYDUSQGMwIYMxUiFFElDCoVUTkFZwkeIxFnGQUzDjQ=", "cGpqV");
        llllIllIIIlI[llllIllIIIll[22]] = lIIlIIIlIlIlIIl("4vPdKqMGdx9q++kuNZmxGKOj+KVMsPmE", "rdVUI");
        llllIllIIIlI[llllIllIIIll[23]] = lIIlIIIlIlIIlll("amEOGOspjPyJrt3+lGwBjZa/c/7lNSHKaOalr0Ak50uMaGrKbIziqA==", "mIwaR");
        llllIllIIIlI[llllIllIIIll[24]] = lIIlIIIlIlIlIIl("EjhKSIeSDyo=", "IkudZ");
        llllIllIIIlI[llllIllIIIll[25]] = lIIlIIIlIlIlIIl("PcZaGAUXadE=", "GsAGk");
        llllIllIIIlI[llllIllIIIll[26]] = lIIlIIIlIlIIlll("Mk3lDAOXW8M=", "SrhJs");
    }

    private static boolean lIIlIIIlIlIlllI(Object obj) {
        return obj != null;
    }

    static {
        lIIlIIIlIlIlIll();
        lIIlIIIlIlIlIlI();
        dw = llllIllIIIll[3];
        dx = llllIllIIIll[2];
        dv = LoggerFactory.getLogger(W.class);
        dy = new WorldPoint(llllIllIIIll[27], llllIllIIIll[28], llllIllIIIll[1]);
    }

    private static boolean lIIlIIIlIlIllII(int i) {
        return i != 0;
    }

    @Inject
    protected W(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h, C0015l c0015l, Client client) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
        this.dz = client;
        this.dA = c0015l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public boolean m() {
        if (lIIlIIIlIlIllII(this.cV.useFireSpells() ? 1 : 0)) {
            this.cW.t(llllIllIIIll[1]);
        }
        this.cW.k((boolean) llllIllIIIll[0]);
        int[] iArr = new int[llllIllIIIll[1]];
        iArr[llllIllIIIll[0]] = llllIllIIIll[17];
        Item first = Inventory.getFirst(iArr);
        if (lIIlIIIlIlIllll(first)) {
            int[] iArr2 = new int[llllIllIIIll[1]];
            iArr2[llllIllIIIll[0]] = llllIllIIIll[18];
            first = Inventory.getFirst(iArr2);
        }
        this.cW.b((boolean) llllIllIIIll[1]);
        if (lIIlIIIlIlIlllI(first)) {
            String[] strArr = new String[llllIllIIIll[4]];
            strArr[llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[19]];
            strArr[llllIllIIIll[1]] = llllIllIIIlI[llllIllIIIll[20]];
            first.interact(strArr);
        }
        return llllIllIIIll[1];
    }

    private static String lIIlIIIlIlIIlll(String lllllllllllllllIIlIllIIIIllIlllI, String lllllllllllllllIIlIllIIIIllIllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIIllIllll.getBytes(StandardCharsets.UTF_8)), llllIllIIIll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIllIIIll[4], lllllllllllllllIIlIllIIIIlllIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIIIlllIIIl) {
            lllllllllllllllIIlIllIIIIlllIIIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(WidgetHiddenChanged widgetHiddenChanged) {
        if (lIIlIIIlIlIlllI(widgetHiddenChanged.getWidget().getText()) && lIIlIIIlIlIllII(Text.sanitizeMultilineText(widgetHiddenChanged.getWidget().getText().toLowerCase()).contains(llllIllIIIlI[llllIllIIIll[15]]) ? 1 : 0)) {
            dv.info(llllIllIIIlI[llllIllIIIll[16]]);
            m();
            "".length();
        }
    }

    private static boolean lIIlIIIlIlIllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v108, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v53, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.Y, s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (lIIlIIIlIlIllII(Dialog.isOpen() ? 1 : 0) && lIIlIIIlIlIllII(Dialog.getName().contains(llllIllIIIlI[llllIllIIIll[0]]) ? 1 : 0)) {
            this.cW.k((boolean) llllIllIIIll[1]);
        }
        if (lIIlIIIlIlIllIl(this.cW.ad() ? 1 : 0)) {
            return llllIllIIIll[0];
        }
        if (lIIlIIIlIlIllII(Bank.isPinWindowOpen() ? 1 : 0)) {
            return Bank.enterBankPin();
        }
        if (lIIlIIIlIlIllIl(Movement.shouldWalk() ? 1 : 0)) {
            return llllIllIIIll[0];
        }
        Widget widget = this.dz.getWidget(llllIllIIIll[2]);
        Widget widget2 = this.dz.getWidget(llllIllIIIll[3]);
        Widget widget3 = Static.getClient().getWidget(WidgetInfo.DIALOG_NPC_TEXT);
        NPC nearest = NPCs.getNearest(npc -> {
            if (lIIlIIIlIlIllII(npc.getName().contains(llllIllIIIlI[llllIllIIIll[25]]) ? 1 : 0)) {
                String[] strArr = new String[llllIllIIIll[1]];
                strArr[llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[26]];
                if (lIIlIIIlIlIllII(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = llllIllIIIll[1];
                    "".length();
                    return "   ".length() == (-" ".length()) ? ((211 ^ 168) ^ (77 ^ 25)) & (((((35 + 59) - (-56)) + 28) ^ (((99 + 18) - (-8)) + 32)) ^ (-" ".length())) : r0;
                }
            }
            return llllIllIIIll[0];
        });
        if (!lIIlIIIlIlIlllI(nearest) || lIIlIIIlIlIllIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Movement.walkTo(dy);
            "".length();
            return llllIllIIIll[1];
        }
        if (lIIlIIIlIlIllIl(Widgets.isVisible(widget2) ? 1 : 0) && lIIlIIIlIlIllIl(Widgets.isVisible(widget) ? 1 : 0) && lIIlIIIlIlIllIl(Widgets.isVisible(widget3) ? 1 : 0) && lIIlIIIlIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            nearest.interact(llllIllIIIlI[llllIllIIIll[1]]);
        }
        EquipmentSetup equipmentSetup = ((BankLoadout) this.cV.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
        if (lIIlIIIlIlIllll(equipmentSetup)) {
            dv.info(llllIllIIIlI[llllIllIIIll[4]]);
            return llllIllIIIll[0];
        }
        if (lIIlIIIlIlIllIl(equipmentSetup.isFullyEquipped() ? 1 : 0)) {
            Log.info(llllIllIIIlI[llllIllIIIll[5]]);
            equipmentSetup.swap();
            sleep(llllIllIIIll[4]);
        }
        if (lIIlIIIlIlIllII(this.dA.bi() ? 1 : 0)) {
            sleep(llllIllIIIll[1]);
            return llllIllIIIll[1];
        }
        if (lIIlIIIlIlIllII(Widgets.isVisible(widget) ? 1 : 0)) {
            String text = widget.getText();
            String[] split = text.split(llllIllIIIlI[llllIllIIIll[6]]);
            dv.debug(llllIllIIIlI[llllIllIIIll[7]], text);
            dv.debug(llllIllIIIlI[llllIllIIIll[8]], Arrays.stream(split).collect(Collectors.toList()));
            if (lIIlIIIlIlIllII(split[llllIllIIIll[0]].contains(llllIllIIIlI[llllIllIIIll[9]]) ? 1 : 0)) {
                dv.debug(llllIllIIIlI[llllIllIIIll[10]]);
                m();
                "".length();
                return llllIllIIIll[1];
            }
        }
        if (lIIlIIIlIlIllII(Inventory.isFull() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[llllIllIIIll[1]];
                strArr[llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[24]];
                return item.hasAction(strArr);
            });
            String str = llllIllIIIlI[llllIllIIIll[11]];
            Object[] objArr = new Object[llllIllIIIll[1]];
            objArr[llllIllIIIll[0]] = first;
            Log.info(str, objArr);
            if (lIIlIIIlIlIlllI(first)) {
                first.interact(llllIllIIIlI[llllIllIIIll[12]]);
            }
        }
        if (lIIlIIIlIlIllII(Widgets.isVisible(widget2) ? 1 : 0)) {
            String[] strArr = new String[llllIllIIIll[4]];
            strArr[llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[13]];
            strArr[llllIllIIIll[1]] = llllIllIIIlI[llllIllIIIll[14]];
            widget2.interact(strArr);
            return lIIlIIIlIlIllII(Bank.isPinWindowOpen() ? 1 : 0) ? Bank.enterBankPin() : llllIllIIIll[1];
        }
        return llllIllIIIll[1];
    }
}
