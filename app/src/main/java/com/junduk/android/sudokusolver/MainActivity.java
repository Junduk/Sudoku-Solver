package com.junduk.android.sudokusolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

class Field{
    int row;
    int col;
    int sqr;
    int num;
    Button field;
    public Field(int row, int col, int sqr, int num, Button field){
        this.row = row;
        this.col = col;
        this.sqr = sqr;
        this.num = num;
        this.field = field;
    }
}

public class MainActivity extends AppCompatActivity {
    int i;
    Button none, first, second, third, forth, fifth, sixth, seventh, eighth, ninth;
    Button field1, field2, field3, field4, field5, field6, field7, field8, field9;
    Button field10, field11, field12, field13, field14, field15, field16, field17, field18;
    Button field19, field20, field21, field22, field23, field24, field25, field26, field27;
    Button field28, field29, field30, field31, field32, field33, field34, field35, field36;
    Button field37, field38, field39, field40, field41, field42, field43, field44, field45;
    Button field46, field47, field48, field49, field50, field51, field52, field53, field54;
    Button field55, field56, field57, field58, field59, field60, field61, field62, field63;
    Button field64, field65, field66, field67, field68, field69, field70, field71, field72;
    Button field73, field74, field75, field76, field77, field78, field79, field80, field81;
    Button reset, start;
    Field f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30;
    Field f31, f32, f33, f34, f35, f36, f37, f38, f39, f40, f41, f42, f43, f44, f45, f46, f47, f48, f49, f50, f51, f52, f53, f54, f55, f56, f57, f58, f59, f60;
    Field f61, f62, f63, f64, f65, f66, f67, f68, f69, f70, f71, f72, f73, f74, f75, f76, f77, f78, f79, f80, f81;
    Field s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30;
    Field s31, s32, s33, s34, s35, s36, s37, s38, s39, s40, s41, s42, s43, s44, s45, s46, s47, s48, s49, s50, s51, s52, s53, s54, s55, s56, s57, s58, s59, s60;
    Field s61, s62, s63, s64, s65, s66, s67, s68, s69, s70, s71, s72, s73, s74, s75, s76, s77, s78, s79, s80, s81;
    Field[] filledFieldArray, startingFieldArray;
    Field[] row1, row2, row3, row4, row5, row6, row7, row8, row9;
    Field[] col1, col2, col3, col4, col5, col6, col7, col8, col9;
    Field[] sqr1, sqr2, sqr3, sqr4, sqr5, sqr6, sqr7, sqr8, sqr9;
    Boolean num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
    Boolean check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num0 = false;
        num1 = false;
        num2 = false;
        num3 = false;
        num4 = false;
        num5 = false;
        num6 = false;
        num7 = false;
        num8 = false;
        num9 = false;
        check = false;

        none = findViewById(R.id.none);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        forth = findViewById(R.id.forth);
        fifth = findViewById(R.id.fifth);
        sixth = findViewById(R.id.sixth);
        seventh = findViewById(R.id.seventh);
        eighth = findViewById(R.id.eighth);
        ninth = findViewById(R.id.ninth);

