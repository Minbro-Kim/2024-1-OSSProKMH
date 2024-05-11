package com.backend.controllers;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/************
 * @info : QR Code 생성 및 제공 Controller
 * @name : QrController
 * @date : 2023/03/24 5:32 PM
 * @version : 1.0.0
 * @Description :
 ************/
@RestController
@RequiredArgsConstructor
@Slf4j
public class QrController {

    @GetMapping("/checkattendance/qr")
    public ResponseEntity<byte[]> qrToTistory() throws WriterException, IOException {
    	//임시정보
    	String meetingName="OSSProject";
    	String meetingDate = LocalDateTime.now().toString();//현재시간
    	
    	// QR 코드의 내용으로 사용할 문자열 조합 (예: "모임 이름 - 날짜")
        String qrContent = meetingName + " - " + meetingDate;//임시정보
    	// QR 정보
        int width = 300;
        int height = 300;
        
        // QR Code - BitMatrix: qr code 정보 생성
        BitMatrix encode = new MultiFormatWriter()
        			.encode(qrContent, BarcodeFormat.QR_CODE, width, height);

        // QR Code - Image 생성. : 1회성으로 생성해야 하기 때문에
        // stream으로 Generate(1회성이 아니면 File로 작성 가능.)
        try {
	        //output Stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            
            //Bitmatrix, file.format, outputStream
            MatrixToImageWriter.writeToStream(encode, "PNG", out);
            
            return ResponseEntity.ok()
                    .contentType(MediaType.IMAGE_PNG)
                    .body(out.toByteArray());

        }catch (Exception e){log.warn("QR Code OutputStream 도중 Excpetion 발생, {}", e.getMessage());}

        return null;
    }
}
