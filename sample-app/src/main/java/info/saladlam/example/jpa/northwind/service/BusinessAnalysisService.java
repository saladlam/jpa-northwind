package info.saladlam.example.jpa.northwind.service;

import info.saladlam.example.jpa.northwind.dto.NameValueDto;
import info.saladlam.example.jpa.northwind.dto.StringAndStringDto;

import java.time.LocalDateTime;
import java.util.List;

public interface BusinessAnalysisService {

    List<StringAndStringDto> listNameOfStaffAndSupervisor();

    List<NameValueDto> totalSalesByCategoryBetweenDate(LocalDateTime from, LocalDateTime to);

    List<NameValueDto> totalSalesByStaffBetweenDate(LocalDateTime from, LocalDateTime to);

}