        field1 = findViewById(R.id.field1); field2 = findViewById(R.id.field2); field3 = findViewById(R.id.field3); field4 = findViewById(R.id.field4); field5 = findViewById(R.id.field5); field6 = findViewById(R.id.field6); field7 = findViewById(R.id.field7); field8 = findViewById(R.id.field8); field9 = findViewById(R.id.field9);
        field10 = findViewById(R.id.field10); field11 = findViewById(R.id.field11); field12 = findViewById(R.id.field12); field13 = findViewById(R.id.field13); field14 = findViewById(R.id.field14); field15 = findViewById(R.id.field15); field16 = findViewById(R.id.field16); field17 = findViewById(R.id.field17); field18 = findViewById(R.id.field18);
        field19 = findViewById(R.id.field19); field20 = findViewById(R.id.field20); field21 = findViewById(R.id.field21); field22 = findViewById(R.id.field22); field23 = findViewById(R.id.field23); field24 = findViewById(R.id.field24); field25 = findViewById(R.id.field25); field26 = findViewById(R.id.field26); field27 = findViewById(R.id.field27);
        field28 = findViewById(R.id.field28); field29 = findViewById(R.id.field29); field30 = findViewById(R.id.field30); field31 = findViewById(R.id.field31); field32 = findViewById(R.id.field32); field33 = findViewById(R.id.field33); field34 = findViewById(R.id.field34); field35 = findViewById(R.id.field35); field36 = findViewById(R.id.field36);
        field37 = findViewById(R.id.field37); field38 = findViewById(R.id.field38); field39 = findViewById(R.id.field39); field40 = findViewById(R.id.field40); field41 = findViewById(R.id.field41); field42 = findViewById(R.id.field42); field43 = findViewById(R.id.field43); field44 = findViewById(R.id.field44); field45 = findViewById(R.id.field45);
        field46 = findViewById(R.id.field46); field47 = findViewById(R.id.field47); field48 = findViewById(R.id.field48); field49 = findViewById(R.id.field49); field50 = findViewById(R.id.field50); field51 = findViewById(R.id.field51); field52 = findViewById(R.id.field52); field53 = findViewById(R.id.field53); field54 = findViewById(R.id.field54);
        field55 = findViewById(R.id.field55); field56 = findViewById(R.id.field56); field57 = findViewById(R.id.field57); field58 = findViewById(R.id.field58); field59 = findViewById(R.id.field59); field60 = findViewById(R.id.field60); field61 = findViewById(R.id.field61); field62 = findViewById(R.id.field62); field63 = findViewById(R.id.field63);
        field64 = findViewById(R.id.field64); field65 = findViewById(R.id.field65); field66 = findViewById(R.id.field66); field67 = findViewById(R.id.field67); field68 = findViewById(R.id.field68); field69 = findViewById(R.id.field69); field70 = findViewById(R.id.field70); field71 = findViewById(R.id.field71); field72 = findViewById(R.id.field72);
        field73 = findViewById(R.id.field73); field74 = findViewById(R.id.field74); field75 = findViewById(R.id.field75); field76 = findViewById(R.id.field76); field77 = findViewById(R.id.field77); field78 = findViewById(R.id.field78); field79 = findViewById(R.id.field79); field80 = findViewById(R.id.field80); field81 = findViewById(R.id.field81);

        f1 = new Field(1, 1, 1, 0, field1); f2 = new Field(1, 2, 1, 0, field2);  f3 = new Field(1, 3, 1, 0, field3); f10 = new Field(1, 4, 2, 0, field10); f11 = new Field(1, 5, 2, 0, field11); f12 = new Field(1, 6, 2, 0, field12); f19 = new Field(1, 7, 3, 0, field19); f20 = new Field(1, 8, 3, 0, field20); f21 = new Field(1, 9, 3, 0, field21);
        f4 = new Field(2, 1, 1, 0, field4); f5 = new Field(2, 2, 1, 0, field5);  f6 = new Field(2, 3, 1, 0, field6); f13 = new Field(2, 4, 2, 0, field13); f14 = new Field(2, 5, 2, 0, field14); f15 = new Field(2, 6, 2, 0, field15); f22 = new Field(2, 7, 3, 0, field22); f23 = new Field(2, 8, 3, 0, field23); f24 = new Field(2, 9, 3, 0, field24);
        f7 = new Field(3, 1, 1, 0, field7); f8 = new Field(3, 2, 1, 0, field8);  f9 = new Field(3, 3, 1, 0, field9); f16 = new Field(3, 4, 2, 0, field16); f17 = new Field(3, 5, 2, 0, field17); f18 = new Field(3, 6, 2, 0, field18); f25 = new Field(3, 7, 3, 0, field25); f26 = new Field(3, 8, 3, 0, field26); f27 = new Field(3, 9, 3, 0, field27);
        f28 = new Field(4, 1, 4, 0, field28); f29 = new Field(4, 2, 4, 0, field29);  f30 = new Field(4, 3, 4, 0, field30); f37 = new Field(4, 4, 5, 0, field37); f38 = new Field(4, 5, 5, 0, field38); f39 = new Field(4, 6, 5, 0, field39); f46 = new Field(4, 7, 6, 0, field46); f47 = new Field(4, 8, 6, 0, field47); f48 = new Field(4, 9, 6, 0, field48);
        f31 = new Field(5, 1, 4, 0, field31); f32 = new Field(5, 2, 4, 0, field32);  f33 = new Field(5, 3, 4, 0, field33); f40 = new Field(5, 4, 5, 0, field40); f41 = new Field(5, 5, 5, 0, field41); f42 = new Field(5, 6, 5, 0, field42); f49 = new Field(5, 7, 6, 0, field49); f50 = new Field(5, 8, 6, 0, field50); f51 = new Field(5, 9, 6, 0, field51);
        f34 = new Field(6, 1, 4, 0, field34); f35 = new Field(6, 2, 4, 0, field35);  f36 = new Field(6, 3, 4, 0, field36); f43 = new Field(6, 4, 5, 0, field43); f44 = new Field(6, 5, 5, 0, field44); f45 = new Field(6, 6, 5, 0, field45); f52 = new Field(6, 7, 6, 0, field52); f53 = new Field(6, 8, 6, 0, field53); f54 = new Field(6, 9, 6, 0, field54);
        f55 = new Field(7, 1, 7, 0, field55); f56 = new Field(7, 2, 7, 0, field56);  f57 = new Field(7, 3, 7, 0, field57); f64 = new Field(7, 4, 8, 0, field64); f65 = new Field(7, 5, 8, 0, field65); f66 = new Field(7, 6, 8, 0, field66); f73 = new Field(7, 7, 9, 0, field73); f74 = new Field(7, 8, 9, 0, field74); f75 = new Field(7, 9, 9, 0, field75);
        f58 = new Field(8, 1, 7, 0, field58); f59 = new Field(8, 2, 7, 0, field59);  f60 = new Field(8, 3, 7, 0, field60); f67 = new Field(8, 4, 8, 0, field67); f68 = new Field(8, 5, 8, 0, field68); f69 = new Field(8, 6, 8, 0, field69); f76 = new Field(8, 7, 9, 0, field76); f77 = new Field(8, 8, 9, 0, field77); f78 = new Field(8, 9, 9, 0, field78);
        f61 = new Field(9, 1, 7, 0, field61); f62 = new Field(9, 2, 7, 0, field62);  f63 = new Field(9, 3, 7, 0, field63); f70 = new Field(9, 4, 8, 0, field70); f71 = new Field(9, 5, 8, 0, field71); f72 = new Field(9, 6, 8, 0, field72); f79 = new Field(9, 7, 9, 0, field79); f80 = new Field(9, 8, 9, 0, field80); f81 = new Field(9, 9, 9, 0, field81);

