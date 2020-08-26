/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2016-2020 Gerrit Grunwald.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.hansolo.tilesfx.icons;

import javafx.scene.image.Image;

import java.util.Arrays;


public enum Flag {
    MAURITIUS("MU", "MUS", "001-mauritius.png"),
    CYPRUS("CY", "CYP", "002-cyprus.png"),
    AUSTRIA("AT", "AUT", "003-austria.png"),
    OMAN("OM", "OMN", "004-oman.png"),
    ETHIOPIA("ET", "ETH", "005-ethiopia.png"),
    TANZANIA("TZ", "TZA", "006-tanzania.png"),
    NICARAGUA("NI", "NIC", "007-nicaragua.png"),
    ESTONIA("EE", "EST", "008-estonia.png"),
    UGANDA("UG", "UGA", "009-uganda.png"),
    SLOVENIA("SI", "SVN", "010-slovenia.png"),
    ZIMBABWE("ZW", "ZWE", "011-zimbabwe.png"),
    SAO_TOME_AND_PRINCE("ST", "STP", "012-sao-tome-and-prince.png"),
    ITALY("IT", "ITA", "013-italy.png"),
    WALES("", "", "014-wales.png"),
    EL_SALVADOR("SV", "SLV", "015-el-salvador.png"),
    NEPAL("NP", "NPL", "016-nepal.png"),
    CHRISTMAS_ISLAND("CX", "CXR", "017-christmas-island.png"),
    LEBANON("LB", "LBN", "018-lebanon.png"),
    CEUTA("", "", "019-ceuta.png"),
    IRAQ("IQ", "IRQ", "020-iraq.png"),
    COOK_ISLANDS("CK", "COK", "021-cook-islands.png"),
    SYRIA("SY", "SYR", "022-syria.png"),
    COCOS_ISLAND("CC", "CCK", "023-cocos-island.png"),
    HONDURAS("HN", "HND", "024-honduras.png"),
    ANGUILLA("AI", "AIA", "025-anguilla.png"),
    AMERICAN_SAMOA("AS", "ASM", "027-american-samoa.png"),
    PUERTO_RICO("PR", "PRI", "028-puerto-rico.png"),
    COMOROS("KM", "COM", "029-comoros.png"),
    NORTH_KOREA("KP", "PRK", "030-north-korea.png"),
    CORSICA("", "", "031-corsica.png"),
    ZAMBIA("ZM", "ZMB", "032-zambia.png"),
    SAINT_KITTS_AND_NEVIS("KN", "KNA", "033-saint-kitts-and-nevis.png"),
    CHINA("CN", "CHN", "034-china.png"),
    LUXEMBOURG("LU", "LUX", "035-luxembourg.png"),
    CENTRAL_AFRICAN_REPUBLIC("CF", "CAF", "036-central-african-republic.png"),
    JAMAICA("JM", "JAM", "037-jamaica.png"),
    CAPE_VERDE("CV", "CPV", "038-cape-verde.png"),
    MONACO("MC", "MCO", "039-monaco.png"),
    BHUTAN("BT", "BTN", "040-bhutan.png"),
    PARAGUAY("PY", "PRY", "041-paraguay.png"),
    ARUBA("AW", "ABW", "042-aruba.png"),
    MONTSERRAT("MS", "MSR", "043-montserrat.png"),
    LATVIA("LV", "LVA", "044-latvia.png"),
    ANDORRA("AD", "AND", "045-andorra.png"),
    MICRONESIA("FM", "FSM", "046-micronesia.png"),
    DOMINICAN_REPUBLIC("DO", "DOM", "047-dominican-republic.png"),
    ABKHAZIA("", "", "048-abkhazia.png"),
    TUNISIA("TN", "TUN", "049-tunisia.png"),
    MAURITANIA("MR", "MRT", "050-mauritania.png"),
    CAYMAN_ISLANDS("KY", "CYM", "051-cayman-islands.png"),
    KOSOVO("XK", "XKX", "052-kosovo.png"),
    GHANA("GH", "GHA", "053-ghana.png"),
    CANARY_ISLANDS("", "", "054-canary-islands.png"),
    SCOTLAND("", "", "055-scotland.png"),
    GUINEA_BISSAU("GW", "GNB", "056-guinea-bissau.png"),
    BURUNDI("BI", "BDI", "057-burundi.png"),
    MYANMAR("MM", "MMR", "058-myanmar.png"),
    GABON("GA", "GAB", "059-gabon-ong"),
    BENIN("BJ", "BEN", "060-benin.png"),
    SABA_ISLAND("", "", "061-saba-island.png"),
    NAMIBIA("NA", "NAM", "062-namibia.png"),
    JAPAN("JP", "JPN", "063-japan.png"),
    LITHUANIA("LT", "LTU", "064-lithuania.png"),
    ERITREA("ER", "ERI", "065-eritrea.png"),
    CHAD("TD", "TCD", "066-chad.png"),
    KENYA("KE", "KEN", "067-kenya.png"),
    DJIBOUTI("DJ", "DJI", "068-djibouti.png"),
    BRITISH_INDIAN_OCEAN_TERRITORY("IO", "IOT", "069-british-indian-ocean-territory.png"),
    TUVALU_1("TV", "TUV", "070-tuvalu-1.png"),
    SERBIA("RS", "SRB", "071-serbia-png"),
    BONAIRE("BQ", "BES", "072-bonaire.png"),
    TOGO("TG", "TGO", "073-togo.png"),
    KAZAKHSTAN("KZ", "KAZ", "074-kazakhstan.png"),
    ANTIGUA_AND_BARBUDA("AG", "ATG", "075-antigua-and-barbuda.png"),
    SURINAME("SR", "SUR", "076-suriname.png"),
    JORDAN("JO", "JOR", "077-jordan.png"),
    BELIZE("BZ", "BLZ", "078-belize.png"),
    ST_BARTS("", "", "079-st-barts.png"),
    ICELAND("IS", "ISL", "080-iceland.png"),
    BERMUDA("BM", "BMU", "081-bermuda.png"),
    UNITED_NATIONS("", "", "082-united-nations.png"),
    SOMALIA("SO", "SOM", "083-somalia.png"),
    BARBABDOS("BB", "BRB", "084-barbados.png"),
    SOLOMON_ISLANDS("SB", "SLB", "085-solomon-islands.png"),
    NIGERIA("NG", "NGA", "086-nigeria.png"),
    ALAND_ISLANDS("", "", "087-aland-islands.png"),
    URUGUAY("UY", "URY", "088-uruguay.png"),
    SINT_MAARTEN("SX", "SXM", "089-sint-maarten.png"),
    BURKINA_FASO("BF", "BFA", "090-burkina-faso.png"),
    SLOVAKIA("SK", "SVK", "091-slovakia.png"),
    SIERRA_LEONE("SL", "SLE", "092-sierra-leone.png"),
    BASQUE_COUNTRY("", "", "093-basque-country.png"),
    SOUTH_KOREA("KR", "KOR", "094-south-korea.png"),
    PITCAIRN_ISLANDS("PN", "PCN", "095-pitcairn-islands.png"),
    MOZAMBIQUE("MZ", "MOZ", "096-mozambique.png"),
    SAN_MARINO("SM", "SMR", "097-san-marino.png"),
    GUATEMALA("GT", "GTM", "098-guatemala.png"),
    ALBANIA("AL", "ALB", "099-albania.png"),
    PAKISTAN("PK", "PAK", "100-pakistan.png"),
    NORTHERN_CYPRUS("", "", "101-northern-cyprus.png"),
    BALEARIC_ISLANDS("", "", "102-balearic-islands.png"),
    MARSHALL_ISLAND("MH", "MHL", "103-marshall_island.png"),
    ECUADOR("EC", "ECU", "104-ecuador.png"),
    CAMEROON("CM", "CMR", "105-cameroon.png"),
    PANAMA("PA", "PAN", "106-panama.png"),
    KUWAIT("KW", "KWT", "107-kwait.png"),
    ARMENIA("AM", "ARM", "108-armenia.png"),
    ROMANIA("RO", "ROU", "109-romania.png"),
    GUINEA("GN", "GIN", "110-guinea.png"),
    AFGHANISTAN("AF", "AFG", "111-afghanistan.png"),
    LAOS("", "", "112-laos.png"),
    GREENLAND("GL", "GRL", "113-greenland.png"),
    BRITISH_VIRGIN_ISLANDS("VG", "VGB", "114-british-virgin-islands.png"),
    HUNGARY("HU", "HUN", "115-hungary.png"),
    CURACAO("CW", "CUW", "116-curacao.png"),
    ANGOLA("AO", "AGO", "117-angola.png"),
    MALAYSIA("MY", "MYS", "118-malaysia.png"),
    BRUNEI("BN", "BRN", "119-brunei.png"),
    BAHAMAS("BS", "BHS", "120-bahamas.png"),
    NEW_ZEALAND("NZ", "NZL", "121-new-zealand.png"),
    FAROE_ISLANDS("FO", "FRO", "122-faroe-islands.png"),
    BRITISH_COLUMBIA("", "", "123-british-columbia.png"),
    VATICAN_CITY("", "", "124-vatican-city.png"),
    FINLAND("FI", "FIN", "125-finland.png"),
    BOTSWANA("BW", "BWA", "126-botswana.png"),
    SRI_LANKA("LK", "LKA", "127-sri-lanka.png"),
    SPAIN("ES", "ESP", "128-spain.png"),
    OSSETIA("", "", "129-ossetia.png"),
    SICILY("", "", "130-sicily.png"),
    CHILE("CL", "CHL", "131-chile.png"),
    BOSNIA_AND_HERZEGOVINA("BA", "BIH", "132-bosina-and-herzegovina.png"),
    SAUDI_ARABIA("SA", "SAU", "133-saudi-arabia.png"),
    LIECHTENSTEIN("LI", "LIE", "134-liechtenstein.png"),
    BELARUS("BY", "BLR", "135-belarus.png"),
    IRAN("IR", "IRN", "136-iran.png"),
    FIJI("FJ", "FJI", "137-fiji.png"),
    BAHRAIN("BH", "BHR", "138-bahrain.png"),
    VENEZUELA("VE", "VEN", "139-venezuela.png"),
    EAST_TIMOR("", "", "140-east-timor.png"),
    AZERBAIJAN("AZ", "AZE", "141-azerbaijan.png"),
    TIBET("", "", "142-tibet.png"),
    NORWAY("NO", "NOR", "143-norway.png"),
    ALGERIA("DZ", "DZA", "144-algeria.png"),
    UKRAINE("UA", "UKR", "145-ukraine.png"),
    GAMBIA("GM", "GMB", "146-gambia.png"),
    BANGLADESH("BD", "BGD", "147-bangladesh.png"),
    MADEIRA("", "", "148-madeira.png"),
    CZECH_REPBULIC("CZ", "CZE", "149-czech-repbublic.png"),
    BOLIVIA("BO", "BOL", "150-bolivia.png"),
    UNITED_ARAB_EMIRATES("AE", "ARE", "151-united-arab-emirates.png"),
    KYRGYZSTAN("KG", "KGZ", "152-kyrgyzstan.png"),
    CUBA("CU", "CUB", "153-cuba.png"),
    SWAZILAND("", "", "154-swaziland.png"),
    ISRAEL("IL", "ISR", "155-israel.png"),
    COSTA_RICA("CR", "CRI", "156-costa-rica.png"),
    REPUBLIC_OF_THE_CONGO("CG", "COG", "157-republic-of-the-congo.png"),
    EGYPT("EG", "EGY", "158-egypt.png"),
    CAMBODIA("KH", "KHM", "159-cambodia.png"),
    NORTHERN_MARIANAS_ISLAND("MP", "MNP", "160-northern-marianas-island.png"),
    IVORY_COAST("", "", "161-ivory-coast.png"),
    GERMANY("DE", "DEU", "162-germany.png"),
    PAPUA_NEW_GUINEA("PG", "PNG", "163-papua-new-guinea.png"),
    CROATIA("HR", "HRV", "164-croatia.png"),
    BELGIUM("BE", "BEL", "165-belgium.png"),
    MOROCCO("MA", "MAR", "166-morocco.png"),
    MACAO("MO", "MAC", "167-macao.png"),
    BULGARIA("BG", "BGR", "168-bulgaria.png"),
    LIBERIA("LR", "LBR", "169-liberia.png"),
    GREECE("GR", "GRC", "170-greece.png"),
    GALAPAGOS_ISLANDS("", "", "171-galapagos-islands.png"),
    ST_LUCIA("LC", "LCA", "172-st-lucia.png"),
    MALI("ML", "MLI", "173-mali.png"),
    DENMARK("DK", "DNK", "174-denmark.png"),
    RAPA_NUI("", "", "175-rapa-nui.png"),
    LESOTHO("LS", "LSO", "176-lesotho.png"),
    COLOMBIA("CO", "COL", "177-colombia.png"),
    PALAU("PW", "PLW", "178-palau.png"),
    IRELAND("IE", "IRL", "179-ireland.png"),
    FRENCH_POLYNESIA("PF", "PYF", "180-french-polynesia.png"),
    TRINIDAD_AND_TOBAGO("TT", "TTO", "181-trinidad-and-tobago.png"),
    NIUE("NU", "NIU", "182-niue.png"),
    HONG_KONG("HK", "HKG", "183-hong-kong.png"),
    SWEDEN("SE", "SWE", "184-sweden.png"),
    HAITI("HT", "HTI", "185-haiti.png"),
    DOMINICA("DM", "DMA", "186-dominica.png"),
    VANUATU("VU", "VUT", "187-vanuatu.png"),
    PERU("PE", "PER", "188-peru.png"),
    EQUATORIAL_GUINEA("GQ", "GNQ", "189-equatorial-guinea.png"),
    UZBEKISTAN("UZ", "UZB", "190-uzbekistn.png"),
    TONGA("TO", "TON", "191-tonga.png"),
    PHILIPPINES("PH", "PHL", "192-philippines.png"),
    NORFOLK_ISLANDS("NF", "NFK", "193-norfolk-islands.png"),
    MALTA("MT", "MLT", "194-malta.png"),
    FRANCE("FR", "FRA", "195-france.png"),
    TAJIKISTAN("TJ", "TJK", "196-tajikistan.png"),
    MELILLA("", "", "197-melilla.png"),
    ARGENTINA("AR", "ARG", "198-argentina.png"),
    SUDAN("SD", "SDN", "199-sudan.png"),
    SOUTH_AFRICA("ZA", "ZAF", "200-south-africa.png"),
    MARTINIQUE("MQ", "MTQ", "201-martinique.png"),
    TAWAIN("TW", "TWN", "202-tawain.png"),
    SAHRAWI_ARAB_DEMOCRATIC_REPUBLIC("", "", "203-sahrawi-arab-democratic-republic.png"),
    GUERNSEY("GG", "GGY", "204-guernsey.png"),
    SWITZERLAND("CH", "CHE", "205-switzerland.png"),
    RWANDA("RW", "RWA", "206-rwanda.png"),
    GUAM("GU", "GUM", "207-guam.png"),
    PALESTINE("PS", "PSE", "208-palestine.png"),
    INDONESIA("ID", "IDN", "209-indonesia.png"),
    GRENADA("GD", "GRD", "210-grenada.png"),
    POLAND("PL", "POL", "211-poland.png"),
    MOLDOVA("MD", "MDA", "212-moldova.png"),
    GIBRALTAR("GI", "GIB", "213-gibraltar.png"),
    MALAWI("MW", "MWI", "214-malawi.png"),
    FALKLAND_ISLANDS("FK", "FLK", "215-falkland-islands.png"),
    ENGLAND("", "", "216-england.png"),
    VIRGIN_ISLANDS("VI", "VIR", "217-virgin-islands.png"),
    TURKEY("TR", "TUR", "218-turkey.png"),
    ISLE_OF_MAN("IM", "IMN", "219-isle-of-man.png"),
    VIETNAM("VN", "VNM", "220-vietnam.png"),
    TUVALU("TV", "TUV", "221-tuvalu.png"),
    NIGER("NE", "NER", "222-niger.png"),
    TURKS_AND_CAICOS("TC", "TCA", "223-turks-and-caicos.png"),
    PORTUGAL("PT", "PRT", "224-portugal.png"),
    MALDIVES("MV", "MDV", "225-maldives.png"),
    SENEGAL("SN", "SEN", "227-senegal.png"),
    NAURU("NR", "NRU", "228-nauru.png"),
    TURKMENISTAN("TM", "TKM", "229-turkmenistan.png"),
    SINGAPORE("SG", "SGP", "230-singapore.png"),
    LIBYA("LY", "LBY", "231-libya.png"),
    YEMEN("YE", "YEM", "232-yemen.png"),
    TRANSNISTRIA("", "", "233-transnistria.png"),
    AUSTRALIA("AU", "AUS", "234-australia.png"),
    TOKELAU("TK", "TKL", "235-tokelau.png"),
    REPUBLIC_OF_MACEDONIA("MK", "MKD", "236-republic-of-macedonia.png"),
    NETHERLANDS("NL", "NLD", "237-netherlands.png"),
    THAILAND("TH", "THA", "238-thailand.png"),
    MONTENEGRO("ME", "MNE", "239-montenegro.png"),
    AZORES_ISLANDS("", "", "240-azores-islands.png"),
    ST_VINCENT_AND_THE_GRENADINES("VC", "VCT", "241-st-vincent-and-the-grenadines.png"),
    MADAGASCAR("MG", "MDG", "242-madagascar.png"),
    CANADA("CA", "CAN", "243-canada.png"),
    SOUTH_SUDAN("SS", "SSD", "244-south-sudan.png"),
    JERSEY("JE", "JEY", "245-jersey.png"),
    INDIA("IN", "IND", "246-india.png"),
    SOMALILAND("", "", "247-somaliland.png"),
    RUSSIA("RU", "RUS", "248-russia.png"),
    DEMOCRATIC_REPUBLIC_OF_CONGO("CD", "COD", "249-democratic-republic-of-congo.png"),
    SINT_EUSTATIUS("", "", "250-sint-eustatius.png"),
    SAMOA("WS", "WSM", "251-samoa.png"),
    MEXICO("MX", "MEX", "252-mexico.png"),
    SEYCHELLES("SC", "SYC", "253-seychelles.png"),
    NATO("", "", "254-nato.png"),
    BRAZIL("BR", "BRA", "255-brazil.png"),
    GEORGIA("GE", "GEO", "256-georgia.png"),
    SARDINIA("", "", "257-sardinia.png"),
    MONGOLIA("MN", "MNG", "258-mongolia.png"),
    EUROPEAN_UNION("", "", "259-european-union.png"),
    UNITED_KINGDOM("GB", "GBR", "260-united-kingdom.png"),
    KIRIBATI("KI", "KIR", "261-kiribati.png"),
    HAWAII("", "", "262-hawaii.png"),
    UNITED_STATES_OF_AMERICA("US", "USA", "263-united-states-of-america.png");


    private final String imageFileName;
    private final String iso2;
    private final String iso3;

    Flag(final String iso2, final String iso3, final String imageFileName) {
        this.iso2          = iso2;
        this.iso3          = iso3;
        this.imageFileName = imageFileName;
    }


    public final String getImageFileName() { return imageFileName; }

    public final Image getImage() {
        return getImage(30);
    }
    public final Image getImage(final double size) {
        return new Image(Flag.class.getResourceAsStream(imageFileName), size, size, true, false);
    }

    public final String getIso2() { return iso2; }

    public final String getIso3() { return iso3; }

    public static final Flag iso2(final String iso2) {
        return Arrays.asList(values()).stream().filter(flag -> flag.iso2.equals(iso2)).findFirst().orElse(null);
    }

    public static final Flag iso3(final String iso3) {
        return Arrays.asList(values()).stream().filter(flag -> flag.iso3.equals(iso3)).findFirst().orElse(null);
    }
}