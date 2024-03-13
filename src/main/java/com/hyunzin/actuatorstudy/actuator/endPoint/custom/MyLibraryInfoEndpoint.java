package com.hyunzin.actuatorstudy.actuator.endPoint.custom;

import com.hyunzin.actuatorstudy.actuator.dto.LibraryInfo;
import java.util.Arrays;
import java.util.List;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

//@Component   // <-- bean 등록을 위해 이걸 추가해도 됨
@Endpoint(id = "myLibraryInfo")  // endpoint id 지정. 필수!
public class MyLibraryInfoEndpoint {
    @ReadOperation    // read 요청에 대한 메서드라는 의미
    public List<LibraryInfo> getLibraryInfos() {
        // 라이브러리 정보를 읽어서 name, version을 가져오는 코드가 있어야 하나 하드코딩으로 대체함.
        LibraryInfo libraryInfo1 = new LibraryInfo();
        libraryInfo1.setName("logback");
        libraryInfo1.setVersion("1.0.0");

        LibraryInfo libraryInfo2 = new LibraryInfo();
        libraryInfo2.setName("jackson");
        libraryInfo2.setVersion("2.0.0");

        return Arrays.asList(libraryInfo1, libraryInfo2);
    }
}