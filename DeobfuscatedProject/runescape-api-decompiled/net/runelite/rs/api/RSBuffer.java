/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Buffer
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.math.BigInteger;
import net.runelite.api.Buffer;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSNode;

public interface RSBuffer
extends Buffer,
RSNode {
    @Import(value="array")
    public byte[] getPayload();

    @Import(value="offset")
    public int getOffset();

    @Import(value="offset")
    public void setOffset(int var1);

    @Import(value="checkCrc")
    public boolean checkCrc();

    @Import(value="encryptRsa")
    public void encryptRsa(BigInteger var1, BigInteger var2);

    @Import(value="packBytesToInt")
    public int packBytesToInt();

    @Import(value="readBoolean")
    public boolean readBoolean();

    @Import(value="readByte")
    public byte readByte();

    @Import(value="readByteAdd")
    public byte readByteAdd();

    @Import(value="readByteNeg")
    public byte readByteNeg();

    @Import(value="readByteSub")
    public byte readByteSub();

    @Import(value="readBytes")
    public void readBytes(byte[] var1, int var2, int var3);

    @Import(value="readCESU8")
    public String readCESU8();

    @Import(value="readIncrSmallSmart")
    public int readIncrSmallSmart();

    @Import(value="readInt")
    public int readInt();

    @Import(value="readLargeSmart")
    public int readLargeSmart();

    @Import(value="readLong")
    public long readLong();

    @Import(value="readMedium")
    public int readMedium();

    @Import(value="readNullableLargeSmart")
    public int readNullableLargeSmart();

    @Import(value="readShort")
    public int readShort();

    @Import(value="readShortSmartSub")
    public int readShortSmartSub();

    @Import(value="readStringCp1252NullCircumfixed")
    public String readStringCp1252NullCircumfixed();

    @Import(value="readStringCp1252NullTerminated")
    public String readStringCp1252NullTerminated();

    @Import(value="readStringCp1252NullTerminatedOrNull")
    public String readStringCp1252NullTerminatedOrNull();

    @Import(value="readUShortSmart")
    public int readUShortSmart();

    @Import(value="readUnsignedByte")
    public int readUnsignedByte();

    @Import(value="readUnsignedByteAdd")
    public int readUnsignedByteAdd();

    @Import(value="readUnsignedByteNeg")
    public int readUnsignedByteNeg();

    @Import(value="readUnsignedByteSub")
    public int readUnsignedByteSub();

    @Import(value="readUnsignedIntIME")
    public int readUnsignedIntIME();

    @Import(value="readUnsignedIntLE")
    public int readUnsignedIntLE();

    @Import(value="readUnsignedIntME")
    public int readUnsignedIntME();

    @Import(value="readUnsignedShort")
    public int readUnsignedShort();

    @Import(value="readUnsignedShortAdd")
    public int readUnsignedShortAdd();

    @Import(value="readUnsignedShortAddLE")
    public int readUnsignedShortAddLE();

    @Import(value="readUnsignedShortLE")
    public int readUnsignedShortLE();

    @Import(value="readVarInt")
    public int readVarInt();

    @Import(value="releaseArray")
    public void releaseArray();

    @Import(value="writeBoolean")
    public void writeBoolean(boolean var1);

    @Import(value="writeBuffer")
    public void writeBuffer(Buffer var1);

    @Import(value="writeByte")
    public void writeByte(int var1);

    @Import(value="writeByteAdd")
    public void writeByteAdd(int var1);

    @Import(value="writeByteNeg")
    public void writeByteNeg(int var1);

    @Import(value="writeByteSub")
    public void writeByteSub(int var1);

    @Import(value="writeBytes")
    public void writeBytes(byte[] var1, int var2, int var3);

    @Import(value="writeCESU8")
    public void writeCESU8(CharSequence var1);

    @Import(value="writeCrc")
    public int writeCrc(int var1);

    @Import(value="writeInt")
    public void writeInt(int var1);

    @Import(value="writeIntIME")
    public void writeIntIME(int var1);

    @Import(value="writeIntLE")
    public void writeIntLE(int var1);

    @Import(value="writeIntME")
    public void writeIntME(int var1);

    @Import(value="writeLengthByte")
    public void writeLengthByte(int var1);

    @Import(value="writeLengthInt")
    public void writeLengthInt(int var1);

    @Import(value="writeLengthShort")
    public void writeLengthShort(int var1);

    @Import(value="writeLong")
    public void writeLong(long var1);

    @Import(value="writeLongMedium")
    public void writeLongMedium(long var1);

    @Import(value="writeMedium")
    public void writeMedium(int var1);

    @Import(value="writeShort")
    public void writeShort(int var1);

    @Import(value="writeShortAdd")
    public void writeShortAdd(int var1);

    @Import(value="writeShortAddLE")
    public void writeShortAddLE(int var1);

    @Import(value="writeShortLE")
    public void writeShortLE(int var1);

    @Import(value="writeSmartByteShort")
    public void writeSmartByteShort(int var1);

    @Import(value="writeStringCp1252NullCircumfixed")
    public void writeStringCp1252NullCircumfixed(String var1);

    @Import(value="writeStringCp1252NullTerminated")
    public void writeStringCp1252NullTerminated(String var1);

    @Import(value="writeVarInt")
    public void writeVarInt(int var1);

    @Import(value="xteaDecrypt")
    public void xteaDecrypt(int[] var1, int var2, int var3);

    @Import(value="xteaDecryptAll")
    public void xteaDecryptAll(int[] var1);

    @Import(value="xteaEncrypt")
    public void xteaEncrypt(int[] var1, int var2, int var3);

    @Import(value="xteaEncryptAll")
    public void xteaEncryptAll(int[] var1);
}

