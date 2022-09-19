package com.DocumentManagment.Qrcode;

public interface QRCodeService {

    byte[] generateQRCode(String qrContent, int width, int height);

}
