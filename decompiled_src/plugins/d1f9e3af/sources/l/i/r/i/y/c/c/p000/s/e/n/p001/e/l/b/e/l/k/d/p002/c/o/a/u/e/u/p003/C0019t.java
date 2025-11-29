package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.t  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/t.class */
public class C0019t implements W {
    public static /* synthetic */ boolean cv;
    private static /* synthetic */ int[] llIIIIIIl;
    static /* synthetic */ int cl;
    public static /* synthetic */ boolean cz;
    private static /* synthetic */ WorldPoint cH;
    private static /* synthetic */ WorldPoint cG;
    private static /* synthetic */ WorldPoint cC;
    private static /* synthetic */ WorldPoint cB;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ boolean cy;
    public static /* synthetic */ boolean cw;
    static /* synthetic */ int cA;
    static /* synthetic */ boolean cm;
    private static /* synthetic */ WorldPoint cE;
    private static /* synthetic */ String[] bR;
    private static /* synthetic */ WorldPoint cD;
    public static /* synthetic */ boolean cx;
    private static /* synthetic */ WorldPoint cF;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ String[] lIllllIll;

    private static void lIlIIIIIllll() {
        lIllllIll = new String[llIIIIIIl[125]];
        lIllllIll[llIIIIIIl[1]] = lIIllllIllIl("GnNGbd3pG0oARa/hPoPnAcwvnJQHQUXUDQXnLRnKUsveO8QROatioKvQYtdQ1jRv", "QGeAB");
        lIllllIll[llIIIIIIl[0]] = lIIllllllIIl("BCwSTi4lbQYPNCE=", "JMdnZ");
        lIllllIll[llIIIIIIl[5]] = lIIllllllIlI("8fmfR394QiA+fgREsC3E9r9dD22XsXdf", "BIGUf");
        lIllllIll[llIIIIIIl[10]] = lIIllllllIlI("Vr73fp/RlklRqpS5AxzjVI8VYVtprxhlAtOT67bagfM7yl7RU4Tu3tppkGrgd8hCAbQmuPvCl/w=", "HUlvQ");
        lIllllIll[llIIIIIIl[6]] = lIIllllIllIl("asG1TbLjt+Y=", "PknCx");
        lIllllIll[llIIIIIIl[13]] = lIIllllIllIl("6/eD56bsnUg=", "VYsfP");
        lIllllIll[llIIIIIIl[17]] = lIIllllllIlI("Fzv2AKEuy0af3CziEqsddg==", "alUzo");
        lIllllIll[llIIIIIIl[18]] = lIIllllIllIl("ObGWt2lar8sci7jnCFceCA==", "EjAuC");
        lIllllIll[llIIIIIIl[2]] = lIIllllIllIl("07BYzAP5kyk=", "JJzjp");
        lIllllIll[llIIIIIIl[24]] = lIIllllllIlI("fUXMM3Mu7Au3/OZbsUB/BtaO3Wycxi5D", "WtuJD");
        lIllllIll[llIIIIIIl[12]] = lIIllllllIlI("Ivg3mIAzAyo=", "dhdxV");
        lIllllIll[llIIIIIIl[25]] = lIIllllIllIl("0Wc/MurI/dKXxQnhpBR6nA==", "xkHUW");
        lIllllIll[llIIIIIIl[15]] = lIIllllllIIl("PwcMAioUHQoOawkKHQUnFg==", "ziojK");
        lIllllIll[llIIIIIIl[26]] = lIIllllllIIl("MykmDSYQPg==", "uLGyN");
        lIllllIll[llIIIIIIl[27]] = lIIllllIllIl("EHVuUKDLEkYJUgfOp3s6cg==", "YjVxS");
        lIllllIll[llIIIIIIl[28]] = lIIllllllIIl("KSsuWgQIaigTAwRqLBMcAg==", "gJXzp");
        lIllllIll[llIIIIIIl[29]] = lIIllllIllIl("zDphyz4H7vG+DK3Xawr3Aw==", "IizVK");
        lIllllIll[llIIIIIIl[30]] = lIIllllIllIl("7m3XaWLVQm0=", "XotpD");
        lIllllIll[llIIIIIIl[31]] = lIIllllllIIl("IwYkBBQNCi5NFwwcKQ==", "eoJmg");
        lIllllIll[llIIIIIIl[32]] = lIIllllllIIl("IgIcSBADQwsaB0wXAwQB", "lcjhd");
        lIllllIll[llIIIIIIl[33]] = lIIllllllIIl("PA4rLQUGCGcnHgs=", "hoGFl");
        lIllllIll[llIIIIIIl[34]] = lIIllllllIIl("FTMiFycv", "GVEvS");
        lIllllIll[llIIIIIIl[35]] = lIIllllIllIl("FfhnE1p2BgAimVHN4/19AQ==", "jBRXP");
        lIllllIll[llIIIIIIl[36]] = lIIllllllIIl("Ki8jTCELbjkDIwVuIQU5AQ==", "dNUlU");
        lIllllIll[llIIIIIIl[37]] = lIIllllllIlI("yO2MT0XA3BHORHWMVrby7Q==", "ehbCQ");
        lIllllIll[llIIIIIIl[38]] = lIIllllllIIl("DiUgIzw=", "CPNWE");
        lIllllIll[llIIIIIIl[39]] = lIIllllIllIl("4fJksW6NAQwnEFa0k9ldvA==", "fKNxn");
        lIllllIll[llIIIIIIl[40]] = lIIllllIllIl("/jD3L295HD5PJot7XyRnRSc86WeW2erm", "jALfF");
        lIllllIll[llIIIIIIl[41]] = lIIllllIllIl("07wZkGBxZnsw8v5Z5fgiyA==", "gFYBk");
        lIllllIll[llIIIIIIl[42]] = lIIllllllIlI("hUqQuQT86S23q8c5ZLuw8g==", "uqxav");
        lIllllIll[llIIIIIIl[43]] = lIIllllIllIl("GyYSZAm/DlTZIEzNJRevmBVeDfd3MZZ0", "nPgIJ");
        lIllllIll[llIIIIIIl[44]] = lIIllllllIIl("LxEXazwOUAkkOwgUCD47QQQIJy0=", "apaKH");
        lIllllIll[llIIIIIIl[45]] = lIIllllIllIl("qTtcsHCrvcjE9fTsU+vcvN5MLN5uyg9d", "cBuin");
        lIllllIll[llIIIIIIl[46]] = lIIllllllIlI("9FCzbns7ioU=", "nzdco");
        lIllllIll[llIIIIIIl[47]] = lIIllllIllIl("cYpyL+kpyH/dWGvo6hhL45xC/M0+LOFT", "efJMv");
        lIllllIll[llIIIIIIl[48]] = lIIllllllIIl("IDgmbiABeSM6NRwt", "nYPNT");
        lIllllIll[llIIIIIIl[49]] = lIIllllllIIl("OA0gPhkiC2wjFSMf", "LlLUp");
        lIllllIll[llIIIIIIl[50]] = lIIllllllIlI("jjU/rzaqITc=", "Ouuaf");
        lIllllIll[llIIIIIIl[51]] = lIIllllllIlI("fQRwF5aVcbxuERhTOlSRvBnsdTPc8GDJ", "tdEOZ");
        lIllllIll[llIIIIIIl[52]] = lIIllllIllIl("8YJvYSFIVcpNfGhb2RBSJA==", "qxrzw");
        lIllllIll[llIIIIIIl[53]] = lIIllllllIIl("LB8AIhcTDxwjAUEJATQ=", "afsVr");
        lIllllIll[llIIIIIIl[54]] = lIIllllIllIl("vt3yPAcdTfRSCDiq5J+qJw==", "ZMsJv");
        lIllllIll[llIIIIIIl[55]] = lIIllllIllIl("Q0uXWYJA+suEdC1azVPX0Q==", "SIaNt");
        lIllllIll[llIIIIIIl[56]] = lIIllllllIIl("Mys0LzgpLXgyNCg5", "GJXDQ");
        lIllllIll[llIIIIIIl[57]] = lIIllllllIIl("EiY8Bw==", "DCStQ");
        lIllllIll[llIIIIIIl[58]] = lIIllllllIlI("76kDszqSngc704NZ9xwooA==", "POtkH");
        lIllllIll[llIIIIIIl[60]] = lIIllllIllIl("AACPj3fuNac9CxMHWnDF5g==", "dHmqY");
        lIllllIll[llIIIIIIl[61]] = lIIllllllIIl("DC88HjY4JGgbJiAx", "MAHwG");
        lIllllIll[llIIIIIIl[62]] = lIIllllIllIl("dkK9rfex/tM=", "oGsSr");
        lIllllIll[llIIIIIIl[63]] = lIIllllllIIl("KzMhHCwMPyMebws6LAAqCg==", "xVMyO");
        lIllllIll[llIIIIIIl[64]] = lIIllllllIIl("CT8pIxMo", "ZSHZv");
        lIllllIll[llIIIIIIl[65]] = lIIllllllIIl("EiUiMS4jJw==", "QJLWG");
        lIllllIll[llIIIIIIl[66]] = lIIllllIllIl("Yjhs9cX/jrmm1pcmXJNCXg==", "xEHmN");
        lIllllIll[llIIIIIIl[67]] = lIIllllllIlI("C71Fo6Ilyz91NBcGE3U/dw==", "HSMfM");
        lIllllIll[llIIIIIIl[68]] = lIIllllllIlI("nnNNb3P4PorNwHJLgWOqIw==", "ZsevD");
        lIllllIll[llIIIIIIl[69]] = lIIllllIllIl("T7yl1z9TobY=", "IiqDo");
        lIllllIll[llIIIIIIl[70]] = lIIllllllIlI("MEvtqlIhbiqbjDJIygqVAky/QTDcjvd0", "RhNel");
        lIllllIll[llIIIIIIl[71]] = lIIllllIllIl("ACMPjjsx/gY=", "cpcId");
        lIllllIll[llIIIIIIl[72]] = lIIllllllIlI("EADR5sqgh4g=", "iYWnS");
        lIllllIll[llIIIIIIl[73]] = lIIllllllIlI("frvE/PXkNvk=", "cvuTg");
        lIllllIll[llIIIIIIl[78]] = lIIllllIllIl("CLjifoT6oM1SiBz+qxG2C0W6sBAoT1g2", "fybUS");
        lIllllIll[llIIIIIIl[79]] = lIIllllllIIl("KAYaIggcDU4nGAQY", "ihnKy");
        lIllllIll[llIIIIIIl[80]] = lIIllllIllIl("OvWMMu0C1UDlnWa7KVEJ7vWyPFqZ6Jop", "EOUgJ");
        lIllllIll[llIIIIIIl[81]] = lIIllllllIIl("IScldABCJzg/aRspPnQoACk+IGkqKTg9LQszOGs=", "bFKTI");
        lIllllIll[llIIIIIIl[82]] = lIIllllllIlI("PD8QHeExi6ePyU7/jdKKtA==", "DwabY");
        lIllllIll[llIIIIIIl[16]] = lIIllllllIlI("3LbHhIa/6zNSW6P91jGyjA==", "Tjxkg");
        lIllllIll[llIIIIIIl[83]] = lIIllllIllIl("9Jw8kDS7raK8KKARbgxJMboUzxq7ZZPN9/FafzyYsaI=", "cDaFW");
        lIllllIll[llIIIIIIl[84]] = lIIllllllIlI("Ne1ZFbZPPuVHjRp5e6MsRw==", "qqSib");
        lIllllIll[llIIIIIIl[85]] = lIIllllllIIl("LRYpSh5OFjQBdxcYMko2DBgyHnciGDELPAsZIABo", "nwGjW");
        lIllllIll[llIIIIIIl[86]] = lIIllllIllIl("mrbvzSvjKnNwoe11xLcbIA==", "ivpdc");
        lIllllIll[llIIIIIIl[87]] = lIIllllllIlI("YC5NhhrdytrPov6SAqj+wKNhXqSjOGYw+BAhxruJGLQ=", "CPgqo");
        lIllllIll[llIIIIIIl[88]] = lIIllllllIIl("E1gvCRp9DGsIET8cawcaIwwjDxo9Vg==", "ZxKft");
        lIllllIll[llIIIIIIl[89]] = lIIllllllIIl("BjUlVDllNTgfUDw7PlQRJzs+AFAVOzkAUBU9OBcRNz0nHQU2aw==", "ETKtp");
        lIllllIll[llIIIIIIl[90]] = lIIllllllIIl("GGYvDh52MmsPFTQiawAeKDIjCB42ZjkIFzkyaw8fJmg=", "QFKap");
        lIllllIll[llIIIIIIl[105]] = lIIllllllIlI("IsR6pba2UquuFamVrEBABrvMFkSt5P3Z2h34ONWdHjE=", "OEbUW");
        lIllllIll[llIIIIIIl[106]] = lIIllllIllIl("AcWDBrfKxg8=", "iKbZH");
        lIllllIll[llIIIIIIl[107]] = lIIllllIllIl("dRsi586lxCI=", "McytF");
        lIllllIll[llIIIIIIl[108]] = lIIllllIllIl("i5BpLSi8c53Rob9tXUCMGdp0jwVsvbNdl58eCm4jhtf0sv6C0/WiyA==", "JKJaS");
        lIllllIll[llIIIIIIl[109]] = lIIllllllIlI("TzaSRHoRdw77tcvm9JHo2WPTt40ozMtiUeaZUNbLi984R9J5XerZdW0Qy8CykexB", "FgYUJ");
        lIllllIll[llIIIIIIl[110]] = lIIllllllIIl("By06Yz1kLScoVD0jIWMVJiMhN1QUIyY3VAU+NyYBMT9r", "DLTCt");
        lIllllIll[llIIIIIIl[111]] = lIIllllllIIl("JAcAbCtHBx0nQh4JG2wDBQkbOEImFA0pFxIVUQ==", "gfnLb");
        lIllllIll[llIIIIIIl[112]] = lIIllllllIIl("Dyk/ShUwLjMGAngIZg0HMS9mDAcuLjMYRi8oMgJGGTMlDxMtMnk=", "XAFjf");
        lIllllIll[llIIIIIIl[113]] = lIIllllllIlI("j0RNaP5ZFsmwlFYp05HOwjYsadm8S+McO4wnOFTxOIM=", "WJnKC");
        lIllllIll[llIIIIIIl[114]] = lIIllllllIIl("NSweaBIKKxIkBUINRy8ACypHLgAUKxI6QRUtEyBBLisRKQoHKgAiXg==", "bDgHa");
        lIllllIll[llIIIIIIl[115]] = lIIllllllIlI("Va7F5GgLDvAuN+SyMMmJg42eq62qvqefKwBsakbeO4g=", "MwHUF");
        lIllllIll[llIIIIIIl[116]] = lIIllllllIIl("IikMYhwdLgAuC1UIVSUOHC9VJA4DLgAwTwIoASpPJikUOxUcJBt9", "uAuBo");
        lIllllIll[llIIIIIIl[117]] = lIIllllllIIl("ADEXbwdjMQokbjo/DG8vIT8MO24LPwomKiolCnA=", "CPyON");
        lIllllIll[llIIIIIIl[118]] = lIIllllllIlI("iVRnf9jc4ZCzdxN062HR9PSOpBaKrmjLI3pzfpPjQfV9C6qBOCF+WQ==", "MhENI");
        lIllllIll[llIIIIIIl[119]] = lIIllllllIlI("nZ4wnREDVp6FJiGABDuGZtHZlzLac0z2V3j8O/FK9St3eLh9mhZCoXSbwFD0g73t", "FVwzY");
        lIllllIll[llIIIIIIl[120]] = lIIllllIllIl("QTU8J3QKpW0J6MJkKr1UwnNn84vFmggCPozPUEGp4IU=", "hSsBg");
        lIllllIll[llIIIIIIl[121]] = lIIllllIllIl("AW3gEq/wT9muVvgPY3VugfF6ZV9mdgfl6fA9WhOjpS2Y3nEBaQltxA==", "IEMXh");
        lIllllIll[llIIIIIIl[122]] = lIIllllllIlI("eym33IhImC8aLKdaqzYx1btGL1yCAmSIvr1AEFVZdTWXYrXTuRTJWg==", "zGEMV");
        lIllllIll[llIIIIIIl[123]] = lIIllllIllIl("JRgYpDhBpybFKbA8koEbYkPsS7TzPymt0m32VCDnSi0jzHjfbAqH6Q==", "fXdjS");
        lIllllIll[llIIIIIIl[124]] = lIIllllIllIl("8K0kWQ9UIlqBi5vZd6SgxVAbWHjyuuV9F72u6tXF2Jw=", "MhNlw");
    }