        s1 = new Field(1, 1, 1, 0, field1); s2 = new Field(1, 2, 1, 0, field2);  s3 = new Field(1, 3, 1, 0, field3); s10 = new Field(1, 4, 2, 0, field10); s11 = new Field(1, 5, 2, 0, field11); s12 = new Field(1, 6, 2, 0, field12); s19 = new Field(1, 7, 3, 0, field19); s20 = new Field(1, 8, 3, 0, field20); s21 = new Field(1, 9, 3, 0, field21);
        s4 = new Field(2, 1, 1, 0, field4); s5 = new Field(2, 2, 1, 0, field5);  s6 = new Field(2, 3, 1, 0, field6); s13 = new Field(2, 4, 2, 0, field13); s14 = new Field(2, 5, 2, 0, field14); s15 = new Field(2, 6, 2, 0, field15); s22 = new Field(2, 7, 3, 0, field22); s23 = new Field(2, 8, 3, 0, field23); s24 = new Field(2, 9, 3, 0, field24);
        s7 = new Field(3, 1, 1, 0, field7); s8 = new Field(3, 2, 1, 0, field8);  s9 = new Field(3, 3, 1, 0, field9); s16 = new Field(3, 4, 2, 0, field16); s17 = new Field(3, 5, 2, 0, field17); s18 = new Field(3, 6, 2, 0, field18); s25 = new Field(3, 7, 3, 0, field25); s26 = new Field(3, 8, 3, 0, field26); s27 = new Field(3, 9, 3, 0, field27);
        s28 = new Field(4, 1, 4, 0, field28); s29 = new Field(4, 2, 4, 0, field29);  s30 = new Field(4, 3, 4, 0, field30); s37 = new Field(4, 4, 5, 0, field37); s38 = new Field(4, 5, 5, 0, field38); s39 = new Field(4, 6, 5, 0, field39); s46 = new Field(4, 7, 6, 0, field46); s47 = new Field(4, 8, 6, 0, field47); s48 = new Field(4, 9, 6, 0, field48);
        s31 = new Field(5, 1, 4, 0, field31); s32 = new Field(5, 2, 4, 0, field32);  s33 = new Field(5, 3, 4, 0, field33); s40 = new Field(5, 4, 5, 0, field40); s41 = new Field(5, 5, 5, 0, field41); s42 = new Field(5, 6, 5, 0, field42); s49 = new Field(5, 7, 6, 0, field49); s50 = new Field(5, 8, 6, 0, field50); s51 = new Field(5, 9, 6, 0, field51);
        s34 = new Field(6, 1, 4, 0, field34); s35 = new Field(6, 2, 4, 0, field35);  s36 = new Field(6, 3, 4, 0, field36); s43 = new Field(6, 4, 5, 0, field43); s44 = new Field(6, 5, 5, 0, field44); s45 = new Field(6, 6, 5, 0, field45); s52 = new Field(6, 7, 6, 0, field52); s53 = new Field(6, 8, 6, 0, field53); s54 = new Field(6, 9, 6, 0, field54);
        s55 = new Field(7, 1, 7, 0, field55); s56 = new Field(7, 2, 7, 0, field56);  s57 = new Field(7, 3, 7, 0, field57); s64 = new Field(7, 4, 8, 0, field64); s65 = new Field(7, 5, 8, 0, field65); s66 = new Field(7, 6, 8, 0, field66); s73 = new Field(7, 7, 9, 0, field73); s74 = new Field(7, 8, 9, 0, field74); s75 = new Field(7, 9, 9, 0, field75);
        s58 = new Field(8, 1, 7, 0, field58); s59 = new Field(8, 2, 7, 0, field59);  s60 = new Field(8, 3, 7, 0, field60); s67 = new Field(8, 4, 8, 0, field67); s68 = new Field(8, 5, 8, 0, field68); s69 = new Field(8, 6, 8, 0, field69); s76 = new Field(8, 7, 9, 0, field76); s77 = new Field(8, 8, 9, 0, field77); s78 = new Field(8, 9, 9, 0, field78);
        s61 = new Field(9, 1, 7, 0, field61); s62 = new Field(9, 2, 7, 0, field62);  s63 = new Field(9, 3, 7, 0, field63); s70 = new Field(9, 4, 8, 0, field70); s71 = new Field(9, 5, 8, 0, field71); s72 = new Field(9, 6, 8, 0, field72); s79 = new Field(9, 7, 9, 0, field79); s80 = new Field(9, 8, 9, 0, field80); s81 = new Field(9, 9, 9, 0, field81);

