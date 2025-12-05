/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.packets;

import java.util.Map;

public interface ClientPacket {
    public int getId();

    public int getLength();

    public ClientPacket RESUME_PAUSEBUTTON();

    public ClientPacket RESUME_NAMEDIALOG();

    public ClientPacket EVENT_KEYBOARD();

    public ClientPacket EVENT_APPLET_FOCUS();

    public ClientPacket IF_BUTTONX();

    public ClientPacket MOUSE_RECORDER_DATA();

    public ClientPacket IF_BUTTONT();

    public ClientPacket OPPLAYER6();

    public ClientPacket OPNPC2();

    public ClientPacket OPPLAYER7();

    public ClientPacket OPNPC3();

    public ClientPacket OPLOC2();

    public ClientPacket OPPLAYER8();

    public ClientPacket OPNPC1();

    public ClientPacket OPLOC1();

    public ClientPacket OPLOC4();

    public ClientPacket FREECAM_EXIT();

    public ClientPacket OPPLAYER2();

    public ClientPacket OPLOC3();

    public ClientPacket OPPLAYER3();

    public ClientPacket OPPLAYER4();

    public ClientPacket OPNPC4();

    public ClientPacket LOGIN_TIMINGS();

    public ClientPacket OPLOC5();

    public ClientPacket OPPLAYER5();

    public ClientPacket EVENT_MOUSE_IDLE();

    public ClientPacket OPNPC5();

    public ClientPacket CHAT_SENDPRIVATE();

    public ClientPacket CLOSE_MODAL();

    public ClientPacket OPPLAYER1();

    public ClientPacket CHAT_SENDABUSEREPORT();

    public ClientPacket PING_STATISTICS();

    public ClientPacket MINIMAP_CLICK();

    public ClientPacket EVENT_WINDOW_SETTING();

    public ClientPacket OPOBJ1();

    public ClientPacket DOCHEAT();

    public ClientPacket CLAN_KICKUSER();

    public ClientPacket OPOBJ5();

    public ClientPacket IGNORE_DELUSER();

    public ClientPacket OPOBJ4();

    public ClientPacket OPOBJ3();

    public ClientPacket CHAT_SETFILTER();

    public ClientPacket OPOBJ2();

    public ClientPacket OPHELDD();

    public ClientPacket RESUME_COUNTDIALOG();

    public ClientPacket NO_TIMEOUT();

    public ClientPacket OPLOCT();

    public ClientPacket RESUME_OBJDIALOG();

    public ClientPacket OPPLAYERT();

    public ClientPacket OPNPCT();

    public ClientPacket FRIEND_DELUSER();

    public ClientPacket OPLOCE();

    public ClientPacket OPNPCE();

    public ClientPacket EVENT_CAMERA_POSITION();

    public ClientPacket REFLECTION_CHECK_REPLY();

    public ClientPacket OPOBJT();

    public ClientPacket DETECT_MODIFIED_CLIENT();

    public ClientPacket OPOBJE();

    public ClientPacket RESUME_STRINGDIALOG();

    public ClientPacket MOVE_GAMECLICK();

    public ClientPacket EVENT_MOUSE_CLICK();

    public ClientPacket ROTATE_MOUSE_WHEEL();