    private static boolean lIlIIIIlllII(int i, int i2) {
        return i >= i2;
    }

    static {
        lIlIIIIllIII();
        lIlIIIIIllll();
        bv = new ArrayList();
        cA = llIIIIIIl[1];
        cB = new WorldPoint(llIIIIIIl[91], llIIIIIIl[92], llIIIIIIl[1]);
        cC = new WorldPoint(llIIIIIIl[93], llIIIIIIl[94], llIIIIIIl[1]);
        cD = new WorldPoint(llIIIIIIl[95], llIIIIIIl[96], llIIIIIIl[1]);
        cE = new WorldPoint(llIIIIIIl[97], llIIIIIIl[98], llIIIIIIl[1]);
        cF = new WorldPoint(llIIIIIIl[99], llIIIIIIl[100], llIIIIIIl[1]);
        cG = new WorldPoint(llIIIIIIl[101], llIIIIIIl[102], llIIIIIIl[1]);
        cH = new WorldPoint(llIIIIIIl[103], llIIIIIIl[104], llIIIIIIl[1]);
        String[] strArr = new String[llIIIIIIl[33]];
        strArr[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[105]];
        strArr[llIIIIIIl[0]] = lIllllIll[llIIIIIIl[106]];
        strArr[llIIIIIIl[5]] = lIllllIll[llIIIIIIl[107]];
        strArr[llIIIIIIl[10]] = lIllllIll[llIIIIIIl[108]];
        strArr[llIIIIIIl[6]] = lIllllIll[llIIIIIIl[109]];
        strArr[llIIIIIIl[13]] = lIllllIll[llIIIIIIl[110]];
        strArr[llIIIIIIl[17]] = lIllllIll[llIIIIIIl[111]];
        strArr[llIIIIIIl[18]] = lIllllIll[llIIIIIIl[112]];
        strArr[llIIIIIIl[2]] = lIllllIll[llIIIIIIl[113]];
        strArr[llIIIIIIl[24]] = lIllllIll[llIIIIIIl[114]];
        strArr[llIIIIIIl[12]] = lIllllIll[llIIIIIIl[115]];
        strArr[llIIIIIIl[25]] = lIllllIll[llIIIIIIl[116]];
        strArr[llIIIIIIl[15]] = lIllllIll[llIIIIIIl[117]];
        strArr[llIIIIIIl[26]] = lIllllIll[llIIIIIIl[118]];
        strArr[llIIIIIIl[27]] = lIllllIll[llIIIIIIl[119]];
        strArr[llIIIIIIl[28]] = lIllllIll[llIIIIIIl[120]];
        strArr[llIIIIIIl[29]] = lIllllIll[llIIIIIIl[121]];
        strArr[llIIIIIIl[30]] = lIllllIll[llIIIIIIl[122]];
        strArr[llIIIIIIl[31]] = lIllllIll[llIIIIIIl[123]];
        strArr[llIIIIIIl[32]] = lIllllIll[llIIIIIIl[124]];
        bR = strArr;
    }

