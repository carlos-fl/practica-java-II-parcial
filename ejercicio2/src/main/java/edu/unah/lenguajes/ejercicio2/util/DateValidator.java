package edu.unah.lenguajes.ejercicio2.util;

import java.time.LocalDate;

public class DateValidator {
  public static boolean isValidDate(LocalDate startDate, LocalDate endDate, LocalDate date) {
   return ((date.isAfter(startDate) && date.isBefore(endDate)) || date.isEqual(startDate) || date.isEqual(endDate));
  }
}