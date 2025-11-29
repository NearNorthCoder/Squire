package g.r.r.p000.t.q.i.u.o.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.DialogOption;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Repairing Pouches", priority = 13, blocking = true, register = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.C  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/C.class */
public class C extends h {
    private /* synthetic */ int bm;
    private static /* synthetic */ String[] llIIllIIllll;
    private /* synthetic */ boolean bj;
    private /* synthetic */ int bn;
    private /* synthetic */ int bl;
    private static /* synthetic */ int[] llIIllIlIIII;
    private /* synthetic */ int bk;

    private static boolean llllllIIllIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllllIIllIllI(int i, int i2) {
        return i > i2;
    }

    private static boolean llllllIIlllIII(Object obj) {
        return obj == null;
    }

    private static boolean llllllIIlllIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void llllllIIlIllIl() {
        llIIllIIllll = new String[llIIllIlIIII[7]];
        llIIllIIllll[llIIllIlIIII[0]] = llllllIIlIlIll("vIu++F8OdUU=", "WECtL");
        llIIllIIllll[llIIllIlIIII[1]] = llllllIIlIllII("maDmPFBOrnryJpuP6itb4SrDgZn3JY0E", "vJpXh");
        llIIllIIllll[llIIllIlIIII[2]] = llllllIIlIllII("qSU0tz5Xw5k5kHTd3/dGcwl1LTvA84kmeoL4odiOSBw=", "JFLqc");
        llIIllIIllll[llIIllIlIIII[6]] = llllllIIlIllII("cI2100uU21YKsl2JwqGI11ISal2gJp0p", "GdJgO");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v53, types: [boolean] */
    private boolean am() {
        if (llllllIIllIIIl(this.bm, llIIllIlIIII[2])) {
            return llIIllIlIIII[0];
        }
        int[] iArr = new int[llIIllIlIIII[1]];
        iArr[llIIllIlIIII[0]] = llIIllIlIIII[3];
        NPC nearest = NPCs.getNearest(iArr);
        if (!llllllIIllIIlI(nearest) || llllllIIlIllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            return llIIllIlIIII[0];
        }
        if (llllllIIllIIll(Static.getClient().getTickCount() - this.bn, llIIllIlIIII[4])) {
            return llIIllIlIIII[1];
        }
        if (llllllIIllIIII(Dialog.isOpen() ? 1 : 0) && llllllIIlIllll(this.bm)) {
            DialogOption[] dialogOptionArr = new DialogOption[llIIllIlIIII[5]];
            dialogOptionArr[llIIllIlIIII[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[llIIllIlIIII[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[llIIllIlIIII[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[llIIllIlIIII[6]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[llIIllIlIIII[7]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
            this.bm = llIIllIlIIII[1];
            this.bn = Static.getClient().getTickCount();
            "".length();
            if (((144 ^ 159) & ((150 ^ 153) ^ (-1))) >= (1 ^ 5)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else if (llllllIIllIIII(Dialog.isOpen() ? 1 : 0) && llllllIIllIIIl(this.bm, llIIllIlIIII[1])) {
            DialogOption[] dialogOptionArr2 = new DialogOption[llIIllIlIIII[8]];
            dialogOptionArr2[llIIllIlIIII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[llIIllIlIIII[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[llIIllIlIIII[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[llIIllIlIIII[6]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[llIIllIlIIII[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[llIIllIlIIII[5]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[llIIllIlIIII[9]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[llIIllIlIIII[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[llIIllIlIIII[4]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr2);
            this.bm = llIIllIlIIII[2];
            e[] values = e.values();
            int length = values.length;
            int i = llIIllIlIIII[0];
            while (llllllIIllIlII(i, length)) {
                values[i].a(llIIllIlIIII[0]);
                i++;
                "".length();
                if ((130 ^ 134) < ((59 ^ 2) & ((14 ^ 55) ^ (-1)))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            "".length();
            if ((((((115 + 99) - 158) + 119) ^ (((32 + 47) - 35) + 139)) & (((((58 + 52) - 63) + 113) ^ (((28 + 58) - (-75)) + 23)) ^ (-" ".length()))) != 0) {
                return ((((162 + 31) - 26) + 18) ^ (((150 + 171) - 284) + 140)) & (((100 ^ 44) ^ (194 ^ 130)) ^ (-" ".length()));
            }
        } else if (llllllIIlIllll(Dialog.isOpen() ? 1 : 0)) {
            nearest.interact(llIIllIIllll[llIIllIlIIII[0]]);
        }
        return llIIllIlIIII[1];
    }

    private static boolean llllllIIllIIIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llllllIIlllIIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) || llllllIIlIllll(chatMessage.getMessage().contains(llIIllIIllll[llIIllIlIIII[6]]) ? 1 : 0)) {
            return;
        }
        this.bm = llIIllIlIIII[0];
        this.bj = llIIllIlIIII[0];
    }

    private static boolean llllllIIllIlIl(int i) {
        return i > 0;
    }

    private static String llllllIIlIllII(String lllllllllllllllIlIIllIlIlIllllIl, String lllllllllllllllIlIIllIlIlIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIlIllllII.getBytes(StandardCharsets.UTF_8)), llIIllIlIIII[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllIlIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIlIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIlIlIlllllI) {
            lllllllllllllllIlIIllIlIlIlllllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean d(String str) {
        Widget widget = Widgets.get(WidgetInfo.DIALOG_NPC_TEXT);
        return llllllIIlllIII(widget) ? llIIllIlIIII[0] : widget.getText().contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean ao() {
        e[] values = e.values();
        int length = values.length;
        int i = llIIllIlIIII[0];
        while (llllllIIllIlII(i, length)) {
            if (llllllIIllIIII(values[i].af() ? 1 : 0)) {
                return llIIllIlIIII[1];
            }
            i++;
            "".length();
            if ("  ".length() > (171 ^ 175)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIllIlIIII[0];
    }

    private static String llllllIIlIlIll(String lllllllllllllllIlIIllIlIllIIlIlI, String lllllllllllllllIlIIllIlIllIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIlIllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIlIllIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIlIllIIllII.init(llIIllIlIIII[2], lllllllllllllllIlIIllIlIllIIllIl);
            return new String(lllllllllllllllIlIIllIlIllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIlIllIIlIll) {
            lllllllllllllllIlIIllIlIllIIlIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    public C(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, new EnumC0002c[llIIllIlIIII[0]]);
        this.bj = llIIllIlIIII[1];
        this.bm = llIIllIlIIII[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean aj() {
        return llIIllIlIIII[1];
    }

    private static boolean llllllIIlIllll(int i) {
        return i == 0;
    }

    private static boolean llllllIIllIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean llllllIIllIIII(int i) {
        return i != 0;
    }

    private static boolean llllllIIllIIll(int i, int i2) {
        return i <= i2;
    }

    private static void llllllIIlIlllI() {
        llIIllIlIIII = new int[14];
        llIIllIlIIII[0] = (34 ^ 127) & ((59 ^ 102) ^ (-1));
        llIIllIlIIII[1] = " ".length();
        llIIllIlIIII[2] = "  ".length();
        llIIllIlIIII[3] = (-16428) & 28607;
        llIIllIlIIII[4] = (62 ^ 75) ^ (80 ^ 45);
        llIIllIlIIII[5] = (221 ^ 150) ^ (39 ^ 105);
        llIIllIlIIII[6] = "   ".length();
        llIIllIlIIII[7] = (102 ^ 90) ^ (172 ^ 148);
        llIIllIlIIII[8] = 31 ^ 22;
        llIIllIlIIII[9] = (239 ^ 184) ^ (112 ^ 33);
        llIIllIlIIII[10] = 94 ^ 89;
        llIIllIlIIII[11] = ((65 + 9) - 70) + 196;
        llIIllIlIIII[12] = (-((-363) & 26475)) & (-2177) & 32701;
        llIIllIlIIII[13] = -" ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v56, types: [boolean] */
    private boolean an() {
        if (llllllIIllIlIl(this.bk)) {
            this.bk -= llIIllIlIIII[1];
            return llIIllIlIIII[1];
        }
        int tickCount = Static.getClient().getTickCount();
        if (llllllIIllIIII(d(llIIllIIllll[llIIllIlIIII[1]]) ? 1 : 0)) {
            DialogOption[] dialogOptionArr = new DialogOption[llIIllIlIIII[9]];
            dialogOptionArr[llIIllIlIIII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[llIIllIlIIII[1]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[llIIllIlIIII[2]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[llIIllIlIIII[6]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[llIIllIlIIII[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[llIIllIlIIII[5]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
            e[] values = e.values();
            int length = values.length;
            int i = llIIllIlIIII[0];
            while (llllllIIllIlII(i, length)) {
                values[i].a(llIIllIlIIII[0]);
                i++;
                "".length();
                if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            this.bj = llIIllIlIIII[1];
            this.bl = tickCount;
            return llIIllIlIIII[1];
        } else if (llllllIIllIIII(this.bj ? 1 : 0) && llllllIIllIllI(tickCount - this.bl, llIIllIlIIII[11]) && llllllIIllIlll(this.aV.m(), EnumC0002c.ACTIVATING)) {
            this.bj = llIIllIlIIII[0];
            return llIIllIlIIII[1];
        } else if (llllllIIllIIII(this.bj ? 1 : 0)) {
            return llIIllIlIIII[0];
        } else {
            if (!llllllIIllIIII(Dialog.isViewingOptions() ? 1 : 0)) {
                SpellBook.Lunar lunar = SpellBook.Lunar.NPC_CONTACT;
                if (!llllllIIllIlll(SpellBook.getCurrent(), SpellBook.LUNAR) || llllllIIlIllll(lunar.canCast() ? 1 : 0)) {
                    return llIIllIlIIII[0];
                }
                if (llllllIIllIIIl(Players.getLocal().getAnimation(), llIIllIlIIII[12])) {
                    return llIIllIlIIII[1];
                }
                int id = lunar.getWidget().getId();
                Widget widget = Widgets.get(lunar.getWidget());
                if (llllllIIlllIII(widget)) {
                    return llIIllIlIIII[0];
                }
                widget.interact(llIIllIlIIII[2], MenuAction.CC_OP.getId(), llIIllIlIIII[13], id);
                this.bk = llIIllIlIIII[9];
                return llIIllIlIIII[1];
            }
            String[] strArr = new String[llIIllIlIIII[1]];
            strArr[llIIllIlIIII[0]] = llIIllIIllll[llIIllIlIIII[2]];
            Dialog.chooseOption(strArr);
            "".length();
            e[] values2 = e.values();
            int length2 = values2.length;
            int i2 = llIIllIlIIII[0];
            while (llllllIIllIlII(i2, length2)) {
                values2[i2].a(llIIllIlIIII[0]);
                i2++;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            this.bj = llIIllIlIIII[1];
            this.bl = tickCount;
            return llIIllIlIIII[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean e(String str) {
        Widget widget = Widgets.get(WidgetInfo.DIALOG_PLAYER_TEXT);
        return llllllIIlllIII(widget) ? llIIllIlIIII[0] : widget.getText().contains(str);
    }

    private static boolean llllllIIllIIlI(Object obj) {
        return obj != null;
    }

    static {
        llllllIIlIlllI();
        llllllIIlIllIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        if (llllllIIlIllll(this.aV.w().repairPouches() ? 1 : 0)) {
            return llIIllIlIIII[0];
        }
        if (llllllIIllIIII(ao() ? 1 : 0) && llllllIIllIIIl(this.bm, llIIllIlIIII[2])) {
            this.bm = llIIllIlIIII[0];
            return llIIllIlIIII[0];
        } else if (llllllIIllIIII(this.aV.w().usePearls() ? 1 : 0)) {
            if (llllllIIlIllll(ao() ? 1 : 0)) {
                this.bm = llIIllIlIIII[2];
                return llIIllIlIIII[0];
            }
            return am();
        } else {
            return an();
        }
    }
}