        filledFieldArray = new Field[]{f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19,
                f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35, f36, f37, f38, f39, f40, f41, f42, f43, f44, f45, f46, f47, f48, f49,
                f50, f51, f52, f53, f54, f55, f56, f57, f58, f59, f60, f61, f62, f63, f64, f65, f66, f67, f68, f69, f70, f71, f72, f73, f74, f75, f76, f77, f78, f79, f80, f81
        };
        startingFieldArray = new Field[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19,
                s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s31, s32, s33, s34, s35, s36, s37, s38, s39, s40, s41, s42, s43, s44, s45, s46, s47, s48, s49,
                s50, s51, s52, s53, s54, s55, s56, s57, s58, s59, s60, s61, s62, s63, s64, s65, s66, s67, s68, s69, s70, s71, s72, s73, s74, s75, s76, s77, s78, s79, s80, s81
        };

        row1 = new Field[]{f1, f2, f3, f10, f11, f12, f19, f20, f21};
        row2 = new Field[]{f4, f5, f6, f13, f14, f15, f22, f23, f24};
        row3 = new Field[]{f7, f8, f9, f16, f17, f18, f25, f26, f27};
        row4 = new Field[]{f28, f29, f30, f37, f38, f39, f46, f47, f48};
        row5 = new Field[]{f31, f32, f33, f40, f41, f42, f49, f50, f51};
        row6 = new Field[]{f34, f35, f36, f43, f44, f45, f52, f53, f54};
        row7 = new Field[]{f55, f56, f57, f64, f65, f66, f73, f74, f75};
        row8 = new Field[]{f58, f59, f60, f67, f68, f69, f76, f77, f78};
        row9 = new Field[]{f61, f62, f63, f70, f71, f72, f79, f80, f81};