    default public Map<ClientPacket, String> getClientPackets() {
        return Map.ofEntries(Map.entry(this.RESUME_PAUSEBUTTON(), "RESUME_PAUSEBUTTON"), Map.entry(this.RESUME_NAMEDIALOG(), "RESUME_NAMEDIALOG"), Map.entry(this.EVENT_KEYBOARD(), "EVENT_KEYBOARD"), Map.entry(this.EVENT_APPLET_FOCUS(), "EVENT_APPLET_FOCUS"), Map.entry(this.IF_BUTTONX(), "IF_BUTTONX"), Map.entry(this.ROTATE_MOUSE_WHEEL(), "ROTATE_MOUSE_WHEEL"), Map.entry(this.IF_BUTTONT(), "IF_BUTTONT"), Map.entry(this.OPPLAYER6(), "OPPLAYER6"), Map.entry(this.OPNPC2(), "OPNPC2"), Map.entry(this.OPPLAYER7(), "OPPLAYER7"), Map.entry(this.OPNPC3(), "OPNPC3"), Map.entry(this.OPLOC2(), "OPLOC2"), Map.entry(this.OPPLAYER8(), "OPPLAYER8"), Map.entry(this.OPNPC1(), "OPNPC1"), Map.entry(this.OPLOC1(), "OPLOC1"), Map.entry(this.OPLOC4(), "OPLOC4"), Map.entry(this.FREECAM_EXIT(), "FREECAM_EXIT"), Map.entry(this.OPPLAYER2(), "OPPLAYER2"), Map.entry(this.OPLOC3(), "OPLOC3"), Map.entry(this.OPPLAYER3(), "OPPLAYER3"), Map.entry(this.OPPLAYER4(), "OPPLAYER4"), Map.entry(this.OPNPC4(), "OPNPC4"), Map.entry(this.LOGIN_TIMINGS(), "LOGIN_TIMINGS"), Map.entry(this.OPLOC5(), "OPLOC5"), Map.entry(this.OPPLAYER5(), "OPPLAYER5"), Map.entry(this.EVENT_MOUSE_IDLE(), "EVENT_MOUSE_IDLE"), Map.entry(this.OPNPC5(), "OPNPC5"), Map.entry(this.CHAT_SENDPRIVATE(), "CHAT_SENDPRIVATE"), Map.entry(this.CLOSE_MODAL(), "CLOSE_MODAL"), Map.entry(this.OPPLAYER1(), "OPPLAYER1"), Map.entry(this.CHAT_SENDABUSEREPORT(), "CHAT_SENDABUSEREPORT"), Map.entry(this.PING_STATISTICS(), "PING_STATISTICS"), Map.entry(this.MINIMAP_CLICK(), "MINIMAP_CLICK"), Map.entry(this.EVENT_WINDOW_SETTING(), "EVENT_WINDOW_SETTING"), Map.entry(this.OPOBJ1(), "OPOBJ1"), Map.entry(this.DOCHEAT(), "DOCHEAT"), Map.entry(this.CLAN_KICKUSER(), "CLAN_KICKUSER"), Map.entry(this.OPOBJ5(), "OPOBJ5"), Map.entry(this.IGNORE_DELUSER(), "IGNORE_DELUSER"), Map.entry(this.OPOBJ4(), "OPOBJ4"), Map.entry(this.OPOBJ3(), "OPOBJ3"), Map.entry(this.CHAT_SETFILTER(), "CHAT_SETFILTER"), Map.entry(this.OPOBJ2(), "OPOBJ2"), Map.entry(this.OPHELDD(), "OPHELDD"), Map.entry(this.RESUME_COUNTDIALOG(), "RESUME_COUNTDIALOG"), Map.entry(this.NO_TIMEOUT(), "NO_TIMEOUT"), Map.entry(this.OPLOCT(), "OPLOCT"), Map.entry(this.RESUME_OBJDIALOG(), "RESUME_OBJDIALOG"), Map.entry(this.OPPLAYERT(), "OPPLAYERT"), Map.entry(this.OPNPCT(), "OPNPCT"), Map.entry(this.FRIEND_DELUSER(), "FRIEND_DELUSER"), Map.entry(this.OPLOCE(), "OPLOCE"), Map.entry(this.OPNPCE(), "OPNPCE"), Map.entry(this.EVENT_CAMERA_POSITION(), "EVENT_CAMERA_POSITION"), Map.entry(this.REFLECTION_CHECK_REPLY(), "REFLECTION_CHECK_REPLY"), Map.entry(this.OPOBJT(), "OPOBJT"), Map.entry(this.DETECT_MODIFIED_CLIENT(), "DETECT_MODIFIED_CLIENT"), Map.entry(this.OPOBJE(), "OPOBJE"), Map.entry(this.RESUME_STRINGDIALOG(), "RESUME_STRINGDIALOG"), Map.entry(this.MOVE_GAMECLICK(), "MOVE_GAMECLICK"), Map.entry(this.EVENT_MOUSE_CLICK(), "EVENT_MOUSE_CLICK"), Map.entry(this.MOUSE_RECORDER_DATA(), "MOUSE_RECORDER_DATA"));
    }
}

