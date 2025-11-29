/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.magic.SpellBook$Lunar
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package g.r.r.-.t.q.i.u.o.e.s;

import com.google.inject.Inject;
import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.e;
import g.r.r.-.t.q.i.u.o.e.s.h;
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
import net.runelite.api.Locatable;
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

@TaskDesc(name="Repairing Pouches", priority=13, blocking=true, register=true)
public class C
extends h {
    private /* synthetic */ int bm;
    private static /* synthetic */ String[] llIIllIIllll;
    private /* synthetic */ boolean bj;
    private /* synthetic */ int bn;
    private /* synthetic */ int bl;
    private static /* synthetic */ int[] llIIllIlIIII;
    private /* synthetic */ int bk;

    private static boolean llllllIIllIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllllIIllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllllIIlllIII(Object object) {
        return object == null;
    }

    private static boolean llllllIIlllIIl(Object object, Object object2) {
        return object != object2;
    }

    private static void llllllIIlIllIl() {
        llIIllIIllll = new String[llIIllIlIIII[7]];
        C.llIIllIIllll[C.llIIllIlIIII[0]] = C."Talk-to";
        C.llIIllIIllll[C.llIIllIlIIII[1]] = C."What do you want?";
        C.llIIllIIllll[C.llIIllIlIIII[2]] = C."Can you repair my pouches?";
        C.llIIllIIllll[C.llIIllIlIIII[6]] = C."Your pouch has decayed";
    }

    private boolean am() {
        C lllllllllllllllIlIIllIlIllllIlll;
        if (C.llllllIIllIIIl(this.bm, llIIllIlIIII[2])) {
            return llIIllIlIIII[0];
        }
        int[] nArray = new int[llIIllIlIIII[1]];
        nArray[C.llIIllIlIIII[0]] = llIIllIlIIII[3];
        NPC lllllllllllllllIlIIllIlIllllIllI = NPCs.getNearest((int[])nArray);
        if (!C.llllllIIllIIlI(lllllllllllllllIlIIllIlIllllIllI) || C.llllllIIlIllll(Reachable.isInteractable((Locatable)lllllllllllllllIlIIllIlIllllIllI) ? 1 : 0)) {
            return llIIllIlIIII[0];
        }
        if (C.llllllIIllIIll(Static.getClient().getTickCount() - lllllllllllllllIlIIllIlIllllIlll.bn, llIIllIlIIII[4])) {
            return llIIllIlIIII[1];
        }
        if (C.llllllIIllIIII(Dialog.isOpen() ? 1 : 0) && C.llllllIIlIllll(lllllllllllllllIlIIllIlIllllIlll.bm)) {
            DialogOption[] dialogOptionArray = new DialogOption[llIIllIlIIII[5]];
            dialogOptionArray[C.llIIllIlIIII[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[C.llIIllIlIIII[6]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[7]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            lllllllllllllllIlIIllIlIllllIlll.bm = llIIllIlIIII[1];
            lllllllllllllllIlIIllIlIllllIlll.bn = Static.getClient().getTickCount();
            0;
            if (((0x90 ^ 0x9F) & ~(0x96 ^ 0x99)) >= (1 ^ 5)) {
                return ((0xFC ^ 0xAD) & ~(0xF2 ^ 0xA3)) != 0;
            }
        } else if (C.llllllIIllIIII(Dialog.isOpen() ? 1 : 0) && C.llllllIIllIIIl(lllllllllllllllIlIIllIlIllllIlll.bm, llIIllIlIIII[1])) {
            DialogOption[] dialogOptionArray = new DialogOption[llIIllIlIIII[8]];
            dialogOptionArray[C.llIIllIlIIII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[6]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[5]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[9]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[4]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            lllllllllllllllIlIIllIlIllllIlll.bm = llIIllIlIIII[2];
            e[] lllllllllllllllIlIIllIlIllllIlIl = e.values();
            int lllllllllllllllIlIIllIlIllllIlII = lllllllllllllllIlIIllIlIllllIlIl.length;
            int lllllllllllllllIlIIllIlIllllIIll = llIIllIlIIII[0];
            while (C.llllllIIllIlII(lllllllllllllllIlIIllIlIllllIIll, lllllllllllllllIlIIllIlIllllIlII)) {
                e lllllllllllllllIlIIllIlIllllIIlI = lllllllllllllllIlIIllIlIllllIlIl[lllllllllllllllIlIIllIlIllllIIll];
                lllllllllllllllIlIIllIlIllllIIlI.a(llIIllIlIIII[0]);
                ++lllllllllllllllIlIIllIlIllllIIll;
                0;
                if ((0x82 ^ 0x86) >= ((0x3B ^ 2) & ~(0xE ^ 0x37))) continue;
                return ((0xB5 ^ 0xAE) & ~(0x26 ^ 0x3D)) != 0;
            }
            0;
            if (((115 + 99 - 158 + 119 ^ 32 + 47 - 35 + 139) & (58 + 52 - 63 + 113 ^ 28 + 58 - -75 + 23 ^ -1)) != 0) {
                return ((162 + 31 - 26 + 18 ^ 150 + 171 - 284 + 140) & (0x64 ^ 0x2C ^ (0xC2 ^ 0x82) ^ -1)) != 0;
            }
        } else if (C.llllllIIlIllll(Dialog.isOpen() ? 1 : 0)) {
            lllllllllllllllIlIIllIlIllllIllI.interact(llIIllIIllll[llIIllIlIIII[0]]);
        }
        return llIIllIlIIII[1];
    }

    private static boolean llllllIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllIlIIllIlIllIlIIlI;
        if (C.llllllIIlllIIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (C.llllllIIlIllll(lllllllllllllllIlIIllIlIllIlIIlI.getMessage().contains(llIIllIIllll[llIIllIlIIII[6]]) ? 1 : 0)) {
            return;
        }
        this.bm = llIIllIlIIII[0];
        this.bj = llIIllIlIIII[0];
    }

    private static boolean llllllIIllIlIl(int n2) {
        return n2 > 0;
    }

    private static String llllllIIlIllII(String lllllllllllllllIlIIllIlIlIlllIll, String lllllllllllllllIlIIllIlIlIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIlIllIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIlIlllIlI.getBytes(StandardCharsets.UTF_8)), llIIllIlIIII[4]), "DES");
            Cipher lllllllllllllllIlIIllIlIlIllllll = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIlIlIllllll.init(llIIllIlIIII[2], lllllllllllllllIlIIllIlIllIIIIII);
            return new String(lllllllllllllllIlIIllIlIlIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIlIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIlIlIlllllI) {
            lllllllllllllllIlIIllIlIlIlllllI.printStackTrace();
            return null;
        }
    }

    public boolean d(String string) {
        Widget widget = Widgets.get((WidgetInfo)WidgetInfo.DIALOG_NPC_TEXT);
        if (C.llllllIIlllIII(widget)) {
            return llIIllIlIIII[0];
        }
        return widget.getText().contains(string);
    }

    /*
     * WARNING - void declaration
     */
    private boolean ao() {
        void lllllllllllllllIlIIllIlIlllIIIII;
        e[] eArray = e.values();
        int n2 = eArray.length;
        int lllllllllllllllIlIIllIlIllIlllll = llIIllIlIIII[0];
        while (C.llllllIIllIlII(lllllllllllllllIlIIllIlIllIlllll, (int)lllllllllllllllIlIIllIlIlllIIIII)) {
            void lllllllllllllllIlIIllIlIlllIIIIl;
            void lllllllllllllllIlIIllIlIllIllllI = lllllllllllllllIlIIllIlIlllIIIIl[lllllllllllllllIlIIllIlIllIlllll];
            if (C.llllllIIllIIII(lllllllllllllllIlIIllIlIllIllllI.af() ? 1 : 0)) {
                return llIIllIlIIII[1];
            }
            ++lllllllllllllllIlIIllIlIllIlllll;
            0;
            if (2 <= (0xAB ^ 0xAF)) continue;
            return ((0x52 ^ 0x4F) & ~(0xD8 ^ 0xC5)) != 0;
        }
        return llIIllIlIIII[0];
    }

    private static String llllllIIlIlIll(String lllllllllllllllIlIIllIlIllIIlIII, String lllllllllllllllIlIIllIlIllIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIlIllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIlIllIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIlIllIIllII.init(llIIllIlIIII[2], lllllllllllllllIlIIllIlIllIIllIl);
            return new String(lllllllllllllllIlIIllIlIllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIlIllIIlIll) {
            lllllllllllllllIlIIllIlIllIIlIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public C(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, new c[llIIllIlIIII[0]]);
        this.bj = llIIllIlIIII[1];
        this.bm = llIIllIlIIII[2];
    }

    @Override
    protected boolean aj() {
        return llIIllIlIIII[1];
    }

    private static boolean llllllIIlIllll(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIIllIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIIllIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llllllIIlIlllI() {
        llIIllIlIIII = new int[14];
        C.llIIllIlIIII[0] = (0x22 ^ 0x7F) & ~(0x3B ^ 0x66);
        C.llIIllIlIIII[1] = 1;
        C.llIIllIlIIII[2] = 2;
        C.llIIllIlIIII[3] = 0xFFFFBFD4 & 0x6FBF;
        C.llIIllIlIIII[4] = 0x3E ^ 0x4B ^ (0x50 ^ 0x2D);
        C.llIIllIlIIII[5] = 0xDD ^ 0x96 ^ (0x27 ^ 0x69);
        C.llIIllIlIIII[6] = 3;
        C.llIIllIlIIII[7] = 0x66 ^ 0x5A ^ (0xAC ^ 0x94);
        C.llIIllIlIIII[8] = 0x1F ^ 0x16;
        C.llIIllIlIIII[9] = 0xEF ^ 0xB8 ^ (0x70 ^ 0x21);
        C.llIIllIlIIII[10] = 0x5E ^ 0x59;
        C.llIIllIlIIII[11] = 65 + 9 - 70 + 196;
        C.llIIllIlIIII[12] = -(0xFFFFFE95 & 0x676B) & (0xFFFFF77F & 0x7FBD);
        C.llIIllIlIIII[13] = -1;
    }

    /*
     * WARNING - void declaration
     */
    private boolean an() {
        void var3_7;
        void var4_10;
        C lllllllllllllllIlIIllIlIlllIlIll;
        if (C.llllllIIllIlIl(this.bk)) {
            this.bk -= llIIllIlIIII[1];
            return llIIllIlIIII[1];
        }
        int lllllllllllllllIlIIllIlIlllIlIlI = Static.getClient().getTickCount();
        if (C.llllllIIllIIII(lllllllllllllllIlIIllIlIlllIlIll.d(llIIllIIllll[llIIllIlIIII[1]]) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[llIIllIlIIII[9]];
            dialogOptionArray[C.llIIllIlIIII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[1]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[C.llIIllIlIIII[2]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[6]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[5]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            e[] lllllllllllllllIlIIllIlIlllIlIIl = e.values();
            int lllllllllllllllIlIIllIlIlllIlIII = lllllllllllllllIlIIllIlIlllIlIIl.length;
            int lllllllllllllllIlIIllIlIlllIIlll = llIIllIlIIII[0];
            while (C.llllllIIllIlII(lllllllllllllllIlIIllIlIlllIIlll, lllllllllllllllIlIIllIlIlllIlIII)) {
                e lllllllllllllllIlIIllIlIlllIIllI = lllllllllllllllIlIIllIlIlllIlIIl[lllllllllllllllIlIIllIlIlllIIlll];
                lllllllllllllllIlIIllIlIlllIIllI.a(llIIllIlIIII[0]);
                ++lllllllllllllllIlIIllIlIlllIIlll;
                0;
                if (((0xE3 ^ 0xAE) & ~(0xD6 ^ 0x9B)) == ((0xFE ^ 0xA4) & ~(0x54 ^ 0xE))) continue;
                return ((0x4A ^ 0x28) & ~(0x3D ^ 0x5F)) != 0;
            }
            lllllllllllllllIlIIllIlIlllIlIll.bj = llIIllIlIIII[1];
            lllllllllllllllIlIIllIlIlllIlIll.bl = lllllllllllllllIlIIllIlIlllIlIlI;
            return llIIllIlIIII[1];
        }
        if (C.llllllIIllIIII(lllllllllllllllIlIIllIlIlllIlIll.bj ? 1 : 0) && C.llllllIIllIllI(lllllllllllllllIlIIllIlIlllIlIlI - lllllllllllllllIlIIllIlIlllIlIll.bl, llIIllIlIIII[11]) && C.llllllIIllIlll((Object)lllllllllllllllIlIIllIlIlllIlIll.aV.m(), (Object)c.ACTIVATING)) {
            lllllllllllllllIlIIllIlIlllIlIll.bj = llIIllIlIIII[0];
            return llIIllIlIIII[1];
        }
        if (C.llllllIIllIIII(lllllllllllllllIlIIllIlIlllIlIll.bj ? 1 : 0)) {
            return llIIllIlIIII[0];
        }
        if (C.llllllIIllIIII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[llIIllIlIIII[1]];
            stringArray[C.llIIllIlIIII[0]] = llIIllIIllll[llIIllIlIIII[2]];
            Dialog.chooseOption((String[])stringArray);
            0;
            e[] lllllllllllllllIlIIllIlIlllIlIIl = e.values();
            int lllllllllllllllIlIIllIlIlllIlIII = lllllllllllllllIlIIllIlIlllIlIIl.length;
            int lllllllllllllllIlIIllIlIlllIIlll = llIIllIlIIII[0];
            while (C.llllllIIllIlII(lllllllllllllllIlIIllIlIlllIIlll, lllllllllllllllIlIIllIlIlllIlIII)) {
                e lllllllllllllllIlIIllIlIlllIIllI = lllllllllllllllIlIIllIlIlllIlIIl[lllllllllllllllIlIIllIlIlllIIlll];
                lllllllllllllllIlIIllIlIlllIIllI.a(llIIllIlIIII[0]);
                ++lllllllllllllllIlIIllIlIlllIIlll;
                0;
                if (2 == 2) continue;
                return ((0x41 ^ 0x54) & ~(0x33 ^ 0x26)) != 0;
            }
            lllllllllllllllIlIIllIlIlllIlIll.bj = llIIllIlIIII[1];
            lllllllllllllllIlIIllIlIlllIlIll.bl = lllllllllllllllIlIIllIlIlllIlIlI;
            return llIIllIlIIII[1];
        }
        SpellBook.Lunar lllllllllllllllIlIIllIlIlllIlIIl = SpellBook.Lunar.NPC_CONTACT;
        if (!C.llllllIIllIlll(SpellBook.getCurrent(), SpellBook.LUNAR) || C.llllllIIlIllll(lllllllllllllllIlIIllIlIlllIlIIl.canCast() ? 1 : 0)) {
            return llIIllIlIIII[0];
        }
        if (C.llllllIIllIIIl(Players.getLocal().getAnimation(), llIIllIlIIII[12])) {
            return llIIllIlIIII[1];
        }
        int lllllllllllllllIlIIllIlIlllIlIII = lllllllllllllllIlIIllIlIlllIlIIl.getWidget().getId();
        Widget lllllllllllllllIlIIllIlIlllIIlll = Widgets.get((WidgetInfo)lllllllllllllllIlIIllIlIlllIlIIl.getWidget());
        if (C.llllllIIlllIII(lllllllllllllllIlIIllIlIlllIIlll)) {
            return llIIllIlIIII[0];
        }
        var4_10.interact(llIIllIlIIII[2], MenuAction.CC_OP.getId(), llIIllIlIIII[13], (int)var3_7);
        this.bk = llIIllIlIIII[9];
        return llIIllIlIIII[1];
    }

    public boolean e(String string) {
        Widget widget = Widgets.get((WidgetInfo)WidgetInfo.DIALOG_PLAYER_TEXT);
        if (C.llllllIIlllIII(widget)) {
            return llIIllIlIIII[0];
        }
        return widget.getText().contains(string);
    }

    private static boolean llllllIIllIIlI(Object object) {
        return object != null;
    }

    static {
        C.llllllIIlIlllI();
        C.llllllIIlIllIl();
    }

    @Override
    protected boolean ak() {
        C lllllllllllllllIlIIllIlIlllllllI;
        if (C.llllllIIlIllll(this.aV.w().repairPouches() ? 1 : 0)) {
            return llIIllIlIIII[0];
        }
        if (C.llllllIIllIIII(lllllllllllllllIlIIllIlIlllllllI.ao() ? 1 : 0) && C.llllllIIllIIIl(lllllllllllllllIlIIllIlIlllllllI.bm, llIIllIlIIII[2])) {
            lllllllllllllllIlIIllIlIlllllllI.bm = llIIllIlIIII[0];
            return llIIllIlIIII[0];
        }
        if (C.llllllIIllIIII(lllllllllllllllIlIIllIlIlllllllI.aV.w().usePearls() ? 1 : 0)) {
            if (C.llllllIIlIllll(lllllllllllllllIlIIllIlIlllllllI.ao() ? 1 : 0)) {
                lllllllllllllllIlIIllIlIlllllllI.bm = llIIllIlIIII[2];
                return llIIllIlIIII[0];
            }
            return lllllllllllllllIlIIllIlIlllllllI.am();
        }
        return this.an();
    }
}