        col1 = new Field[]{f1, f4, f7, f28, f31, f34, f55, f58, f61};
        col2 = new Field[]{f2, f5, f8, f29, f32, f35, f56, f59, f62};
        col3 = new Field[]{f3, f6, f9, f30, f33, f36, f57, f60, f63};
        col4 = new Field[]{f10, f13, f16, f37, f40, f43, f64, f67, f70};
        col5 = new Field[]{f11, f14, f17, f38, f41, f44, f65, f68, f71};
        col6 = new Field[]{f12, f15, f18, f39, f42, f45, f66, f69, f72};
        col7 = new Field[]{f19, f22, f25, f46, f49, f52, f73, f76, f79};
        col8 = new Field[]{f20, f23, f26, f47, f50, f53, f74, f77, f80};
        col9 = new Field[]{f21, f24, f27, f48, f51, f54, f75, f78, f81};

        sqr1 = new Field[]{f1, f2, f3, f4, f5, f6, f7, f8, f9};
        sqr2 = new Field[]{f10, f11, f12, f13, f14, f15, f16, f17, f18};
        sqr3 = new Field[]{f19, f20, f21, f22, f23, f24, f25, f26, f27};
        sqr4 = new Field[]{f28, f29, f30, f31, f32, f33, f34, f35, f36};
        sqr5 = new Field[]{f37, f38, f39, f40, f41, f42, f43, f44, f45};
        sqr6 = new Field[]{f46, f47, f48, f49, f50, f51, f52, f53, f54};
        sqr7 = new Field[]{f55, f56, f57, f58, f59, f60, f61, f62, f63};
        sqr8 = new Field[]{f64, f65, f66, f67, f68, f69, f70, f71, f72};
        sqr9 = new Field[]{f73, f74, f75, f76, f77, f78, f79, f80, f81};
        reset = findViewById(R.id.reset);
        start = findViewById(R.id.start);
    }
    public void start(View view) {
        deleteNumbers();
        preStartClassification();
        check = false;
        startCheck();
        if (check){
            Toast.makeText(this, "Identical numbers error.", Toast.LENGTH_LONG).show();
        } else {
            disableAllButtons();
            process();
            enableAllButtons();
        }
    }
    public void startCheck(){
        Field[][] n1 = new Field[][]{row1, row2, row3, row4, row5, row6, row7, row8, row9};
        Field[][] n2 = new Field[][]{col1, col2, col3, col4, col5, col6, col7, col8, col9};
        Field[][] n3 = new Field[][]{sqr1, sqr2, sqr3, sqr4, sqr5, sqr6, sqr7, sqr8, sqr9};
        out1:
        for (int e = 0; e < 9; e++) { //petlja koja kruzi kroz nizove nizova
            Field[] p = n1[e];
            for (int d = 0; d < 9; d++) { //petlja koja kruzi kroz sve brojeve jednog niza
                for (int f = d + 1; f < 9; f++) { //petlja koja kruzi kroz brojeve jednog niza s kojim se uporedjuju
                    if (p[d].num == p[f].num && p[d].num != 0 && p[f].num != 0){
                        check = true;
                        break out1;
                    }
                }
            }
        }
        if (!check) {
            out2:
            for (int e = 0; e < 9; e++) { //petlja koja kruzi kroz nizove nizova
                Field[] p = n2[e];
                for (int d = 0; d < 9; d++) { //petlja koja kruzi kroz sve brojeve jednog niza
                    for (int f = d + 1; f < 9; f++) { //petlja koja kruzi kroz brojeve jednog niza s kojim se uporedjuju
                        if (p[d].num == p[f].num && p[d].num != 0 && p[f].num != 0) {
                            check = true;
                            break out2;
                        }
                    }
                }
            }
        }
        if (!check) {
            out3:
            for (int e = 0; e < 9; e++) { //petlja koja kruzi kroz nizove nizova
                Field[] p = n3[e];
                for (int d = 0; d < 9; d++) { //petlja koja kruzi kroz sve brojeve jednog niza
                    for (int f = d + 1; f < 9; f++) { //petlja koja kruzi kroz brojeve jednog niza s kojim se uporedjuju
                        if (p[d].num == p[f].num && p[d].num != 0 && p[f].num != 0) {
                            check = true;
                            break out3;
                        }
                    }
                }
            }
        }
    }
    public void deleteNumbers() { //brise brojeve iz proslih pokretanja procesa
        for (int d = 0; d < 81; d++){
            filledFieldArray[d].num = 0;
            startingFieldArray[d].num = 0;
        }
        i = 0; //za svaki slucaj
    }
    public void process() { //proces rjesavanja
        for (i = 0; i < 81; i++){ //petlja za svako polje
            if (startingFieldArray[i].field.getText().equals("")){ //provjera da li je polje korisnik popunio
                for (int j = 1; j <= 9; j++){ //petlja za unos broja u prazno polje
                    int r = 1; //pomocne promjenljive
                    int c = 1;
                    int s = 1;
                    Field[] row = returnRow(filledFieldArray[i].row);
                    Field[] col = returnCol(filledFieldArray[i].col);
                    Field[] sqr = returnSqr(filledFieldArray[i].sqr);
                    for (int k = 0; k < 9; k++){ //petlja za provjeru da li postoji dati broj u redu
                        if (j == row[k].num) {
                            r = 0;
                            break;
                        }
                    }
                    if (r != 0) {
                        for (int k = 0; k < 9; k++) { //petlja za provjeru da li postoji dati broj u koloni
                            if (j == col[k].num) {
                                c = 0;
                                break;
                            }
                        }
                    }
                    if (r != 0 && c != 0) {
                        for (int k = 0; k < 9; k++) { //petlja za provjeru da li postoji dati broj u kvadratu
                            if (j == sqr[k].num) {
                                s = 0;
                                break;
                            }
                        }
                    }
                    if (r == 1 && c == 1 && s == 1){
                        filledFieldArray[i].field.setText(String.valueOf(j));
                        filledFieldArray[i].num = j;
                        break;
                    } else {
                        if (j == 9 && i == 0){
                            Toast.makeText(this, "Invalid input, try again.", Toast.LENGTH_LONG).show();
                            calculatedFieldsClear();
                            i = 81;
                        } else if (j == 9) { //znaci da nijedan broj ne ide u polje i citav proces mora da se ponovi
                            while(filledFieldArray[i-1].num == 9 || startingFieldArray[i-1].num != 0){
                                if (i == 1){
                                    Toast.makeText(this, "Invalid input, try again.", Toast.LENGTH_LONG).show();
                                    calculatedFieldsClear();
                                    i = 81;
                                    break;
                                }
                                if (startingFieldArray[i-1].num == 0){
                                    filledFieldArray[i-1].num = 0;
                                    filledFieldArray[i-1].field.setText("");
                                }
                                i -= 1;
                            }
                            if (i == 81){
                                break;
                            }
                            j = filledFieldArray[i-1].num;
                            filledFieldArray[i-1].num = 0;
                            filledFieldArray[i-1].field.setText("");
                            i -= 1;

                        }
                    }
                }
            }
        }
    }
    public Field[] returnRow(int d){  //funkcija koja vraca red u kojem se nalazi dato polje o kojem se razmatra upis broja
        Field[][] j = new Field[][]{row1, row2, row3, row4, row5, row6, row7, row8, row9};
        return j[d-1];
    }
    public Field[] returnCol(int d){  //funkcija koja vraca kolonu u kojoj se nalazi dato polje o kojem se razmatra upis broja
        Field[][] j = new Field[][]{col1, col2, col3, col4, col5, col6, col7, col8, col9};
        return j[d-1];
    }
    public Field[] returnSqr(int d){  //funkcija koja vraca kvadrat u kojem se nalazi dato polje o kojem se razmatra upis broja
        Field[][] j = new Field[][]{sqr1, sqr2, sqr3, sqr4, sqr5, sqr6, sqr7, sqr8, sqr9};
        return j[d-1];
    }
    public void preStartClassification(){ //funkcija koja kupi vrijednosti koje korisnik unese kao pocetne
        for (int d = 0; d < 81; d++){
            if (!filledFieldArray[d].field.getText().equals("")){
                filledFieldArray[d].num = Integer.parseInt(filledFieldArray[d].field.getText().toString().trim());
                startingFieldArray[d].num = Integer.parseInt(filledFieldArray[d].field.getText().toString().trim());
            }
        }
    }
    public void fields(View view){ //provjerava koja bool vrijednost je ukljucena i onda njenu brojnu vrijednost doda u polje
       if (num0){
            int id = view.getId();
            Button button = findViewById(id);
            button.setText("");
       } else if (num1){
           int id = view.getId();
           Button button = findViewById(id);
           button.setText("1");
       } else if (num2){
           int id = view.getId();
           Button button = findViewById(id);
           button.setText("2");
       } else if (num3){
           int id = view.getId();
           Button button = findViewById(id);
           button.setText("3");
       } else if (num4){
           int id = view.getId();
           Button button = findViewById(id);
           button.setText("4");
       } else if (num5){
           int id = view.getId();
           Button button = findViewById(id);
           button.setText("5");
       } else if (num6){
           int id = view.getId();
           Button button = findViewById(id);
           button.setText("6");
       } else if (num7){
           int id = view.getId();
           Button button = findViewById(id);
           button.setText("7");
       } else if (num8){
           int id = view.getId();
           Button button = findViewById(id);
           button.setText("8");
       } else if (num9){
           int id = view.getId();
           Button button = findViewById(id);
           button.setText("9");
       }
    }
    public void numbers(View view){ //funkcija koju pozivaju brojevi
        allNumbersUnpressed(); //iskljuce se sve bool vrijednosti da se ne iskljucuje posebno onaj koji je upaljen
        searchWhatToPress(view); //provjeri se i ukljuci se bool vrijednost onoga koji je pritisnut
    }
    public void searchWhatToPress(View view){ //funkcija koja pretrazuje koje dugme brojeva je dodirnuto i njegov bool postavlja na true
        if (view.getId() == R.id.none){
            num0 = true;
            none.setSelected(true);
        } else if (view.getId() == R.id.first){
            num1 = true;
            first.setSelected(true);
        } else if (view.getId() == R.id.second){
            num2 = true;
            second.setSelected(true);
        } else if (view.getId() == R.id.third){
            num3 = true;
            third.setSelected(true);
        } else if (view.getId() == R.id.forth){
            num4 = true;
            forth.setSelected(true);
        } else if (view.getId() == R.id.fifth){
            num5 = true;
            fifth.setSelected(true);
        } else if (view.getId() == R.id.sixth){
            num6 = true;
            sixth.setSelected(true);
        } else if (view.getId() == R.id.seventh){
            num7 = true;
            seventh.setSelected(true);
        } else if (view.getId() == R.id.eighth){
            num8 = true;
            eighth.setSelected(true);
        } else if (view.getId() == R.id.ninth){
            num9 = true;
            ninth.setSelected(true);
        }
    }
    public void resetAll(View view){ //iskljucuje sve dugmice, sve bool vrijednosti postavlja na false, brise sve vrijednosti iz polja
        allFieldsClear();
        allNumbersUnpressed();
    }
    public void allNumbersUnpressed(){ //sve bool vrijednost postavlja na false
        num0 = false;
        num1 = false;
        num2 = false;
        num3 = false;
        num4 = false;
        num5 = false;
        num6 = false;
        num7 = false;
        num8 = false;
        num9 = false;
        none.setSelected(false);
        first.setSelected(false);
        second.setSelected(false);
        third.setSelected(false);
        forth.setSelected(false);
        fifth.setSelected(false);
        sixth.setSelected(false);
        seventh.setSelected(false);
        eighth.setSelected(false);
        ninth.setSelected(false);
    }
    public void calculatedFieldsClear(){ //cisti vrijednosti koje je izracunao i upisao
        for (int d = 0; d < 81; d++){
            if (startingFieldArray[d].num == 0){
                filledFieldArray[d].field.setText("");
                filledFieldArray[d].num = 0;
            }
        }
    }
    public void allFieldsClear(){ //cisti vrijednosti svih polja
        for (int d = 0; d < 81; d++){
            filledFieldArray[d].field.setText("");
        }
    }
    public void disableAllButtons(){
        none.setEnabled(false);
        first.setEnabled(false);
        second.setEnabled(false);
        third.setEnabled(false);
        forth.setEnabled(false);
        fifth.setEnabled(false);
        sixth.setEnabled(false);
        seventh.setEnabled(false);
        eighth.setEnabled(false);
        ninth.setEnabled(false);
        reset.setEnabled(false);
        start.setEnabled(false);
    }
    public void enableAllButtons(){
        none.setEnabled(true);
        first.setEnabled(true);
        second.setEnabled(true);
        third.setEnabled(true);
        forth.setEnabled(true);
        fifth.setEnabled(true);
        sixth.setEnabled(true);
        seventh.setEnabled(true);
        eighth.setEnabled(true);
        ninth.setEnabled(true);
        reset.setEnabled(true);
        start.setEnabled(true);
    }
}