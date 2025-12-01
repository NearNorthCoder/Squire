package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Avoiding Grasping Claws", priority = 2147483641, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ax  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/ax.class */
public class ax extends A {
    private /* synthetic */ List<NPC> ew;
    private static final /* synthetic */ Logger et;
    private /* synthetic */ NPC eA;
    private /* synthetic */ List<WorldPoint> ev;
    private /* synthetic */ List<WorldArea> ey;
    private static /* synthetic */ String[] lllIllllIIIl;
    private /* synthetic */ RectangularArea ex;
    private /* synthetic */ List<NPC> eB;
    private /* synthetic */ WorldPoint ez;
    private /* synthetic */ int[] cN;
    private final /* synthetic */ C0009f eu;
    private static /* synthetic */ int[] lllIllllIIlI;

    private static String lIIIlllIIIIlIll(String lllllllllllllllIIllIIIllIlIllIII, String lllllllllllllllIIllIIIllIlIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIllIlIlIlll.getBytes(StandardCharsets.UTF_8)), lllIllllIIlI[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIllllIIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIllIlIllIIl) {
            lllllllllllllllIIllIIIllIlIllIIl.printStackTrace();
            return null;
        }
    }

    public WorldPoint cG() {
        Stream<WorldPoint> filter;
        WorldArea worldArea = SquireNightmarePlugin.d().getWorldArea();
        int x = worldArea.getX();
        int y = worldArea.getY();
        int width = (x + worldArea.getWidth()) - lllIllllIIlI[0];
        int height = (y + worldArea.getHeight()) - lllIllllIIlI[0];
        RectangularArea ay = C0008e.ay();
        WorldPoint worldPoint = new WorldPoint(x, y, lllIllllIIlI[3]);
        WorldPoint worldPoint2 = new WorldPoint(width, height, lllIllllIIlI[3]);
        WorldPoint worldPoint3 = new WorldPoint(x, height, lllIllllIIlI[3]);
        WorldPoint worldPoint4 = new WorldPoint(width, y, lllIllllIIlI[3]);
        WorldPoint[] worldPointArr = new WorldPoint[lllIllllIIlI[4]];
        worldPointArr[lllIllllIIlI[1]] = worldPoint;
        worldPointArr[lllIllllIIlI[0]] = worldPoint2;
        worldPointArr[lllIllllIIlI[2]] = worldPoint3;
        worldPointArr[lllIllllIIlI[3]] = worldPoint4;
        List asList = Arrays.asList(worldPointArr);
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (lIIIlllIIIlIIIl(C0008e.ax().isEmpty() ? 1 : 0)) {
            if (lIIIlllIIIlIIII(this.cM.am() ? 1 : 0)) {
                filter = worldArea.getMeleeTiles(this.cL).stream().filter(worldPoint5 -> {
                    if (lIIIlllIIIlIlII(worldPoint5.distanceTo(worldLocation), lllIllllIIlI[3])) {
                        ?? r0 = lllIllllIIlI[0];
                        "".length();
                        return (88 ^ 92) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllIllllIIlI[1];
                });
                "".length();
                if (0 != 0) {
                    return null;
                }
            } else {
                filter = worldArea.getMeleeTiles(this.cL).stream().filter(worldPoint6 -> {
                    if (lIIIlllIIIlIlII(worldPoint6.distanceTo(worldLocation), lllIllllIIlI[7])) {
                        ?? r0 = lllIllllIIlI[0];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllIllllIIlI[1];
                });
            }
            WorldPoint orElse = a(filter).min(Comparator.comparingInt(worldPoint7 -> {
                return worldPoint7.distanceTo(worldLocation);
            })).orElse(null);
            if (lIIIlllIIIlIIlI(orElse)) {
                orElse = a(worldLocation.toWorldArea(lllIllllIIlI[5], lllIllllIIlI[5]).toWorldPointList().stream()).filter(worldPoint8 -> {
                    return this.ey.stream().noneMatch(worldArea2 -> {
                        return worldArea2.getMeleeTiles(this.cL).contains(worldPoint8);
                    });
                }).min(Comparator.comparingInt(worldPoint9 -> {
                    return worldPoint9.distanceTo(worldLocation);
                })).orElse(null);
                Log.info("[AvoidShadows]: Using shroom melee avoidance via pnm melee points. closest melee shroom tile: " + orElse);
            }
            if (lIIIlllIIIlIIlI(orElse)) {
                Log.info("[AvoidShadows]: Using shroom melee avoidance via player area points. closest melee shroom tile: " + orElse);
                orElse = (WorldPoint) ((Stream) asList.stream().filter(worldPoint10 -> {
                    if (lIIIlllIIIlIIIl(this.cM.Y().contains(worldPoint10) ? 1 : 0)) {
                        ?? r0 = lllIllllIIlI[0];
                        "".length();
                        return ((68 ^ 10) & ((213 ^ 155) ^ (-1))) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllIllllIIlI[1];
                }).filter(worldPoint11 -> {
                    return this.ey.stream().noneMatch(worldArea2 -> {
                        return worldArea2.contains(worldPoint11);
                    });
                }).parallel()).filter(worldPoint12 -> {
                    return a(this.ez, worldPoint12).stream().noneMatch(worldPoint12 -> {
                        return this.ey.stream().anyMatch(worldArea2 -> {
                            return worldArea2.contains(worldPoint12);
                        });
                    });
                }).min(Comparator.comparingInt(worldPoint13 -> {
                    return worldPoint13.distanceTo(worldLocation);
                })).orElse(null);
            }
            if (lIIIlllIIIlIIlI(orElse)) {
                Log.warn(lllIllllIIIl[lllIllllIIlI[3]]);
                orElse = (WorldPoint) asList.stream().filter(worldPoint14 -> {
                    if (lIIIlllIIIlIIIl(this.cM.Y().contains(worldPoint14) ? 1 : 0)) {
                        ?? r0 = lllIllllIIlI[0];
                        "".length();
                        return (-"   ".length()) >= 0 ? ((240 ^ 168) ^ (127 ^ 111)) & (((((158 + 103) - 167) + 148) ^ (((118 + 80) - 154) + 142)) ^ (-" ".length())) : r0;
                    }
                    return lllIllllIIlI[1];
                }).min(Comparator.comparingInt(worldPoint15 -> {
                    return worldPoint15.distanceTo(worldLocation);
                })).orElse(null);
            }
            return orElse;
        } else if (lIIIlllIIIlIIlI(ay)) {
            WorldPoint orElse2 = b(worldArea.getMeleeTiles(this.cL).stream()).filter(worldPoint16 -> {
                if (lIIIlllIIIlIlII(worldPoint16.distanceTo(worldLocation), lllIllllIIlI[7])) {
                    ?? r0 = lllIllllIIlI[0];
                    "".length();
                    return (((((175 + 17) - 174) + 159) ^ (((70 + 56) - 5) + 19)) & (((((100 + 25) - 65) + 80) ^ (((93 + 47) - (-25)) + 12)) ^ (-" ".length()))) <= (-" ".length()) ? ((213 ^ 129) ^ (101 ^ 55)) & (((118 ^ 76) ^ (120 ^ 68)) ^ (-" ".length())) : r0;
                }
                return lllIllllIIlI[1];
            }).min(Comparator.comparingInt(worldPoint17 -> {
                return worldPoint17.distanceTo(worldLocation);
            })).orElse(null);
            if (lIIIlllIIIlIIlI(orElse2)) {
                Log.info(lllIllllIIIl[lllIllllIIlI[4]]);
                orElse2 = b(worldLocation.toWorldArea(lllIllllIIlI[6], lllIllllIIlI[6]).toWorldPointList().stream()).min(Comparator.comparingInt(worldPoint18 -> {
                    return worldPoint18.distanceTo(worldLocation);
                })).orElse(null);
            }
            return orElse2;
        } else {
            Stream<WorldPoint> filter2 = b(worldArea.getMeleeTiles(this.cL).stream()).filter(worldPoint19 -> {
                if (lIIIlllIIIlIlII(worldPoint19.distanceTo(worldLocation), lllIllllIIlI[7])) {
                    ?? r0 = lllIllllIIlI[0];
                    "".length();
                    return 0 != 0 ? ((((187 + 85) - 113) + 72) ^ (((94 + 43) - 36) + 62)) & (((47 ^ 70) ^ (235 ^ 198)) ^ (-" ".length())) : r0;
                }
                return lllIllllIIlI[1];
            });
            Objects.requireNonNull(ay);
            "".length();
            WorldPoint orElse3 = filter2.filter(this::contains).min(Comparator.comparingInt(worldPoint20 -> {
                return worldPoint20.distanceTo(worldLocation);
            })).orElse(null);
            if (lIIIlllIIIlIIlI(orElse3)) {
                Log.info(lllIllllIIIl[lllIllllIIlI[6]]);
                Stream<WorldPoint> b = b(worldLocation.toWorldArea(lllIllllIIlI[6], lllIllllIIlI[6]).toWorldPointList().stream());
                Objects.requireNonNull(ay);
                "".length();
                orElse3 = b.filter(this::contains).min(Comparator.comparingInt(worldPoint21 -> {
                    return worldPoint21.distanceTo(worldLocation);
                })).orElse(null);
            }
            return orElse3;
        }
    }

    private WorldPoint cH() {
        WorldArea worldArea;
        NPC npc = (NPC) NPCs.getAll(SquireNightmarePlugin.q.stream().mapToInt((v0) -> {
            return v0.intValue();
        }).toArray()).stream().filter(npc2 -> {
            if (lIIIlllIIIlIIIl(npc2.isDead() ? 1 : 0)) {
                String[] strArr = new String[lllIllllIIlI[0]];
                strArr[lllIllllIIlI[1]] = lllIllllIIIl[lllIllllIIlI[7]];
                if (lIIIlllIIIlIIII(npc2.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lllIllllIIlI[0];
                    "".length();
                    return (-"  ".length()) > 0 ? ((((121 + 59) - 168) + 121) ^ (((77 + 41) - (-8)) + 11)) & (((((50 + 109) - 157) + 139) ^ (((118 + 92) - 109) + 28)) ^ (-" ".length())) : r0;
                }
            }
            return lllIllllIIlI[1];
        }).filter(npc3 -> {
            if (lIIIlllIIIlIIII(this.cM.ag.containsKey(Integer.valueOf(npc3.getId())) ? 1 : 0) && lIIIlllIIIlIlIl(this.cM.ag.get(Integer.valueOf(npc3.getId())).intValue(), lllIllllIIlI[8])) {
                ?? r0 = lllIllllIIlI[0];
                "".length();
                return " ".length() >= ((38 ^ 51) ^ (97 ^ 112)) ? ((((150 + 61) - 208) + 155) ^ (((137 + 127) - 261) + 151)) & (((72 ^ 0) ^ (232 ^ 164)) ^ (-" ".length())) : r0;
            }
            return lllIllllIIlI[1];
        }).min(Comparator.comparingInt(npc4 -> {
            return Players.getLocal().getWorldLocation().distanceTo(npc4.getWorldLocation());
        })).orElse(null);
        List<WorldPoint> list = this.ev;
        int i = lllIllllIIlI[7];
        Stream<WorldPoint> e = e((List) list.stream().filter(worldPoint -> {
            if (lIIIlllIIIlIlII(worldPoint.distanceTo(this.ez), i)) {
                ?? r0 = lllIllllIIlI[0];
                "".length();
                return " ".length() == "  ".length() ? ((((24 + 14) - (-75)) + 16) ^ (((128 + 117) - 192) + 85)) & (((((79 + 125) - 175) + 106) ^ (((82 + 126) - 152) + 84)) ^ (-" ".length())) : r0;
            }
            return lllIllllIIlI[1];
        }).collect(Collectors.toList()));
        WorldPoint e2 = SquireNightmarePlugin.e();
        if (lIIIlllIIIlIIlI(npc)) {
            worldArea = e2.toWorldArea();
            "".length();
            if (0 != 0) {
                return null;
            }
        } else {
            worldArea = npc.getWorldArea();
        }
        WorldArea worldArea2 = worldArea;
        return e.min(Comparator.comparingInt(obj -> {
            return ((WorldPoint) obj).distanceTo(e2);
        }).thenComparingInt(obj2 -> {
            return ((WorldPoint) obj2).distanceTo(worldArea2);
        }).thenComparingInt(obj3 -> {
            return ((WorldPoint) obj3).distanceTo(this.ez);
        })).orElse(null);
    }

    @Inject
    public ax(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0008e c0008e, C0009f c0009f) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin, c0008e);
        this.eu = c0009f;
    }

    private static String lIIIlllIIIIlIlI(String lllllllllllllllIIllIIIllIlIIlIII, String lllllllllllllllIIllIIIllIlIIIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIllIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIIllIlIIIllI = new StringBuilder();
        char[] lllllllllllllllIIllIIIllIlIIIlIl = lllllllllllllllIIllIIIllIlIIIlll.toCharArray();
        int lllllllllllllllIIllIIIllIlIIIlII = lllIllllIIlI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIllllIIlI[1];
        while (lIIIlllIIIlIlIl(i, length)) {
            char lllllllllllllllIIllIIIllIlIIlIIl = charArray[i];
            lllllllllllllllIIllIIIllIlIIIllI.append((char) (lllllllllllllllIIllIIIllIlIIlIIl ^ lllllllllllllllIIllIIIllIlIIIlIl[lllllllllllllllIIllIIIllIlIIIlII % lllllllllllllllIIllIIIllIlIIIlIl.length]));
            "".length();
            lllllllllllllllIIllIIIllIlIIIlII++;
            i++;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIIllIlIIIllI);
    }

    private Stream<WorldPoint> a(Stream<WorldPoint> stream) {
        return b((Stream) stream.parallel()).filter(worldPoint -> {
            return this.ey.stream().noneMatch(worldArea -> {
                return worldArea.contains(worldPoint);
            });
        }).filter(worldPoint2 -> {
            return a(this.ez, worldPoint2).stream().noneMatch(worldPoint2 -> {
                return this.ey.stream().anyMatch(worldArea -> {
                    return worldArea.contains(worldPoint2);
                });
            });
        });
    }

    private static boolean lIIIlllIIIlIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlllIIIlIIII(int i) {
        return i != 0;
    }

    private static void lIIIlllIIIIllll() {
        lllIllllIIlI = new int[11];
        lllIllllIIlI[0] = " ".length();
        lllIllllIIlI[1] = ((((70 + 77) - (-17)) + 8) ^ (((112 + 115) - 202) + 126)) & (((216 ^ 147) ^ (252 ^ 140)) ^ (-" ".length()));
        lllIllllIIlI[2] = "  ".length();
        lllIllllIIlI[3] = "   ".length();
        lllIllllIIlI[4] = 168 ^ 172;
        lllIllllIIlI[5] = (((3 + 27) - (-116)) + 28) ^ (((74 + 92) - 131) + 127);
        lllIllllIIlI[6] = 0 ^ 5;
        lllIllllIIlI[7] = (((173 + 139) - 213) + 86) ^ (((127 + 129) - 119) + 54);
        lllIllllIIlI[8] = ((157 + 161) - 179) + 61;
        lllIllllIIlI[9] = (135 ^ 157) ^ (173 ^ 176);
        lllIllllIIlI[10] = 17 ^ 25;
    }

    private Stream<WorldPoint> b(Stream<WorldPoint> stream) {
        return stream.filter(worldPoint -> {
            if (lIIIlllIIIlIlII(worldPoint.distanceTo(Players.getLocal()), lllIllllIIlI[5])) {
                ?? r0 = lllIllllIIlI[0];
                "".length();
                return "   ".length() == 0 ? ((186 ^ 188) ^ (130 ^ 157)) & (((((24 + 62) - (-7)) + 38) ^ (((96 + 54) - 72) + 76)) ^ (-" ".length())) : r0;
            }
            return lllIllllIIlI[1];
        }).filter(worldPoint2 -> {
            if (lIIIlllIIIlIIIl(this.cM.Y().contains(worldPoint2) ? 1 : 0) && lIIIlllIIIlIIIl(this.cS.getWorldArea().contains(worldPoint2) ? 1 : 0)) {
                ?? r0 = lllIllllIIlI[0];
                "".length();
                return ((178 ^ 160) & ((172 ^ 190) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIllllIIlI[1];
        }).filter(worldPoint3 -> {
            return this.ew.stream().noneMatch(npc -> {
                return npc.getWorldArea().contains(worldPoint3);
            });
        });
    }

    private WorldPoint cI() {
        return b(C0008e.aw().toWorldPointList().stream()).min(Comparator.comparingInt(worldPoint -> {
            return worldPoint.distanceTo(this.ez);
        })).orElse(null);
    }

    private WorldPoint cJ() {
        return b(C0008e.aw().toWorldPointList().parallelStream()).filter(worldPoint -> {
            r0 = C0008e.ay();
            return lIIIlllIIIlIIlI(r0) ? lllIllllIIlI[0] : r0.contains(worldPoint);
        }).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(this.ez);
        })).orElse(null);
    }

    private Stream<WorldPoint> e(List<WorldPoint> list) {
        return b(list.parallelStream()).filter(worldPoint -> {
            return this.ey.stream().noneMatch(worldArea -> {
                return worldArea.contains(worldPoint);
            });
        }).filter(worldPoint2 -> {
            return a(this.ez, worldPoint2).stream().noneMatch(worldPoint2 -> {
                return this.ey.stream().anyMatch(worldArea -> {
                    return worldArea.contains(worldPoint2);
                });
            });
        });
    }

    static {
        lIIIlllIIIIllll();
        lIIIlllIIIIlllI();
        et = LoggerFactory.getLogger(ax.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C
    public boolean bY() {
        int i;
        this.ey = C0008e.ax();
        this.ex = C0008e.ay();
        this.ez = Players.getLocal().getWorldLocation();
        if (lIIIlllIIIlIIII(this.cM.ap())) {
            i = lllIllllIIlI[0];
            "".length();
            if (((((60 + 89) - (-3)) + 13) ^ (((74 + 24) - 57) + 120)) == (((((42 + 81) - (-10)) + 87) ^ (((57 + 85) - (-3)) + 4)) & (((100 ^ 71) ^ (120 ^ 18)) ^ (-" ".length())))) {
                return ((69 ^ 73) ^ (157 ^ 152)) & (((137 ^ 191) ^ (121 ^ 70)) ^ (-" ".length()));
            }
        } else {
            i = lllIllllIIlI[1];
        }
        this.ev = C0008e.aw().toWorldPointList();
        if (lIIIlllIIIlIIIl(i)) {
            return lllIllllIIlI[1];
        }
        if (lIIIlllIIIlIIIl(this.cM.Y().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlllIIIlIIIl(this.cS.getWorldArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lllIllllIIlI[1];
        }
        this.cN = SquireNightmarePlugin.q.stream().mapToInt((v0) -> {
            return v0.intValue();
        }).toArray();
        this.eA = NPCs.getNearest(this.ez, this.cN);
        this.ew = NPCs.getAll(SquireNightmarePlugin.f1s.stream().mapToInt((v0) -> {
            return v0.intValue();
        }).toArray());
        if (lIIIlllIIIlIIlI(this.eA)) {
            et.info(lllIllllIIIl[lllIllllIIlI[1]]);
            return j(cG());
        }
        this.eB = NPCs.getAll(npc -> {
            if (lIIIlllIIIlIIII(SquireNightmarePlugin.q.contains(Integer.valueOf(npc.getId())) ? 1 : 0)) {
                String[] strArr = new String[lllIllllIIlI[0]];
                strArr[lllIllllIIlI[1]] = lllIllllIIIl[lllIllllIIlI[9]];
                if (lIIIlllIIIlIIII(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lllIllllIIlI[0];
                    "".length();
                    return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lllIllllIIlI[1];
        });
        if (lIIIlllIIIlIIll(this.ex)) {
            if (lIIIlllIIIlIIII(this.ex.contains(this.ez) ? 1 : 0)) {
                return j(cJ());
            }
            WorldPoint orElse = b(this.ex.toWorldPointList().stream()).min(Comparator.comparingInt(worldPoint -> {
                return worldPoint.distanceTo(this.ez);
            })).orElse(null);
            Log.info("[AvoidShadows]: Player is not in flower area, walking to closest safe area point: " + orElse);
            return j(orElse);
        } else if (lIIIlllIIIlIIIl(this.ey.isEmpty() ? 1 : 0)) {
            Log.info(lllIllllIIIl[lllIllllIIlI[0]]);
            return j(cH());
        } else {
            Log.info(lllIllllIIIl[lllIllllIIlI[2]]);
            return j(cI());
        }
    }

    private static String lIIIlllIIIIllII(String lllllllllllllllIIllIIIllIllIIlIl, String lllllllllllllllIIllIIIllIllIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIllIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIllIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIllllIIlI[2], lllllllllllllllIIllIIIllIllIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIllIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIllIllIIllI) {
            lllllllllllllllIIllIIIllIllIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlllIIIIlllI() {
        lllIllllIIIl = new String[lllIllllIIlI[10]];
        lllIllllIIIl[lllIllllIIlI[1]] = lIIIlllIIIIlIlI("EAklHg8vGzsQAiQ/ICxcawY8UQcoPDoHA2s8PAUDJjtzFwk+JjddRjwpPxoPJS9zBQlrKzwDCC46", "KHSqf");
        lllIllllIIIl[lllIllllIIlI[0]] = lIIIlllIIIIlIll("SVYt0FaQJCcyV22tY4FKuPDCCOvxIhZaknrKUWWKSYqCX6X7lYo/2/Z3+H/KVErzgdEEN5TMYcqfWE2gu5DkYg==", "hDllo");
        lllIllllIIIl[lllIllllIIlI[2]] = lIIIlllIIIIlIlI("GRclBCAmBTsKLS0hIDZzYhg8SzoqJDwEJDF2PBlpJDo8HCwwJXMbOyclNgU9bnY9BDsvNz9LLS0yNAInJXYnBGk2OScOJA==", "BVSkI");
        lllIllllIIIl[lllIllllIIlI[3]] = lIIIlllIIIIllII("FGVbg0/3rDH+itlSj1vkot4YkVjn3yx3ziro4mcofPamedNeZYAi8p3OgwWwldkn89GS1WRacTeTqCQztptVjxP5litLxS+/", "Urgrq");
        lllIllllIIIl[lllIllllIIlI[4]] = lIIIlllIIIIllII("HaDXAfKfSm9d34CJrGbc2C+oMOGjZlbNBDWOVMQSVRetmbaKHdwpAS9ys5kqErGeKg/rZ5U7swjEZ6A+T3pqMqCfkFM02YwQRBINGTK/JZwUPf2LEicTSg==", "HFbjB");
        lllIllllIIIl[lllIllllIIlI[6]] = lIIIlllIIIIlIlI("GAMQKSwnEQ4nISw1FRt/Y2ogCgoUBzQVbGMXFS8rJGIIKTcuIwpmKCYuAyNlIjQJLyEiLAUjZTUrB2Y1LyMfIzdjIxQjJGMyCS8rNzFI", "CBfFE");
        lllIllllIIIl[lllIllllIIlI[7]] = lIIIlllIIIIlIll("jGhwmagiETg=", "vfbzo");
        lllIllllIIIl[lllIllllIIlI[9]] = lIIIlllIIIIlIll("6mnSy8tM+aQ=", "Nlspa");
    }

    private static boolean lIIIlllIIIlIIIl(int i) {
        return i == 0;
    }

    private static boolean lIIIlllIIIlIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlllIIIlIlII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIlllIIIlIIll(Object obj) {
        return obj != null;
    }
}
