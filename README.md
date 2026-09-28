# Лаборатори 04: JUnit 5 ашиглан нэгжийн тест бичих

**Нэр:** Дэлгэр Хоролмаа
**Оюутны код:** B222270835


## Орчин

`java -version`:

    java version "24.0.2" 2025-07-15
    Java(TM) SE Runtime Environment (build 24.0.2+12-54)
    Java HotSpot(TM) 64-Bit Server VM (build 24.0.2+12-54, mixed mode, sharing)

`mvn -version`:

    Apache Maven 3.9.16 (2bdd9fddda4b155ebf8000e807eb73fd829a51d5)
    Maven home: C:\tools\apache-maven-3.9.16
    Java version: 24.0.2, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-24
    OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

Төсөл `maven.compiler.release` = 17 тохиргоотойгоор compile хийгддэг.

## Тестийн үр дүн

- Ажилласан тестийн тоо: **22** (`Tests run: 22, Failures: 0, Errors: 0, Skipped: 0`)
- Бүтэн үр дүн: `results/mvn-test.txt` (BUILD SUCCESS)

## Мутацийн туршилт

`letterGrade` метод дотор `score >= 90` нөхцөлийг `score > 90` болгон өөрчилсөн.
Үр дүн: `Tests run: 22, Failures: 2`, BUILD FAILURE.

- `GradeCalculatorTest.ninetyIsExactlyA`: `expected: <A> but was: <B>`
- `GradeCalculatorTest.letterGradeBoundaries[2]` (`90,A` мөр): `expected: <A> but was: <B>`

Бүтэн үр дүн: `results/mvn-test-mutant.txt`. Дараа нь `>= 90` болгон буцааж засаад 22 тест бүгд амжилттай өнгөрсөн.

## Хамгийн сонирхолтой тест ба алдааны тухай

Хамгийн сонирхолтой нь мутацийн туршилт байлаа. `letterGrade` дотор `score >= 90`-ийг `score > 90` болгож өөрчлөхөд 22 тестийн 2 нь унасан: `ninetyIsExactlyA` болон `letterGradeBoundaries`-ийн `90,A` мөр. Харин 95, 80, 70 гэх мэт хязгаараас хол оноотой тестүүд энэ алдааг илрүүлж чадаагүй, учир нь тэдгээрт `>=` ба `>` ижил үр дүн өгдөг. Үүнээс би яг хязгаарын утга (90) дээр тест бичихгүй бол нэг тэмдгийн алдааг олохгүй гэдгийг ойлгосон. Мөн 89.99, 59.99 гэсэн утгууд хязгаарын нөгөө талыг хамгаалдаг. Зөв хариуг (oracle) кодоос өмнө тодорхойлж тест бичих нь чухал гэдгийг энэ лабораторид сурлаа.