    private static boolean lIlIIIIllIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return llIIIIIIl[1];
    }

    private static boolean lIlIIIIllIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIlllIl(int i, int i2) {
        return i == i2;
    }

    private static void af() {
        int[] iArr = new int[llIIIIIIl[0]];
        iArr[llIIIIIIl[1]] = llIIIIIIl[9];
        if (lIlIIIIllIll(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIIIl[9], llIIIIIIl[12], llIIIIIIl[74]));
            "".length();
        }
        int[] iArr2 = new int[llIIIIIIl[0]];
        iArr2[llIIIIIIl[1]] = llIIIIIIl[11];
        if (lIlIIIIllIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIIIl[11], llIIIIIIl[13], C0008i.bq));
            "".length();
        }
        if (lIlIIIIllIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIllllIll[llIIIIIIl[80]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIIIl[75], llIIIIIIl[13], llIIIIIIl[76]));
            "".length();
        }
        int[] iArr3 = new int[llIIIIIIl[0]];
        iArr3[llIIIIIIl[1]] = llIIIIIIl[7];
        if (lIlIIIIllIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIIIl[7], llIIIIIIl[53], llIIIIIIl[74]));
            "".length();
        }
        int[] iArr4 = new int[llIIIIIIl[0]];
        iArr4[llIIIIIIl[1]] = llIIIIIIl[8];
        if (lIlIIIIllIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIIIl[8], llIIIIIIl[12], llIIIIIIl[74]));
            "".length();
        }
    }

    private static String lIIllllIllIl(String lIllllIIIllllI, String lIllllIIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllllIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllllIIIlllll) {
            lIllllIIIlllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        String[] strArr = new String[llIIIIIIl[0]];
        strArr[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[73]];
        if (lIlIIIIlllll(Inventory.getCount(strArr))) {
            int[] iArr = new int[llIIIIIIl[0]];
            iArr[llIIIIIIl[1]] = llIIIIIIl[7];
            if (lIlIIIIlllll(Inventory.getCount(iArr)) && lIlIIIIlllll(Inventory.getCount(C0005f.aV))) {
                int[] iArr2 = new int[llIIIIIIl[0]];
                iArr2[llIIIIIIl[1]] = llIIIIIIl[8];
                if (lIlIIIIlllll(Inventory.getCount(iArr2))) {
                    ?? r0 = llIIIIIIl[0];
                    "".length();
                    return ((199 ^ 166) & ((213 ^ 180) ^ (-1))) >= (136 ^ 140) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return llIIIIIIl[1];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIllllIll[llIIIIIIl[78]];
    }

    private static boolean lIlIIIIlllll(int i) {
        return i > 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            aL();
            "".length();
            if ((-" ".length()) > 0) {
                return (149 ^ 197) & ((238 ^ 190) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIIIIIl[77];
    }

    private static String lIIllllllIlI(String lIllllIIIlIIIl, String lIllllIIIlIIII) {
        try {
            SecretKeySpec lIllllIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllIIIlIIII.getBytes(StandardCharsets.UTF_8)), llIIIIIIl[2]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIIIl[5], lIllllIIIlIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllllIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllllIIIlIIlI) {
            lIllllIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIllIll(int i) {
        return i == 0;
    }

    private static boolean lIlIIIIllllI(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIllIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIIIlIIIII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIlIIIIlllII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[24])) {
            String[] strArr = new String[llIIIIIIl[0]];
            strArr[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[79]];
            if (lIlIIIIllIll(Inventory.contains(strArr) ? 1 : 0)) {
                ?? r0 = llIIIIIIl[0];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return llIIIIIIl[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
        if (lIlIIIIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0c1e, code lost:
        if (lIlIIIIllIIl(r0) != false) goto L232;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v498, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v500, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v502, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v504, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v506, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v611, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v638, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v95, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aL() {
        if (lIlIIIIllIIl(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lIlIIIIllIlI(bv.size(), llIIIIIIl[0])) {
                System.out.println(lIllllIll[llIIIIIIl[1]]);
                bt = llIIIIIIl[1];
            }
        }
        if (lIlIIIIllIll(bt ? 1 : 0)) {
            if (lIlIIIIlllII(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIIIIIl[2])) {
                int[] iArr = new int[llIIIIIIl[0]];
                iArr[llIIIIIIl[1]] = llIIIIIIl[3];
            }
            V.dd();
            if (lIlIIIIllIll(ab() ? 1 : 0) && lIlIIIIllIlI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[0]) && lIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIIIIIl[2])) {
                int[] iArr2 = new int[llIIIIIIl[0]];
                iArr2[llIIIIIIl[1]] = llIIIIIIl[3];
                if (lIlIIIIllIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIlIIIIllllI(nearest) && lIlIIIIllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[0]];
                        C0000a.a(nearest);
                    }
                    if (lIlIIIIllllI(nearest) && lIlIIIIllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, llIIIIIIl[4]);
                            "".length();
                        }
                        if (lIlIIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[5]];
                            if (lIlIIIIlllll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(llIIIIIIl[6]);
                                "".length();
                            }
                            if (lIlIIIIlllll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(llIIIIIIl[5]);
                                "".length();
                            }
                            int[] iArr3 = new int[llIIIIIIl[6]];
                            iArr3[llIIIIIIl[1]] = llIIIIIIl[7];
                            iArr3[llIIIIIIl[0]] = llIIIIIIl[8];
                            iArr3[llIIIIIIl[5]] = llIIIIIIl[9];
                            iArr3[llIIIIIIl[10]] = llIIIIIIl[11];
                            if (lIlIIIIllIll(C0004e.b(iArr3) ? 1 : 0)) {
                                af();
                                System.out.println(lIllllIll[llIIIIIIl[10]]);
                                bt = llIIIIIIl[0];
                                return;
                            }
                            int[] iArr4 = new int[llIIIIIIl[6]];
                            iArr4[llIIIIIIl[1]] = llIIIIIIl[7];
                            iArr4[llIIIIIIl[0]] = llIIIIIIl[8];
                            iArr4[llIIIIIIl[5]] = llIIIIIIl[9];
                            iArr4[llIIIIIIl[10]] = llIIIIIIl[11];
                            if (lIlIIIIllIIl(C0004e.b(iArr4) ? 1 : 0)) {
                                C0000a.a(llIIIIIIl[7], llIIIIIIl[12]);
                                C0000a.a(llIIIIIIl[8], llIIIIIIl[12]);
                                C0000a.a(llIIIIIIl[9], llIIIIIIl[0]);
                                C0000a.a(llIIIIIIl[11], llIIIIIIl[13]);
                                C0000a.a(llIIIIIIl[14], llIIIIIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] iArr5 = new int[llIIIIIIl[0]];
            iArr5[llIIIIIIl[1]] = llIIIIIIl[14];
            if (lIlIIIIllIIl(Inventory.contains(iArr5) ? 1 : 0) && lIlIIIIlllII(Combat.getMissingHealth(), llIIIIIIl[15])) {
                int[] iArr6 = new int[llIIIIIIl[0]];
                iArr6[llIIIIIIl[1]] = llIIIIIIl[14];
                Inventory.getFirst(iArr6).interact(lIllllIll[llIIIIIIl[6]]);
                Time.sleepTicks(llIIIIIIl[5]);
                "".length();
            }
            if (lIlIIIIllIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lIlIIIIllIlI(Movement.getRunEnergy(), llIIIIIIl[16])) {
                Inventory.getFirst(C0005f.aV).interact(lIllllIll[llIIIIIIl[13]]);
                Time.sleepTicks(llIIIIIIl[0]);
                "".length();
            }
            if (lIlIIIIllIlI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[0]) && lIlIIIIllIIl(ab() ? 1 : 0) && lIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIIIIIl[2])) {
                int[] iArr7 = new int[llIIIIIIl[0]];
                iArr7[llIIIIIIl[1]] = llIIIIIIl[3];
                if (lIlIIIIllIll(Inventory.contains(iArr7) ? 1 : 0)) {
                    if (lIlIIIIllIll(Players.getLocal().getWorldLocation().equals(cB) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[17]];
                        if (lIlIIIIllIIl(Dialog.isOpen() ? 1 : 0) && lIlIIIIllIlI(cA, llIIIIIIl[5])) {
                            Dialog.close();
                            cA += llIIIIIIl[0];
                        }
                        C0004e.a(cB);
                    }
                    if (lIlIIIIllIIl(Players.getLocal().getWorldLocation().equals(cB) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[18]];
                        C0006g.a(lIllllIll[llIIIIIIl[2]], bR);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit(llIIIIIIl[19]));
            System.out.println("5621: " + Vars.getBit(llIIIIIIl[20]));
            System.out.println("5622: " + Vars.getBit(llIIIIIIl[21]));
            System.out.println("5623: " + Vars.getBit(llIIIIIIl[22]));
            System.out.println("5624: " + Vars.getBit(llIIIIIIl[23]));
            if (lIlIIIIlllIl(Vars.getBit(llIIIIIIl[19]), llIIIIIIl[0])) {
                cv = llIIIIIIl[0];
            }
            if (lIlIIIIlllIl(Vars.getBit(llIIIIIIl[20]), llIIIIIIl[0])) {
                cw = llIIIIIIl[0];
            }
            if (lIlIIIIlllIl(Vars.getBit(llIIIIIIl[21]), llIIIIIIl[0])) {
                cx = llIIIIIIl[0];
            }
            if (lIlIIIIlllIl(Vars.getBit(llIIIIIIl[22]), llIIIIIIl[0])) {
                cy = llIIIIIIl[0];
            }
            if (lIlIIIIlllIl(Vars.getBit(llIIIIIIl[23]), llIIIIIIl[0])) {
                cz = llIIIIIIl[0];
            }
            if (lIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[0])) {
                cl = llIIIIIIl[1];
                if (lIlIIIIllIll(cv ? 1 : 0)) {
                    String[] strArr = new String[llIIIIIIl[0]];
                    strArr[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[24]];
                    if (lIlIIIIllIIl(Inventory.contains(strArr) ? 1 : 0)) {
                        String[] strArr2 = new String[llIIIIIIl[0]];
                        strArr2[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[12]];
                        if (lIlIIIIllIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                            String[] strArr3 = new String[llIIIIIIl[0]];
                            strArr3[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[25]];
                            if (lIlIIIIllIll(Inventory.contains(strArr3) ? 1 : 0)) {
                                String[] strArr4 = new String[llIIIIIIl[0]];
                                strArr4[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[15]];
                                Item first = Inventory.getFirst(strArr4);
                                String[] strArr5 = new String[llIIIIIIl[0]];
                                strArr5[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[26]];
                                first.useOn(Inventory.getFirst(strArr5));
                                Time.sleepTicks(llIIIIIIl[5]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr6 = new String[llIIIIIIl[0]];
                    strArr6[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[27]];
                    if (lIlIIIIllIIl(Inventory.contains(strArr6) ? 1 : 0)) {
                        if (lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cC), llIIIIIIl[2])) {
                            AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[28]];
                            Movement.walkTo(cC);
                            "".length();
                            Time.sleepTicks(llIIIIIIl[0]);
                            "".length();
                        }
                        if (lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cC), llIIIIIIl[2])) {
                            AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[29]];
                            C0006g.a(lIllllIll[llIIIIIIl[30]], bR, llIIIIIIl[0]);
                            Time.sleepTicks(llIIIIIIl[0]);
                            "".length();
                            List options = Dialog.getOptions();
                            ArrayList arrayList = new ArrayList();
                            if (lIlIIIIllIll(options.isEmpty() ? 1 : 0)) {
                                int i = llIIIIIIl[1];
                                while (lIlIIIIllIlI(i, options.size())) {
                                    arrayList.add(((Widget) options.get(i)).getText());
                                    "".length();
                                    i++;
                                    "".length();
                                    if (((232 ^ 191) & ((18 ^ 69) ^ (-1))) >= (186 ^ 190)) {
                                        return;
                                    }
                                }
                                boolean anyMatch = arrayList.stream().anyMatch(str -> {
                                    return str.equalsIgnoreCase(lIllllIll[llIIIIIIl[90]]);
                                });
                                boolean noneMatch = arrayList.stream().noneMatch(str2 -> {
                                    return str2.equalsIgnoreCase(lIllllIll[llIIIIIIl[89]]);
                                });
                                if (lIlIIIIllIIl(anyMatch ? 1 : 0)) {
                                    int lIllllIlIIlIIl = noneMatch ? 1 : 0;
                                    if (lIlIIIIllIIl(lIllllIlIIlIIl)) {
                                        System.out.println(lIllllIll[llIIIIIIl[31]]);
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIlIIIIllIll(cw ? 1 : 0) && lIlIIIIllIIl(cv ? 1 : 0)) {
                    if (lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cD), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[32]];
                        Movement.walkTo(cD);
                        "".length();
                        Time.sleepTicks(llIIIIIIl[0]);
                        "".length();
                    }
                    if (lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cD), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[33]];
                        C0006g.a(lIllllIll[llIIIIIIl[34]], bR, llIIIIIIl[0]);
                        Time.sleepTicks(llIIIIIIl[0]);
                        "".length();
                        List options2 = Dialog.getOptions();
                        ArrayList arrayList2 = new ArrayList();
                        if (lIlIIIIllIll(options2.isEmpty() ? 1 : 0)) {
                            int i2 = llIIIIIIl[1];
                            while (lIlIIIIllIlI(i2, options2.size())) {
                                arrayList2.add(((Widget) options2.get(i2)).getText());
                                "".length();
                                i2++;
                                "".length();
                                if (" ".length() == 0) {
                                    return;
                                }
                            }
                            boolean anyMatch2 = arrayList2.stream().anyMatch(str3 -> {
                                return str3.equalsIgnoreCase(lIllllIll[llIIIIIIl[88]]);
                            });
                            boolean noneMatch2 = arrayList2.stream().noneMatch(str4 -> {
                                return str4.equalsIgnoreCase(lIllllIll[llIIIIIIl[87]]);
                            });
                            if (lIlIIIIllIIl(anyMatch2 ? 1 : 0)) {
                                int lIllllIlIIlIIl2 = noneMatch2 ? 1 : 0;
                                if (lIlIIIIllIIl(lIllllIlIIlIIl2)) {
                                    System.out.println(lIllllIll[llIIIIIIl[35]]);
                                }
                            }
                        }
                    }
                }
                if (lIlIIIIllIll(cx ? 1 : 0) && lIlIIIIllIIl(cw ? 1 : 0) && lIlIIIIllIIl(cv ? 1 : 0)) {
                    if (lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cE), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[36]];
                        Movement.walkTo(cE);
                        "".length();
                        Time.sleepTicks(llIIIIIIl[0]);
                        "".length();
                    }
                    if (lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cE), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[37]];
                        C0006g.a(lIllllIll[llIIIIIIl[38]], bR, llIIIIIIl[0]);
                        Time.sleepTicks(llIIIIIIl[0]);
                        "".length();
                        List options3 = Dialog.getOptions();
                        ArrayList arrayList3 = new ArrayList();
                        if (lIlIIIIllIll(options3.isEmpty() ? 1 : 0)) {
                            int i3 = llIIIIIIl[1];
                            while (lIlIIIIllIlI(i3, options3.size())) {
                                arrayList3.add(((Widget) options3.get(i3)).getText());
                                "".length();
                                i3++;
                                "".length();
                                if ((true ^ true) & ((true ^ true) ^ true)) {
                                    return;
                                }
                            }
                            boolean anyMatch3 = arrayList3.stream().anyMatch(str5 -> {
                                return str5.equalsIgnoreCase(lIllllIll[llIIIIIIl[86]]);
                            });
                            boolean noneMatch3 = arrayList3.stream().noneMatch(str6 -> {
                                return str6.equalsIgnoreCase(lIllllIll[llIIIIIIl[85]]);
                            });
                            if (lIlIIIIllIIl(anyMatch3 ? 1 : 0)) {
                                int lIllllIlIIlIIl3 = noneMatch3 ? 1 : 0;
                                if (lIlIIIIllIIl(lIllllIlIIlIIl3)) {
                                    System.out.println(lIllllIll[llIIIIIIl[39]]);
                                }
                            }
                        }
                    }
                }
                if (lIlIIIIllIll(cy ? 1 : 0) && lIlIIIIllIIl(cx ? 1 : 0) && lIlIIIIllIIl(cw ? 1 : 0) && lIlIIIIllIIl(cv ? 1 : 0)) {
                    if (lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cF), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[40]];
                        Movement.walkTo(cF);
                        "".length();
                        Time.sleepTicks(llIIIIIIl[0]);
                        "".length();
                    }
                    if (lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cF), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[41]];
                        C0006g.a(lIllllIll[llIIIIIIl[42]], bR, llIIIIIIl[0]);
                        Time.sleepTicks(llIIIIIIl[0]);
                        "".length();
                        List options4 = Dialog.getOptions();
                        ArrayList arrayList4 = new ArrayList();
                        if (lIlIIIIllIll(options4.isEmpty() ? 1 : 0)) {
                            int i4 = llIIIIIIl[1];
                            while (lIlIIIIllIlI(i4, options4.size())) {
                                arrayList4.add(((Widget) options4.get(i4)).getText());
                                "".length();
                                i4++;
                                "".length();
                                if ((-"  ".length()) >= 0) {
                                    return;
                                }
                            }
                            boolean anyMatch4 = arrayList4.stream().anyMatch(str7 -> {
                                return str7.equalsIgnoreCase(lIllllIll[llIIIIIIl[84]]);
                            });
                            boolean noneMatch4 = arrayList4.stream().noneMatch(str8 -> {
                                return str8.equalsIgnoreCase(lIllllIll[llIIIIIIl[83]]);
                            });
                            if (lIlIIIIllIIl(anyMatch4 ? 1 : 0)) {
                                int lIllllIlIIlIIl4 = noneMatch4 ? 1 : 0;
                                if (lIlIIIIllIIl(lIllllIlIIlIIl4)) {
                                    System.out.println(lIllllIll[llIIIIIIl[43]]);
                                }
                            }
                        }
                    }
                }
                if (lIlIIIIllIll(cz ? 1 : 0) && lIlIIIIllIIl(cy ? 1 : 0) && lIlIIIIllIIl(cx ? 1 : 0) && lIlIIIIllIIl(cw ? 1 : 0) && lIlIIIIllIIl(cv ? 1 : 0)) {
                    if (lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cG), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[44]];
                        Movement.walkTo(cG);
                        "".length();
                        Time.sleepTicks(llIIIIIIl[0]);
                        "".length();
                    }
                    if (lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cG), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[45]];
                        C0006g.a(lIllllIll[llIIIIIIl[46]], bR, llIIIIIIl[0]);
                        Time.sleepTicks(llIIIIIIl[0]);
                        "".length();
                        List options5 = Dialog.getOptions();
                        ArrayList arrayList5 = new ArrayList();
                        if (lIlIIIIllIll(options5.isEmpty() ? 1 : 0)) {
                            int i5 = llIIIIIIl[1];
                            while (lIlIIIIllIlI(i5, options5.size())) {
                                arrayList5.add(((Widget) options5.get(i5)).getText());
                                "".length();
                                i5++;
                                "".length();
                                if (0 != 0) {
                                    return;
                                }
                            }
                            boolean anyMatch5 = arrayList5.stream().anyMatch(str9 -> {
                                return str9.equalsIgnoreCase(lIllllIll[llIIIIIIl[16]]);
                            });
                            boolean anyMatch6 = arrayList5.stream().anyMatch(str10 -> {
                                return str10.contains(lIllllIll[llIIIIIIl[82]]);
                            });
                            boolean noneMatch5 = arrayList5.stream().noneMatch(str11 -> {
                                return str11.equalsIgnoreCase(lIllllIll[llIIIIIIl[81]]);
                            });
                            if (lIlIIIIllIll(anyMatch5 ? 1 : 0)) {
                                int lIllllIlIIlIIl5 = anyMatch6 ? 1 : 0;
                            }
                            if (lIlIIIIllIIl(noneMatch5 ? 1 : 0)) {
                                System.out.println(lIllllIll[llIIIIIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (lIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[5])) {
                if (lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cB), llIIIIIIl[5])) {
                    AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[48]];
                    if (lIlIIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0004e.a(cB);
                }
                if (lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cB), llIIIIIIl[5])) {
                    AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[49]];
                    C0006g.a(lIllllIll[llIIIIIIl[50]], bR);
                }
            }
            if (!lIlIIIllIlII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[10]) || lIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[17])) {
                C0006g.a(bR);
            }
            if (lIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[6])) {
                if (lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cH), llIIIIIIl[6])) {
                    AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[51]];
                    Movement.walkTo(cH);
                    "".length();
                    Time.sleepTicks(llIIIIIIl[0]);
                    "".length();
                }
                if (lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cH), llIIIIIIl[6])) {
                    String[] strArr7 = new String[llIIIIIIl[0]];
                    strArr7[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[52]];
                    if (lIlIIIIllIIl(Inventory.contains(strArr7) ? 1 : 0)) {
                        String[] strArr8 = new String[llIIIIIIl[0]];
                        strArr8[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[53]];
                        Inventory.getFirst(strArr8).interact(lIllllIll[llIIIIIIl[54]]);
                        Time.sleepTicks(llIIIIIIl[10]);
                        "".length();
                    }
                }
            }
            if (lIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[13])) {
                if (lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cB), llIIIIIIl[5])) {
                    AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[55]];
                    C0004e.a(cB);
                }
                if (lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cB), llIIIIIIl[5])) {
                    AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[56]];
                    C0006g.a(lIllllIll[llIIIIIIl[57]], bR);
                }
            }
            if (!lIlIIIllIlII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[18]) || lIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[2])) {
                if (lIlIIIIllIlI(cl, llIIIIIIl[0])) {
                    an.oY += llIIIIIIl[0];
                    an.o(AccBuilderEasyClues.m);
                    cl += llIIIIIIl[0];
                    an.oY = llIIIIIIl[1];
                    cm = llIIIIIIl[1];
                }
                String[] strArr9 = new String[llIIIIIIl[0]];
                strArr9[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[58]];
                if (lIlIIIIllIIl(Inventory.contains(strArr9) ? 1 : 0)) {
                    if (lIlIIIIllllI(Widgets.get(llIIIIIIl[59]))) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[60]];
                        String[] strArr10 = new String[llIIIIIIl[0]];
                        strArr10[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[61]];
                        Inventory.getFirst(strArr10).interact(lIllllIll[llIIIIIIl[62]]);
                        Time.sleepTicks(llIIIIIIl[6]);
                        "".length();
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[63]];
                        Widget widget = Widgets.get(llIIIIIIl[59], llIIIIIIl[27]);
                        if (lIlIIIIllllI(widget)) {
                            widget.interact(lIllllIll[llIIIIIIl[64]]);
                            Time.sleepTicks(llIIIIIIl[0]);
                            "".length();
                        }
                        Widget widget2 = Widgets.get(llIIIIIIl[59], llIIIIIIl[39]);
                        if (lIlIIIIllllI(widget2)) {
                            widget2.interact(lIllllIll[llIIIIIIl[65]]);
                            Time.sleepTicks(llIIIIIIl[5]);
                            "".length();
                        }
                    }
                    Time.sleepTicks(llIIIIIIl[0]);
                    "".length();
                }
            }
        }
    }

    private static String lIIllllllIIl(String lIllllIIllIIll, String lIllllIIllIIlI) {
        String str = new String(Base64.getDecoder().decode(lIllllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIllllIIllIIlI.toCharArray();
        int lIllllIIlIllll = llIIIIIIl[1];
        char[] charArray2 = str.toCharArray();
        int lIllllIIlIlIII = charArray2.length;
        int i = llIIIIIIl[1];
        while (lIlIIIIllIlI(i, lIllllIIlIlIII)) {
            char lIllllIIllIlII = charArray2[i];
            sb.append((char) (lIllllIIllIlII ^ charArray[lIllllIIlIllll % charArray.length]));
            "".length();
            lIllllIIlIllll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static void aM() {
        String[] strArr = new String[llIIIIIIl[0]];
        strArr[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[66]];
        if (lIlIIIIllIIl(Inventory.contains(strArr) ? 1 : 0)) {
            if (lIlIIIIllllI(Widgets.get(llIIIIIIl[59]))) {
                AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[67]];
                String[] strArr2 = new String[llIIIIIIl[0]];
                strArr2[llIIIIIIl[1]] = lIllllIll[llIIIIIIl[68]];
                Inventory.getFirst(strArr2).interact(lIllllIll[llIIIIIIl[69]]);
                Time.sleepTicks(llIIIIIIl[6]);
                "".length();
                AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[70]];
                Widget widget = Widgets.get(llIIIIIIl[59], llIIIIIIl[27]);
                if (lIlIIIIllllI(widget)) {
                    widget.interact(lIllllIll[llIIIIIIl[71]]);
                    Time.sleepTicks(llIIIIIIl[0]);
                    "".length();
                }
                Widget widget2 = Widgets.get(llIIIIIIl[59], llIIIIIIl[39]);
                if (lIlIIIIllllI(widget2)) {
                    widget2.interact(lIllllIll[llIIIIIIl[72]]);
                    Time.sleepTicks(llIIIIIIl[5]);
                    "".length();
                }
            }
            Time.sleepTicks(llIIIIIIl[0]);
            "".length();
        }
    }

    private static boolean lIlIIIllIlII(int i, int i2) {
        return i != i2;
    }

    private static void lIlIIIIllIII() {
        llIIIIIIl = new int[126];
        llIIIIIIl[0] = " ".length();
        llIIIIIIl[1] = (6 ^ 0) & ((10 ^ 12) ^ (-1));
        llIIIIIIl[2] = (48 ^ 69) ^ (86 ^ 43);
        llIIIIIIl[3] = (-((-29385) & 30415)) & (-8385) & 32486;
        llIIIIIIl[4] = (-10279) & 15278;
        llIIIIIIl[5] = "  ".length();
        llIIIIIIl[6] = (193 ^ 144) ^ (247 ^ 162);
        llIIIIIIl[7] = (-((-1391) & 26111)) & (-1) & 32727;
        llIIIIIIl[8] = (-((-3843) & 28467)) & (-7) & 32639;
        llIIIIIIl[9] = (-((-5673) & 24302)) & (-13825) & 32767;
        llIIIIIIl[10] = "   ".length();
        llIIIIIIl[11] = (-((-83) & 19163)) & (-3) & 31707;
        llIIIIIIl[12] = (109 ^ 40) ^ (122 ^ 53);
        llIIIIIIl[13] = 194 ^ 199;
        llIIIIIIl[14] = (-((-1227) & 26319)) & (-1153) & 26623;
        llIIIIIIl[15] = 135 ^ 139;
        llIIIIIIl[16] = 237 ^ 172;
        llIIIIIIl[17] = 24 ^ 30;
        llIIIIIIl[18] = (27 ^ 72) ^ (29 ^ 73);
        llIIIIIIl[19] = (-10) & 5629;
        llIIIIIIl[20] = (-((-9553) & 11611)) & (-16385) & 24063;
        llIIIIIIl[21] = (-((-621) & 27245)) & (-10) & 32255;
        llIIIIIIl[22] = (-((-13089) & 31529)) & (-1) & 24063;
        llIIIIIIl[23] = (-((-31075) & 31590)) & (-8197) & 14335;
        llIIIIIIl[24] = (27 ^ 114) ^ (213 ^ 181);
        llIIIIIIl[25] = 147 ^ 152;
        llIIIIIIl[26] = 108 ^ 97;
        llIIIIIIl[27] = 61 ^ 51;
        llIIIIIIl[28] = 2 ^ 13;
        llIIIIIIl[29] = (((51 + 188) - 94) + 70) ^ (((10 + 165) - 78) + 102);
        llIIIIIIl[30] = 139 ^ 154;
        llIIIIIIl[31] = 130 ^ 144;
        llIIIIIIl[32] = 177 ^ 162;
        llIIIIIIl[33] = (17 ^ 11) ^ (183 ^ 185);
        llIIIIIIl[34] = (50 ^ 35) ^ (31 ^ 27);
        llIIIIIIl[35] = (34 ^ 28) ^ (96 ^ 72);
        llIIIIIIl[36] = (78 ^ 32) ^ (125 ^ 4);
        llIIIIIIl[37] = (39 ^ 90) ^ (45 ^ 72);
        llIIIIIIl[38] = (((31 + 26) - 33) + 108) ^ (((127 + 84) - 55) + 1);
        llIIIIIIl[39] = 155 ^ 129;
        llIIIIIIl[40] = (23 ^ 56) ^ (106 ^ 94);
        llIIIIIIl[41] = 1 ^ 29;
        llIIIIIIl[42] = (13 ^ 45) ^ (58 ^ 7);
        llIIIIIIl[43] = 66 ^ 92;
        llIIIIIIl[44] = (((142 + 44) - 88) + 84) ^ (((161 + 139) - 275) + 144);
        llIIIIIIl[45] = 226 ^ 194;
        llIIIIIIl[46] = 49 ^ 16;
        llIIIIIIl[47] = (73 ^ 30) ^ (127 ^ 10);
        llIIIIIIl[48] = (18 ^ 105) ^ (209 ^ 137);
        llIIIIIIl[49] = 44 ^ 8;
        llIIIIIIl[50] = (119 ^ 5) ^ (64 ^ 23);
        llIIIIIIl[51] = (((28 + 93) - 11) + 38) ^ (((67 + 147) - 188) + 152);
        llIIIIIIl[52] = (233 ^ 149) ^ (210 ^ 137);
        llIIIIIIl[53] = (((19 + 116) - 111) + 132) ^ (((65 + 2) - 31) + 144);
        llIIIIIIl[54] = 49 ^ 24;
        llIIIIIIl[55] = (((178 + 19) - 166) + 154) ^ (((66 + 143) - 87) + 25);
        llIIIIIIl[56] = (128 ^ 154) ^ (123 ^ 74);
        llIIIIIIl[57] = 41 ^ 5;
        llIIIIIIl[58] = 84 ^ 121;
        llIIIIIIl[59] = (((45 ^ 125) + (33 ^ 110)) - (170 ^ 131)) + (253 ^ 135);
        llIIIIIIl[60] = (((106 + 8) - (-71)) + 5) ^ (((101 + 10) - 71) + 104);
        llIIIIIIl[61] = 190 ^ 145;
        llIIIIIIl[62] = 16 ^ 32;
        llIIIIIIl[63] = (((115 + 121) - 96) + 30) ^ (((39 + 38) - (-35)) + 43);
        llIIIIIIl[64] = (((158 + 161) - 242) + 98) ^ (((58 + 49) - (-43)) + 7);
        llIIIIIIl[65] = (99 ^ 65) ^ (38 ^ 55);
        llIIIIIIl[66] = (60 ^ 77) ^ (73 ^ 12);
        llIIIIIIl[67] = (((74 + 18) - 55) + 152) ^ (((126 + 20) - 32) + 22);
        llIIIIIIl[68] = 72 ^ 126;
        llIIIIIIl[69] = (224 ^ 181) ^ (36 ^ 70);
        llIIIIIIl[70] = 179 ^ 139;
        llIIIIIIl[71] = (((87 + 117) - 55) + 39) ^ (((103 + 107) - 123) + 46);
        llIIIIIIl[72] = 95 ^ 101;
        llIIIIIIl[73] = 139 ^ 176;
        llIIIIIIl[74] = (-((-4753) & 16091)) & (-4098) & 16335;
        llIIIIIIl[75] = (-4356) & 16335;
        llIIIIIIl[76] = (-((-234) & 7935)) & (-67) & 32767;
        llIIIIIIl[77] = 213 ^ 177;
        llIIIIIIl[78] = (148 ^ 156) ^ (53 ^ 1);
        llIIIIIIl[79] = (((116 + 69) - 100) + 104) ^ (((74 + 39) - 83) + 98);
        llIIIIIIl[80] = (((125 + 117) - 194) + 92) ^ (((131 + 85) - 213) + 175);
        llIIIIIIl[81] = (76 ^ 80) ^ (10 ^ 41);
        llIIIIIIl[82] = 107 ^ 43;
        llIIIIIIl[83] = (0 ^ 104) ^ (143 ^ 165);
        llIIIIIIl[84] = 4 ^ 71;
        llIIIIIIl[85] = 54 ^ 114;
        llIIIIIIl[86] = (63 ^ 12) ^ (221 ^ 171);
        llIIIIIIl[87] = 92 ^ 26;
        llIIIIIIl[88] = (87 ^ 63) ^ (182 ^ 153);
        llIIIIIIl[89] = (252 ^ 142) ^ (112 ^ 74);
        llIIIIIIl[90] = 251 ^ 178;
        llIIIIIIl[91] = (-((-16405) & 30879)) & (-85) & 16383;
        llIIIIIIl[92] = (-((-8234) & 12351)) & (-385) & 8191;
        llIIIIIIl[93] = (-((-791) & 31607)) & (-1) & 32623;
        llIIIIIIl[94] = (-12546) & 16271;
        llIIIIIIl[95] = (-14337) & 16055;
        llIIIIIIl[96] = (-67) & 3791;
        llIIIIIIl[97] = (-25009) & 26559;
        llIIIIIIl[98] = (-8267) & 12015;
        llIIIIIIl[99] = (-14864) & 16383;
        llIIIIIIl[100] = (-25057) & 28647;
        llIIIIIIl[101] = (-4097) & 5870;
        llIIIIIIl[102] = (-(((152 + 55) - 134) + 96)) & (-24578) & 28333;
        llIIIIIIl[103] = (-((-1540) & 3659)) & (-265) & 4095;
        llIIIIIIl[104] = (-((-24077) & 32477)) & (-5) & 12287;
        llIIIIIIl[105] = (58 ^ 72) ^ (81 ^ 105);
        llIIIIIIl[106] = 55 ^ 124;
        llIIIIIIl[107] = (0 ^ 105) ^ (109 ^ 72);
        llIIIIIIl[108] = (((169 + 36) - 80) + 99) ^ (((88 + 97) - 132) + 120);
        llIIIIIIl[109] = (((136 + 45) - 127) + 163) ^ (((21 + 39) - 52) + 143);
        llIIIIIIl[110] = (115 ^ 29) ^ (80 ^ 113);
        llIIIIIIl[111] = (((82 + 88) - 74) + 52) ^ (((30 + 156) - 103) + 113);
        llIIIIIIl[112] = (101 ^ 67) ^ (61 ^ 74);
        llIIIIIIl[113] = (14 ^ 120) ^ (127 ^ 91);
        llIIIIIIl[114] = 235 ^ 184;
        llIIIIIIl[115] = 221 ^ 137;
        llIIIIIIl[116] = (158 ^ 182) ^ (192 ^ 189);
        llIIIIIIl[117] = 205 ^ 155;
        llIIIIIIl[118] = 200 ^ 159;
        llIIIIIIl[119] = 217 ^ 129;
        llIIIIIIl[120] = 254 ^ 167;
        llIIIIIIl[121] = 51 ^ 105;
        llIIIIIIl[122] = (((76 + 128) - 157) + 173) ^ (((54 + 122) - 158) + 117);
        llIIIIIIl[123] = 225 ^ 189;
        llIIIIIIl[124] = 123 ^ 38;
        llIIIIIIl[125] = (94 ^ 109) ^ (30 ^ 115);
    }
}
