/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.packets.ClientPacket
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.packets.ClientPacket;
import net.runelite.mapping.Import;

public interface RSClientPacket
extends ClientPacket {
    @Import(value="id")
    public int getId();

    @Import(value="length")
    public int getLength();

    @Import(value="RESUME_PAUSEBUTTON")
    public RSClientPacket RESUME_PAUSEBUTTON();

    @Import(value="RESUME_NAMEDIALOG")
    public RSClientPacket RESUME_NAMEDIALOG();

    @Import(value="EVENT_KEYBOARD")
    public RSClientPacket EVENT_KEYBOARD();

    @Import(value="EVENT_APPLET_FOCUS")
    public RSClientPacket EVENT_APPLET_FOCUS();

    @Import(value="IF_BUTTONX")
    public RSClientPacket IF_BUTTONX();

    @Import(value="MINIMAP_CLICK")
    public RSClientPacket MINIMAP_CLICK();

    @Import(value="MOUSE_RECORDER_DATA")
    public RSClientPacket MOUSE_RECORDER_DATA();

    @Import(value="IF_BUTTONT")
    public RSClientPacket IF_BUTTONT();

    @Import(value="OPPLAYER6")
    public RSClientPacket OPPLAYER6();

    @Import(value="OPNPC2")
    public RSClientPacket OPNPC2();

    @Import(value="OPPLAYER7")
    public RSClientPacket OPPLAYER7();

    @Import(value="OPNPC3")
    public RSClientPacket OPNPC3();

    @Import(value="OPLOC2")
    public RSClientPacket OPLOC2();

    @Import(value="OPPLAYER8")
    public RSClientPacket OPPLAYER8();

    @Import(value="OPNPC1")
    public RSClientPacket OPNPC1();

    @Import(value="OPLOC1")
    public RSClientPacket OPLOC1();

    @Import(value="OPLOC4")
    public RSClientPacket OPLOC4();

    @Import(value="FREECAM_EXIT")
    public RSClientPacket FREECAM_EXIT();

    @Import(value="OPPLAYER2")
    public RSClientPacket OPPLAYER2();

    @Import(value="OPLOC3")
    public RSClientPacket OPLOC3();

    @Import(value="OPPLAYER3")
    public RSClientPacket OPPLAYER3();

    @Import(value="OPPLAYER4")
    public RSClientPacket OPPLAYER4();

    @Import(value="OPNPC4")
    public RSClientPacket OPNPC4();

    @Import(value="LOGIN_TIMINGS")
    public RSClientPacket LOGIN_TIMINGS();

    @Import(value="OPLOC5")
    public RSClientPacket OPLOC5();

    @Import(value="OPPLAYER5")
    public RSClientPacket OPPLAYER5();

    @Import(value="EVENT_MOUSE_IDLE")
    public RSClientPacket EVENT_MOUSE_IDLE();

    @Import(value="OPNPC5")
    public RSClientPacket OPNPC5();

    @Import(value="CHAT_SENDPRIVATE")
    public RSClientPacket CHAT_SENDPRIVATE();

    @Import(value="CLOSE_MODAL")
    public RSClientPacket CLOSE_MODAL();

    @Import(value="OPPLAYER1")
    public RSClientPacket OPPLAYER1();

    @Import(value="CHAT_SENDABUSEREPORT")
    public RSClientPacket CHAT_SENDABUSEREPORT();

    @Import(value="PING_STATISTICS")
    public RSClientPacket PING_STATISTICS();

    @Import(value="EVENT_WINDOW_SETTING")
    public RSClientPacket EVENT_WINDOW_SETTING();

    @Import(value="OPOBJ1")
    public RSClientPacket OPOBJ1();

    @Import(value="DOCHEAT")
    public RSClientPacket DOCHEAT();

    @Import(value="CLAN_KICKUSER")
    public RSClientPacket CLAN_KICKUSER();

    @Import(value="OPOBJ5")
    public RSClientPacket OPOBJ5();

    @Import(value="IGNORE_DELUSER")
    public RSClientPacket IGNORE_DELUSER();

    @Import(value="OPOBJ4")
    public RSClientPacket OPOBJ4();

    @Import(value="OPOBJ3")
    public RSClientPacket OPOBJ3();

    @Import(value="CHAT_SETFILTER")
    public RSClientPacket CHAT_SETFILTER();

    @Import(value="OPOBJ2")
    public RSClientPacket OPOBJ2();

    @Import(value="OPHELDD")
    public RSClientPacket OPHELDD();

    @Import(value="RESUME_COUNTDIALOG")
    public RSClientPacket RESUME_COUNTDIALOG();

    @Import(value="NO_TIMEOUT")
    public RSClientPacket NO_TIMEOUT();

    @Import(value="OPLOCT")
    public RSClientPacket OPLOCT();

    @Import(value="RESUME_OBJDIALOG")
    public RSClientPacket RESUME_OBJDIALOG();

    @Import(value="OPPLAYERT")
    public RSClientPacket OPPLAYERT();

    @Import(value="OPNPCT")
    public RSClientPacket OPNPCT();

    @Import(value="FRIEND_DELUSER")
    public RSClientPacket FRIEND_DELUSER();

    @Import(value="OPLOCE")
    public RSClientPacket OPLOCE();

    @Import(value="OPNPCE")
    public RSClientPacket OPNPCE();

    @Import(value="EVENT_CAMERA_POSITION")
    public RSClientPacket EVENT_CAMERA_POSITION();

    @Import(value="REFLECTION_CHECK_REPLY")
    public RSClientPacket REFLECTION_CHECK_REPLY();

    @Import(value="OPOBJT")
    public RSClientPacket OPOBJT();

    @Import(value="DETECT_MODIFIED_CLIENT")
    public RSClientPacket DETECT_MODIFIED_CLIENT();

    @Import(value="OPOBJE")
    public RSClientPacket OPOBJE();

    @Import(value="RESUME_STRINGDIALOG")
    public RSClientPacket RESUME_STRINGDIALOG();

    @Import(value="MOVE_GAMECLICK")
    public RSClientPacket MOVE_GAMECLICK();

    @Import(value="EVENT_MOUSE_CLICK")
    public RSClientPacket EVENT_MOUSE_CLICK();

    @Import(value="ROTATE_MOUSE_WHEEL")
    public RSClientPacket ROTATE_MOUSE_WHEEL();
}

