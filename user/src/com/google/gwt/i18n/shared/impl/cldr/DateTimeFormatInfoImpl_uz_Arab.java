/*
 * Copyright 2012 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.i18n.shared.impl.cldr;

// DO NOT EDIT - GENERATED FROM CLDR AND ICU DATA
//  cldrVersion=21.0
//  number=$Revision: 6546 $
//  date=$Date: 2012-02-07 13:32:35 -0500 (Tue, 07 Feb 2012) $
//  type=root

/**
 * Implementation of DateTimeFormatInfo for the "uz_Arab" locale.
 */
public class DateTimeFormatInfoImpl_uz_Arab extends DateTimeFormatInfoImpl_uz {

  @Override
  public String dateFormatFull() {
    return "y نچی ییل d نچی MMMM EEEE کونی";
  }

  @Override
  public String dateFormatLong() {
    return "d نچی MMMM y";
  }

  @Override
  public String dateFormatMedium() {
    return "d MMM y";
  }

  @Override
  public String dateFormatShort() {
    return "yyyy/M/d";
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "ق.م.",
        "م."
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "ق.م.",
        "م."
    };
  }

  @Override
  public int firstDayOfTheWeek() {
    return 6;
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "جنوری",
        "فبروری",
        "مارچ",
        "اپریل",
        "می",
        "جون",
        "جولای",
        "اگست",
        "سپتمبر",
        "اکتوبر",
        "نومبر",
        "دسمبر"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "11",
        "12"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "جنو",
        "فبر",
        "مار",
        "اپر",
        "مـی",
        "جون",
        "جول",
        "اگس",
        "سپت",
        "اکت",
        "نوم",
        "دسم"
    };
  }

  @Override
  public String timeFormatFull() {
    return "H:mm:ss (zzzz)";
  }

  @Override
  public String timeFormatLong() {
    return "H:mm:ss (z)";
  }

  @Override
  public String timeFormatMedium() {
    return "H:mm:ss";
  }

  @Override
  public String timeFormatShort() {
    return "H:mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "یکشنبه",
        "دوشنبه",
        "سه‌شنبه",
        "چهارشنبه",
        "پنجشنبه",
        "جمعه",
        "شنبه"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "ی.",
        "د.",
        "س.",
        "چ.",
        "پ.",
        "ج.",
        "ش."
    };
  }

  @Override
  public int weekendEnd() {
    return 5;
  }

  @Override
  public int weekendStart() {
    return 4;
  }
}
