package com.dave.the.diver.constant;

import com.dave.the.diver.entity.Party;
import com.dave.the.diver.entity.Region;
import com.dave.the.diver.entity.Time;
import com.dave.the.diver.entity.Unlock;
import lombok.Getter;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Data {

    @Getter
    public static class FishInfo {
        private String fishId;
        private String name;
        private String region;
        private String time;

        public FishInfo(
            String json
        ) throws JSONException {
            JSONObject jsonObject = new JSONObject(json);

            if (jsonObject.has("id")) {
                this.fishId = (String) jsonObject.get("id");
            }

            if (jsonObject.has("name")) {
                this.name = (String) jsonObject.get("name");
            }

            if (jsonObject.has("region")) {
                this.region = (String) jsonObject.get("region");
            }

            if (jsonObject.has("time")) {
                this.time = (String) jsonObject.get("time");
            }
        }
    }

    @Getter
    public static class Fish {
        List<FishInfo> fishInfoList;

        public Fish() throws JSONException {
            this.fishInfoList = new ArrayList<>();

            fishInfoList.add(new FishInfo("{\"id\":\"Clownfish\",\"name\":\"흰동가리\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Comber\",\"name\":\"콤버\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Cardinal_Fish\",\"name\":\"지중해카디널피쉬\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Sea_Goldie\",\"name\":\"금강바리\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Pyramid_Butterflyfish\",\"name\":\"안개나비고기\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Yellow_Tang\",\"name\":\"옐로우탱\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Salema_Porgy\",\"name\":\"사르파살파\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Orbicular_Batfish\",\"name\":\"원반제비활치\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Blue_Tang\",\"name\":\"블루탱\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Rainbow_Wrasse\",\"name\":\"무지개놀래기\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Lagoon_Triggerfish\",\"name\":\"배주름쥐치\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Small_Spotted_Dart\",\"name\":\"빨판매가리\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Yellowback_Fusilier\",\"name\":\"황등어\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Ornate_Wrasse\",\"name\":\"오네이트놀래기\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Longfin_Batfish\",\"name\":\"깃털제비활치\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Mediterranean_Parrotfish\",\"name\":\"지중해비늘돔\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Redtooth_Triggerfish\",\"name\":\"붉은이빨쥐치\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Black_And_White_Snapper\",\"name\":\"블랙스내퍼\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Green_Humphead_Parrotfish\",\"name\":\"버팔로피쉬\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Barrel_Jellyfish\",\"name\":\"배럴해파리\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Fried_Egg_Jellyfish\",\"name\":\"달걀프라이해파리\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Whitetip_Reefshark\",\"name\":\"백기흉상어\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Starry_Puffer\",\"name\":\"꺼끌복\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Red_Lionfish\",\"name\":\"쏠배감펭\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Titan_Triggerfish\",\"name\":\"타이탄트리거피쉬\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Bluefin_Tuna\",\"name\":\"참다랑어\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Yellowfin_Tuna\",\"name\":\"황다랑어\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Flame_Angelfish\",\"name\":\"라마엔젤피쉬\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Sheepshead\",\"name\":\"혹돔\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Emperor_Angelfish\",\"name\":\"황제엔젤피쉬\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Stingray\",\"name\":\"노랑가오리\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Marbled_Electric_Ray\",\"name\":\"마블전기가오리\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Whiteleg_Shrimp\",\"name\":\"흰다리새우\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Striped_Catfish\",\"name\":\"쏠종개\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Purple_Sea_Urchin\",\"name\":\"보라성게\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Shortfin_Mako\",\"name\":\"청상아리\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Marlin\",\"name\":\"청새치\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Thresher_Shark\",\"name\":\"환도상어\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"American_Lobster\",\"name\":\"미국바닷가재\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"European_Lobster\",\"name\":\"유렵바닷가재\",\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Bluehead_Tilefish\",\"name\":\"블루헤드타일피쉬\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Clown_Frogfish\",\"name\":\"무당씬벵이\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Painted_Comber\",\"name\":\"페인티드콤버\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Bigeye_Scad\",\"name\":\"새가라지\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Striped_Red_Mullet\",\"name\":\"노랑촉수\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Mackerel_Scad\",\"name\":\"풀가라지\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Harleqiun_Hind\",\"name\":\"청줄바리\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Bigeye_Trevally\",\"name\":\"줄전갱이\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Coral_Trout\",\"name\":\"무늬바리\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Grey_Triggerfish\",\"name\":\"갈쥐치\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Atlantic_Bonito\",\"name\":\"대서양보니토\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"White_Trevally\",\"name\":\"흑점줄전갱이\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Cuttlefish\",\"name\":\"갑오징어\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Dusky_Grouper\",\"name\":\"머구리농어\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Atlantic_Mackerel\",\"name\":\"대서양고등어\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Giant_Trevally\",\"name\":\"무명갈전갱이\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"White_Spotted_Jellyfish\",\"name\":\"흰점박이해파리\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Tiger_Shark\",\"name\":\"뱀상어\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Great_Barracuda\",\"name\":\"큰꼬치고기\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Narrow_Barred_Spanish_Mackerel\",\"name\":\"동갈삼치\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Longnose_Sawshark\",\"name\":\"톱상어\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Atlantic_Anglerfish\",\"name\":\"대서양아귀\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Sally_Lightfoot_Crab\",\"name\":\"갈라파고스붉은게\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Black_Tiger_Shrimp\",\"name\":\"블랙타이거새우\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Smooth_Hammerhead\",\"name\":\"귀상어\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Sailfish\",\"name\":\"돛새치\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"California_Spiny_Lobster\",\"name\":\"캘리포니아닭새우\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Tropical_Rock_Lobster\",\"name\":\"비단닭새우\",\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Chambered_Nautilus\",\"name\":\"앵무조개\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Fangtooth\",\"name\":\"귀신고기\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Frilled_Shark\",\"name\":\"주름상어\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Bluespotted_Stargazer\",\"name\":\"푸렁통구멍\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Rhinochimaeridae\",\"name\":\"코은상어\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Spider_Crab\",\"name\":\"키다리게\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Megamouth_Shark\",\"name\":\"메가마우스상어\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Cookiecutter_Shark\",\"name\":\"쿠키커터상어\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Clione\",\"name\":\"클리오네\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Sea_Toad\",\"name\":\"점씬벵이\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Salmon_Snailfish\",\"name\":\"분홍꼼치\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Pacific_Fanfish\",\"name\":\"벤텐어\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Threethooth_Puffer\",\"name\":\"불뚝복\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Comb_Jelly\",\"name\":\"감투빗해파리\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Blood_Belly_Comb_Jellyfish\",\"name\":\"붉은배빗해파리\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Red_Bream\",\"name\":\"금눈돔\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Norway_Lobster\",\"name\":\"네점발빨간새우\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Eastern_Rock_Lobster\",\"name\":\"동부바위바닷가재\",\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Clearfin_Lionfish\",\"name\":\"방사쏠배감펭\",\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Longspine_Squirrelfish\",\"name\":\"롱스파인 다람쥐고기\",\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Longspine_Porcupinefish\",\"name\":\"가시복\",\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Box_Jellyfish\",\"name\":\"상자해파리\",\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Moray_Eel\",\"name\":\"곰치\",\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Blacktip_Reefshark\",\"name\":\"흑기흉상어\",\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Copper_Shark\",\"name\":\"무태상어\",\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Zebra_Shark\",\"name\":\"지브라상어\",\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"White_Shrimp\",\"name\":\"흰보리새우\",\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Red_Banded_Lobster\",\"name\":\"가시발새우\",\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Blue_Lobster\",\"name\":\"블루랍스터\",\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Blackfin_Barracuda\",\"name\":\"검정핀꼬치고기\",\"region\":\"블루홀 중간 수역\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Spear_Squid\",\"name\":\"화살오징어\",\"region\":\"블루홀 중간 수역\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Humboldt_Squid\",\"name\":\"훔볼트오징어\",\"region\":\"블루홀 중간 수역\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Devil_Scorpion_Fish\",\"name\":\"데빌스콜피온피쉬\",\"region\":\"블루홀 중간 수역\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Fan_Lobster\",\"name\":\"부채새우\",\"region\":\"블루홀 중간 수역\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Crystal_Lobster\",\"name\":\"크리스탈랍스터\",\"region\":\"블루홀 중간 수역\",\"time\":\"밤\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Peacock_Squid\",\"name\":\"공작오징어\",\"region\":\"빙하 통로\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Dumbo_Octopus\",\"name\":\"덤보문어\",\"region\":\"빙하 통로\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Barreleye\",\"name\":\"배럴아이\",\"region\":\"빙하 통로\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Blob_Fish\",\"name\":\"블롭피쉬\",\"region\":\"빙하 통로\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Vampire_Squid\",\"name\":\"흡혈오징어\",\"region\":\"빙하 통로\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Pelican_Eel\",\"name\":\"펠리칸장어\",\"region\":\"빙하 통로\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Arctic_Cod\",\"name\":\"극지대구\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Gelatinous_Snailfish\",\"name\":\"남극꼼치\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Antarctic_Octopus\",\"name\":\"남극문어\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Greenland_Shark\",\"name\":\"그린란드상어\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Polar_Eelpout\",\"name\":\"북극등가시치\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Porbeagle_Shark\",\"name\":\"비악상어\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Ice_Fish\",\"name\":\"아이스피쉬\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Capelin\",\"name\":\"열빙어\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Narwhal\",\"name\":\"일각고래\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Haddock\",\"name\":\"해덕대구\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Starry_Skate\",\"name\":\"땅가오리\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Arctic_Telescope_Fish\",\"name\":\"북극 망원경 물고기\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Alaska_Pollock\",\"name\":\"알래스카 명태\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Lumpfish\",\"name\":\"럼프피쉬\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Snub_Nosed_Spiny_Eel\",\"name\":\"들창코가시장어\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Golden_King_Crab\",\"name\":\"황색왕게\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Snow_Crab\",\"name\":\"대게\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Horsehair_Crab\",\"name\":\"털게\",\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Waptia_Fieldensis\",\"name\":\"왑티아 필덴시스\",\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Pikaia\",\"name\":\"피카이아\",\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Allenypterus\",\"name\":\"알레니프테루스\",\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Qingmendous\",\"name\":\"칭멘도스\",\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Falcatus\",\"name\":\"팔카투스\",\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Drepanaspis\",\"name\":\"드레파나스피스\",\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Dunkleosteus\",\"name\":\"둔클레오스테우스\",\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Megalograptus\",\"name\":\"메갈로그랍투스\",\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Xenacanthus\",\"name\":\"제나칸투스\",\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Dollocaris_Ingens\",\"name\":\"돌로카리스인겐스\",\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Tokummia_Katalepsis\",\"name\":\"토큐미아카탈렙시스\",\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Anomalocaris\",\"name\":\"아노말로칼리스\",\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Seahorse\",\"name\":\"해마\",\"region\":\"기타\",\"time\":\"낮\"}"));
            fishInfoList.add(new FishInfo("{\"id\":\"Seadragon\",\"name\":\"해룡\",\"region\":\"기타\",\"time\":\"낮\"}"));
        }
    }

    @Getter
    public static class Region {
        List<com.dave.the.diver.entity.Region> regionList;

        public Region() {
            this.regionList = new ArrayList<>();

            regionList.add(new com.dave.the.diver.entity.Region("BLUE_HOLE_SHALLOWS", "블루홀 초입", "cyan"));
            regionList.add(new com.dave.the.diver.entity.Region("BLUE_HOLE_MEDIUM_DEPTH", "블루홀 중간 수역", "blue"));
            regionList.add(new com.dave.the.diver.entity.Region("BLUE_HOLE_DEPTH", "블루홀 심해", "geekblue"));
            regionList.add(new com.dave.the.diver.entity.Region("GLACIER_PASSAGE", "빙하 통로", "dimgrey"));
            regionList.add(new com.dave.the.diver.entity.Region("GLACIER_ZONE", "빙하 지역", "deepskyblue"));
            regionList.add(new com.dave.the.diver.entity.Region("HYDROTHERMAL_VENTS", "열수 분출 구역", "volcano"));
            regionList.add(new com.dave.the.diver.entity.Region("ETC", "기타", "black"));
        }
    }

    @Getter
    public static class Time {
        List<com.dave.the.diver.entity.Time> timeList;

        public Time() {
            this.timeList = new ArrayList<>();

            timeList.add(new com.dave.the.diver.entity.Time("DAY", "낮", "blue"));
            timeList.add(new com.dave.the.diver.entity.Time("NIGHT", "밤", "black"));
        }
    }

    @Getter
    public static class DishInfo {
        private String dishId;
        private String name;
        private String unlock;
        private int maxCost = 0;
        private int maxScore = 0;
        private int maxCount = 1;
        private int maxLevel = 1;
        private int flame = 0;
        private final List<String> partyList;

        public DishInfo(
            String json
        ) throws JSONException {
            JSONObject jsonObject = new JSONObject(json);

            if (jsonObject.has("id")) {
                this.dishId = (String) jsonObject.get("id");
            }

            if (jsonObject.has("name")) {
                this.name = (String) jsonObject.get("name");
            }

            if (jsonObject.has("unlock")) {
                this.unlock = (String) jsonObject.get("unlock");
            }

            if (jsonObject.has("maxCost")) {
                this.maxCost = (int) jsonObject.get("maxCost");
            }

            if (jsonObject.has("maxScore")) {
                this.maxScore = (int) jsonObject.get("maxScore");
            }

            if (jsonObject.has("maxCount")) {
                this.maxCount = (int) jsonObject.get("maxCount");
            }

            if (jsonObject.has("maxLevel")) {
                this.maxLevel = (int) jsonObject.get("maxLevel");
            }

            if (jsonObject.has("flame")) {
                this.flame = (int) jsonObject.get("flame");
            }

            this.partyList = new ArrayList<>();

            if (jsonObject.has("party")) {
                JSONArray partyJsonArray = (JSONArray) jsonObject.get("party");

                for (int i = 0; i < partyJsonArray.length(); i++) {
                    partyList.add((String) partyJsonArray.get(i));
                }
            }
        }
    }

    @Getter
    public static class Dish {

        private final List<DishInfo> dishJsonList;

        public Dish() throws JSONException {
            this.dishJsonList = new ArrayList<>();

            dishJsonList.add(new DishInfo("{\"id\":\"Clownfish_Sushi\",\"name\":\"흰동가리 초밥\",\"maxCost\":7,\"maxScore\":120,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Comber_Sushi\",\"name\":\"콤버 초밥\",\"maxCost\":7,\"maxScore\":140,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Cardinal_Fish_Sushi\",\"name\":\"지중해카디널피쉬 초밥\",\"maxCost\":11,\"maxScore\":100,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Sea_Goldie_Sushi\",\"name\":\"금강바리\",\"maxCost\":11,\"maxScore\":130,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Pyramid_Butterflyfish_Sushi\",\"name\":\"안개나비고기 초밥\",\"maxCost\":14,\"maxScore\":100,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Yellow_Tang_Sushi\",\"name\":\"옐로우탱 초밥\",\"maxCost\":14,\"maxScore\":100,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Salema_Porgy_Sushi\",\"name\":\"사르파살파 초밥\",\"maxCost\":18,\"maxScore\":110,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Orbicular_Batfish_Fry\",\"name\":\"원반제비활치 튀김\",\"maxCost\":18,\"maxScore\":110,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Blue_Tang_Sushi\",\"name\":\"블루탱 초밥\",\"maxCost\":22,\"maxScore\":110,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Rainbow_Wrasse_Sushi\",\"name\":\"무지개놀래기 초밥\",\"maxCost\":22,\"maxScore\":130,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Lagoon_Triggerfish_Sushi\",\"name\":\"배주름쥐치 초밥\",\"maxCost\":22,\"maxScore\":130,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Small_Spotted_Dart_Sushi\",\"name\":\"빨판매가리 초밥\",\"maxCost\":29,\"maxScore\":120,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Yellowback_Fusilier_Sushi\",\"name\":\"황등어 초밥\",\"maxCost\":25,\"maxScore\":120,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Ornate_Wrasse_Sushi\",\"name\":\"오네이트놀래기 초밥\",\"maxCost\":29,\"maxScore\":130,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Longfin_Batfish_Sushi\",\"name\":\"깃털제비활치 초밥\",\"maxCost\":37,\"maxScore\":130,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Mediterranean_Parrotfish_Sushi\",\"name\":\"지중해비늘돔 초밥\",\"maxCost\":37,\"maxScore\":140,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Redtooth_Triggerfish_Sushi\",\"name\":\"붉은이빨쥐치 초밥\",\"maxCost\":33,\"maxScore\":150,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Black_And_White_Snapper_Sushi\",\"name\":\"블랙스내퍼 초밥\",\"maxCost\":33,\"maxScore\":150,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Green_Humphead_Parrotfish_Sushi\",\"name\":\"버팔로피쉬 초밥\",\"maxCost\":59,\"maxScore\":230,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Barrel_Jellyfish_Sushi\",\"name\":\"배럴해파리 군함 초밥\",\"maxCost\":37,\"maxScore\":160,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Fried_Egg_Jellyfish_Sushi\",\"name\":\"달걀프라이해파리 군함 초밥\",\"maxCost\":29,\"maxScore\":160,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Whitetip_Reefshark_Sushi\",\"name\":\"백기흉상어 초밥\",\"maxCost\":88,\"maxScore\":270,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Moray_Eel_Sushi\",\"name\":\"곰치 초밥\",\"maxCost\":185,\"maxScore\":250,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Red_Lionfish_Sushi\",\"name\":\"쏠배감펭 초밥\",\"maxCost\":37,\"maxScore\":200,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Titan_Triggerfish_Sushi\",\"name\":\"타이탄트리거피쉬 초밥\",\"maxCost\":55,\"maxScore\":200,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Blacktip_Reefshark_Sushi\",\"name\":\"흑기흉상어 초밥\",\"maxCost\":222,\"maxScore\":270,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Copper_Shark_Sushi\",\"name\":\"무태상어 초밥\",\"maxCost\":240,\"maxScore\":280,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Box_Jellyfish_Sushi\",\"name\":\"상자해파리 군함 초밥\",\"maxCost\":203,\"maxScore\":270,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Bluefin_Tuna_Akami_Sushi\",\"name\":\"참다랑어 붉은살 초밥\",\"maxCost\":296,\"maxScore\":240,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"참치 요트 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Bluefin_Tuna_Chutoro_Sushi\",\"name\":\"참다랑어 중뱃살 초밥\",\"maxCost\":351,\"maxScore\":241,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"참치 요트 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Bluefin_Tuna_Otoro_Sushi\",\"name\":\"참다랑어 대뱃살 초밥\",\"maxCost\":499,\"maxScore\":330,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"참치 요트 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Yellowfin_Tuna_Akami_Sushi\",\"name\":\"황다랑어 붉은살 초밥\",\"maxCost\":270,\"maxScore\":235,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"참치 요트 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Yellowfin_Tuna_Chutoro_Sushi\",\"name\":\"황다랑어 중뱃살 초밥\",\"maxCost\":333,\"maxScore\":238,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"참치 요트 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Yellowfin_Tuna_Otoro_Sushi\",\"name\":\"황다랑어 대뱃살 초밥\",\"maxCost\":462,\"maxScore\":315,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"참치 요트 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Flame_Angelfish_Sushi\",\"name\":\"라마엔젤피쉬 초밥\",\"maxCost\":18,\"maxScore\":150,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Sheepshead_Sushi\",\"name\":\"혹돔 초밥\",\"maxCost\":55,\"maxScore\":240,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Emperor_Angelfish_Sushi\",\"name\":\"황제엔젤피쉬 초밥\",\"maxCost\":37,\"maxScore\":150,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Stingray_Sushi\",\"name\":\"노랑가오리 초밥\",\"maxCost\":92,\"maxScore\":260,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Marbled_Electric_Ray_Sushi\",\"name\":\"마블전기가오리 초밥\",\"maxCost\":333,\"maxScore\":300,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Cooked_Whiteleg_Shrimp_Sushi\",\"name\":\"흰다리자숙새우 초밥\",\"maxCost\":129,\"maxScore\":220,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"새우 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Striped_Catfish_Sushi\",\"name\":\"쏠종개 초밥\",\"maxCost\":18,\"maxScore\":260,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Purple_Sea_Urchin_Sushi\",\"name\":\"보라성게 초밥\",\"maxCost\":222,\"maxScore\":270,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Shortfin_Mako_Sushi\",\"name\":\"청상아리 초밥\",\"maxCost\":388,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Zebra_Shark_Sushi\",\"name\":\"지브라상어 초밥\",\"maxCost\":399,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Marlin_Sushi\",\"name\":\"청새치 초밥\",\"maxCost\":341,\"maxScore\":370,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"청새치 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Thresher_Shark_Sushi\",\"name\":\"환도상어 초밥\",\"maxCost\":588,\"maxScore\":390,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"American_Lobster_Sushi\",\"name\":\"미국바닷가재 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"European_Lobster_Sushi\",\"name\":\"유럽바닷가재 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Bluehead_Tilefish_Sushi\",\"name\":\"블루헤드타일피쉬 초밥\",\"maxCost\":55,\"maxScore\":140,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Clown_Frogfish_Sushi\",\"name\":\"무당씬벵이 초밥\",\"maxCost\":55,\"maxScore\":150,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Painted_Comber_Sushi\",\"name\":\"페인티드콤버 초밥\",\"maxCost\":32,\"maxScore\":140,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Bigeye_Scad_Sushi\",\"name\":\"새가라지 초밥\",\"maxCost\":62,\"maxScore\":140,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Striped_Red_Mullet_Sushi\",\"name\":\"노랑촉수 초밥\",\"maxCost\":59,\"maxScore\":140,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Mackerel_Scad_Sushi\",\"name\":\"풀가라지 초밥\",\"maxCost\":55,\"maxScore\":150,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Harleqiun_Hind_Sushi\",\"name\":\"청줄바리 초밥\",\"maxCost\":66,\"maxScore\":180,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Bigeye_Trevally_Sushi\",\"name\":\"줄전갱이 초밥\",\"maxCost\":70,\"maxScore\":170,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Coral_Trout_Sushi\",\"name\":\"무늬바리 초밥\",\"maxCost\":66,\"maxScore\":170,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Grey_Triggerfish_Sushi\",\"name\":\"갈쥐치 초밥\",\"maxCost\":62,\"maxScore\":170,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Atlantic_Bonito_Sushi\",\"name\":\"대서양보니토 초밥\",\"maxCost\":77,\"maxScore\":180,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"White_Trevally_Sushi\",\"name\":\"흑점줄전갱이 초밥\",\"maxCost\":81,\"maxScore\":190,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Cuttlefish_Sushi\",\"name\":\"갑오징어 초밥\",\"maxCost\":74,\"maxScore\":200,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Dusky_Grouper_Sushi\",\"name\":\"머구리농어 초밥\",\"maxCost\":81,\"maxScore\":200,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Atlantic_Mackerel_Sushi\",\"name\":\"대서양고등어 초밥\",\"maxCost\":77,\"maxScore\":190,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Giant_Trevally_Sushi\",\"name\":\"무명갈전갱이 초밥\",\"maxCost\":111,\"maxScore\":250,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"White_Spotted_Jellyfish_Sushi\",\"name\":\"흰점박이해파리 군함 초밥\",\"maxCost\":66,\"maxScore\":180,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Tiger_Shark_Sushi\",\"name\":\"뱀상어 초밥\",\"maxCost\":185,\"maxScore\":290,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Great_Barracuda_Sushi\",\"name\":\"큰꼬치고기 초밥\",\"maxCost\":74,\"maxScore\":220,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Narrow_Barred_Spanish_Mackerel_Sushi\",\"name\":\"동갈삼치 초밥\",\"maxCost\":74,\"maxScore\":190,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Longnose_Sawshark_Sushi\",\"name\":\"톱상어 초밥\",\"maxCost\":129,\"maxScore\":290,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Atlantic_Anglerfish_Sushi\",\"name\":\"대서양아귀 초밥\",\"maxCost\":76,\"maxScore\":240,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Sally_Lightfoot_Crab_Sushi\",\"name\":\"갈라파고스붉은게살 초밥\",\"maxCost\":185,\"maxScore\":320,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Raw_Black_Tiger_Shrimp_Sushi\",\"name\":\"블랙타이거생새우 초밥\",\"maxCost\":185,\"maxScore\":240,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"새우 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Smooth_Hammerhead_Sushi\",\"name\":\"귀상어 초밥\",\"maxCost\":521,\"maxScore\":390,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Sailfish_Sushi\",\"name\":\"돛새치 초밥\",\"maxCost\":336,\"maxScore\":400,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"청새치 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"California_Spiny_Lobster_Sushi\",\"name\":\"캘리포니아닭새우 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Tropical_Rock_Lobster_Sushi\",\"name\":\"비단닭새우 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Clearfin_Lionfish_Sushi\",\"name\":\"방사쏠배감펭 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Longspine_Squirrelfish_Sushi\",\"name\":\"롱스파인 다람쥐고기 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"White_Shrimp_Sushi\",\"name\":\"흰보리새우 초밥\",\"maxCost\":196,\"maxScore\":280,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"새우 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Red_Banded_Lobster_Sushi\",\"name\":\"가시발새우 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Blue_Lobster_Sushi\",\"name\":\"블루랍스터 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Blackfin_Barracuda_Sushi\",\"name\":\"검정핀꼬치고기 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Spear_Squid_Sushi\",\"name\":\"화살오징어 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Humboldt_Squid_Sushi\",\"name\":\"훔볼트오징어 초밥\",\"maxCost\":536,\"maxScore\":350,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Devil_Scorpion_Fish_Sushi\",\"name\":\"데빌스콜피온피쉬 초밥\",\"maxCost\":499,\"maxScore\":350,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Fan_Lobster_Sushi\",\"name\":\"부채새우 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Crystal_Lobster_Sushi\",\"name\":\"크리스탈랍스터 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Chambered_Nautilus_Sushi\",\"name\":\"앵무조개 초밥\",\"maxCost\":129,\"maxScore\":220,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Fangtooth_Sushi\",\"name\":\"귀신고기 초밥\",\"maxCost\":166,\"maxScore\":260,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Frilled_Shark_Sushi\",\"name\":\"주름상어 초밥\",\"maxCost\":314,\"maxScore\":280,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Bluespotted_Stargazer_Sushi\",\"name\":\"푸렁통구멍 초밥\",\"maxCost\":199,\"maxScore\":280,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Rhinochimaeridae_Sushi\",\"name\":\"코은상어 초밥\",\"maxCost\":333,\"maxScore\":290,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Spider_Crab_Sushi\",\"name\":\"키다리게 초밥\",\"maxCost\":185,\"maxScore\":290,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Megamouth_Shark_Sushi\",\"name\":\"메가마우스상어 초밥\",\"maxCost\":351,\"maxScore\":300,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Cookiecutter_Shark_Sushi\",\"name\":\"쿠키커터상어 초밥\",\"maxCost\":277,\"maxScore\":270,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Clione_Sushi\",\"name\":\"클리오네 초밥\",\"maxCost\":129,\"maxScore\":220,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Sea_Toad_Sushi\",\"name\":\"점씬벵이 초밥\",\"maxCost\":203,\"maxScore\":230,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Salmon_Snailfish_Sushi\",\"name\":\"분홍꼼치 초밥\",\"maxCost\":222,\"maxScore\":230,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Pacific_Fanfish_Sushi\",\"name\":\"벤텐어 초밥\",\"maxCost\":240,\"maxScore\":240,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Threetooth_Puffer_Sushi\",\"name\":\"불뚝복 초밥\",\"maxCost\":259,\"maxScore\":250,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Comb_Jelly_Sushi\",\"name\":\"감투빗해파리 초밥\",\"maxCost\":166,\"maxScore\":250,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Blood_belly_Comb_Jelly_Sushi\",\"name\":\"붉은배빗해파리 초밥\",\"maxCost\":185,\"maxScore\":250,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Red_Bream_Sushi\",\"name\":\"금눈돔 초밥\",\"maxCost\":129,\"maxScore\":270,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Norway_Lobster_Sushi\",\"name\":\"네점발빨간새우 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Eastern_Rock_Lobster_Sushi\",\"name\":\"동부바위바닷가재 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Peacock_Squid_Sushi\",\"name\":\"공작오징어 초밥\",\"maxCost\":277,\"maxScore\":290,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Dumbo_Octopus_Sushi\",\"name\":\"덤보문어 초밥\",\"maxCost\":296,\"maxScore\":330,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Barreleye_Sushi\",\"name\":\"배럴아이 초밥\",\"maxCost\":259,\"maxScore\":280,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Blob_Fish_Sushi\",\"name\":\"블롭피쉬 초밥\",\"maxCost\":444,\"maxScore\":310,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Vampire_Squid_Sushi\",\"name\":\"흡혈오징어\",\"maxCost\":425,\"maxScore\":340,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Pelican_Eel_Sushi\",\"name\":\"펠리칸장어 초밥\",\"maxCost\":666,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Arctic_Cod_Sushi\",\"name\":\"극지대구 초밥\",\"maxCost\":351,\"maxScore\":340,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Gelatinous_Snailfish_Sushi\",\"name\":\"남극꼼치 초밥\",\"maxCost\":314,\"maxScore\":330,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Antarctic_Octopus_Sushi\",\"name\":\"남극문어 초밥\",\"maxCost\":444,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Greenland_Shark_Sushi\",\"name\":\"그린란드상어 초밥\",\"maxCost\":592,\"maxScore\":370,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Polar_Eelpout_Sushi\",\"name\":\"북극등가시치 초밥\",\"maxCost\":333,\"maxScore\":320,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Porbeagle_Shark_Sushi\",\"name\":\"비악상어 초밥\",\"maxCost\":610,\"maxScore\":380,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Ice_Fish_Sushi\",\"name\":\"아이스피쉬 초밥\",\"maxCost\":351,\"maxScore\":320,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Capelin_Sushi\",\"name\":\"열빙어 초밥\",\"maxCost\":166,\"maxScore\":330,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Narwhal_Sushi\",\"name\":\"일각고래 초밥\",\"maxCost\":518,\"maxScore\":400,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Haddock_Sushi\",\"name\":\"해덕대구 초밥\",\"maxCost\":407,\"maxScore\":340,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Starry_Skate_Sushi\",\"name\":\"땅가오리 초밥\",\"maxCost\":481,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Arctic_Telescope_Fish_Sushi\",\"name\":\"북극 망원경 물고기 초밥\",\"maxCost\":444,\"maxScore\":350,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Alaska_Pollock_Sushi\",\"name\":\"알래스카 명태 초밥\",\"maxCost\":499,\"maxScore\":380,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Lumpfish_Sushi\",\"name\":\"럼프피쉬 초밥\",\"maxCost\":444,\"maxScore\":370,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Snub_Nosed_Spiny_Eel_Sushi\",\"name\":\"들창코가시장어 초밥\",\"maxCost\":666,\"maxScore\":390,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Golden_King_Crab_Sushi\",\"name\":\"황색왕게 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Snow_Crab_Sushi\",\"name\":\"대게 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Horsehair_Crab_Sushi\",\"name\":\"털게 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Waptia_Sushi\",\"name\":\"왑티아 초밥\",\"maxCost\":381,\"maxScore\":400,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"새우 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Pikaia_Sushi\",\"name\":\"피카이아 초밥\",\"maxCost\":425,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Allenypterus_Sushi\",\"name\":\"알레니프테루스 초밥\",\"maxCost\":462,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Qingmendous_Sushi\",\"name\":\"칭멘도스 초밥\",\"maxCost\":444,\"maxScore\":310,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Falcatus_Sushi\",\"name\":\"팔카투스 초밥\",\"maxCost\":481,\"maxScore\":380,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Drepanaspis_Sushi\",\"name\":\"드레파나스피스 초밥\",\"maxCost\":555,\"maxScore\":400,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Dunkleosteus_Sushi\",\"name\":\"둔클레오스테우스 초밥\",\"maxCost\":629,\"maxScore\":420,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Megalograptus_Sushi\",\"name\":\"메갈로그랍투스 초밥\",\"maxCost\":518,\"maxScore\":400,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Xenacanthus_Sushi\",\"name\":\"제나칸투스 초밥\",\"maxCost\":592,\"maxScore\":430,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Dollocaris_Ingens_Sushi\",\"name\":\"돌로카리스인겐스 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Tokummia_Katalepsis_Sushi\",\"name\":\"토큐미아카탈렙시스 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Young_Anomalocaris_Sushi\",\"name\":\"아노말로칼리스 새끼 초밥\",\"maxCost\":224,\"maxScore\":125,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Seahorse_Sewers\",\"name\":\"해마 꼬치구이\",\"maxCost\":111,\"maxScore\":220,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Seadragon_Onigiri\",\"name\":\"해룡 주먹밥\",\"maxCost\":388,\"maxScore\":470,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Whole_Roasted_Shark_Head\",\"name\":\"백기흉상어 머리 통구이\",\"unlock\":\"요시에 방문\",\"maxCost\":196,\"maxScore\":150,\"maxCount\":7,\"maxLevel\":10,\"flame\":3,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Falcatus_Soybean_Paste_Soup\",\"name\":\"팔카투스 된장국\",\"unlock\":\"열수 분출 구역 진입\",\"maxCost\":1554,\"maxScore\":382,\"maxCount\":7,\"maxLevel\":10,\"flame\":15,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Pikaia_Ramen\",\"name\":\"피카이아 라멘\",\"unlock\":\"열수 분출 구역 진입\",\"maxCost\":1554,\"maxScore\":360,\"maxCount\":10,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Steamed_Hyalonema_Angler_Fish\",\"name\":\"히알로네마 아귀찜\",\"unlock\":\"츠치 구조\",\"maxCost\":1650,\"maxScore\":248,\"maxCount\":1,\"maxLevel\":5,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Hyalonema_Tuna_Sashimi\",\"name\":\"히알로네마 참치회\",\"unlock\":\"츠치 구조\",\"maxCost\":1683,\"maxScore\":265,\"maxCount\":1,\"maxLevel\":5,\"flame\":15,\"party\":[\"참치 요트 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Seagrapes_Jellyfish_Sushi\",\"name\":\"바다포도 해파리 초밥\",\"unlock\":\"빈센트 접대 성공\",\"maxCost\":832,\"maxScore\":280,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Tropical_Fish_Sushi_Set\",\"name\":\"화려한 특초밥 세트\",\"unlock\":\"마이클 방 접대 성공\",\"maxCost\":1387,\"maxScore\":346,\"maxCount\":9,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Vegetable_Sushi\",\"name\":\"채소 초밥\",\"unlock\":\"새미 접대 성공\",\"maxCost\":1387,\"maxScore\":390,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Hotpeppertuna\",\"name\":\"핫페퍼튜나\",\"unlock\":\"방랑 상인 장고 방문\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Boiled_Asian_Sheepshead_Wrasse_And_Truffle\",\"name\":\"트러플 혹돔 조림\",\"unlock\":\"방랑 상인 장고 접대 성공\",\"maxCost\":1661,\"maxScore\":280,\"maxCount\":2,\"maxLevel\":5}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Sweet_And_Sour_Stargazer\",\"name\":\"푸렁통구멍 탕수어\",\"unlock\":\"왕팡 대결 승리\",\"maxCost\":1443,\"maxScore\":395,\"maxCount\":6,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Fried_Rice_With_Galapagos_Red_Crab\",\"name\":\"갈라파고스붉은게 볶음밥\",\"unlock\":\"왕팡 대결 승리\",\"maxCost\":1424,\"maxScore\":305,\"maxCount\":10,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Blobfish_Spring_Roll\",\"name\":\"블롭피쉬 춘권\",\"unlock\":\"왕팡 대결 승리\",\"maxCost\":1387,\"maxScore\":322,\"maxCount\":10,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Tomato_Egg_Soup\",\"name\":\"토마토 계란탕\",\"unlock\":\"왕팡 대결 승리\",\"maxCost\":1406,\"maxScore\":309,\"maxCount\":12,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Mianbao_Xia\",\"name\":\"멘보샤\",\"unlock\":\"왕팡 대결 승리\",\"maxCost\":1387,\"maxScore\":305,\"maxCount\":10,\"maxLevel\":10,\"flame\":7,\"party\":[\"새우 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Fried_Tomato_And_Snailfish\",\"name\":\"토마토 꼼치 볶음\",\"unlock\":\"왕팡 대결 승리\",\"maxCost\":1443,\"maxScore\":335,\"maxCount\":1,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Deep_Fish_Tempura\",\"name\":\"심해어 덴뿌라\",\"unlock\":\"알렉스 대결 승리\",\"maxCost\":1461,\"maxScore\":320,\"maxCount\":7,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Plotosid_Pie\",\"name\":\"쏠종개 파이\",\"unlock\":\"알렉스 대결 승리\",\"maxCost\":1424,\"maxScore\":420,\"maxCount\":7,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Pelican_Eel_Jelly\",\"name\":\"펠리칸장어 젤리\",\"unlock\":\"알렉스 대결 승리\",\"maxCost\":1380,\"maxScore\":439,\"maxCount\":9,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Smoked_Atlantic_Mackerel_Scramble\",\"name\":\"훈제 대서양고등어 스크램블\",\"unlock\":\"알렉스 대결 승리\",\"maxCost\":1431,\"maxScore\":460,\"maxCount\":6,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Comber_Sandwich\",\"name\":\"콤버 샌드위치\",\"unlock\":\"알렉스 대결 승리\",\"maxCost\":1443,\"maxScore\":420,\"maxCount\":6,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Humboldt_Ink_Pasta\",\"name\":\"훔볼트 먹물 파스타\",\"unlock\":\"파스트로 대결 승리\",\"maxCost\":1554,\"maxScore\":375,\"maxCount\":10,\"maxLevel\":10,\"party\":[\"새우 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Narrow_Barred_Spanish_Mackerel_Arancini\",\"name\":\"동갈삼치 아란치니\",\"unlock\":\"파스트로 대결 승리\",\"maxCost\":1443,\"maxScore\":364,\"maxCount\":7,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Antarctic_Octopus_Carpaccio\",\"name\":\"남극문어 카르파초\",\"unlock\":\"파스트로 대결 승리\",\"maxCost\":1498,\"maxScore\":408,\"maxCount\":7,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Arctic_Cod_Risotto\",\"name\":\"극지대구 리조토\",\"unlock\":\"파스트로 대결 승리\",\"maxCost\":1509,\"maxScore\":377,\"maxCount\":9,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Peacock_Squid_Ripieni\",\"name\":\"공작오징어 리피에니\",\"unlock\":\"파스트로 대결 승리\",\"maxCost\":1517,\"maxScore\":360,\"maxCount\":7,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Haddock_Acqua_Pazza\",\"name\":\"해덕대구 아쿠아파짜\",\"unlock\":\"파스트로 대결 승리\",\"maxCost\":1498,\"maxScore\":400,\"maxCount\":9,\"maxLevel\":10,\"flame\":7}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Boiled_Yellowback_Fusilier\",\"name\":\"황등어 간장조림\",\"unlock\":\"쿡스타 브론즈 달성\",\"maxCost\":185,\"maxScore\":255,\"maxCount\":7,\"maxLevel\":10,\"flame\":3}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Salt_Grilled_Redtoothed_Triggerfish\",\"name\":\"붉은이빨쥐치 소금구이\",\"unlock\":\"쿡스타 브론즈 달성\",\"maxCost\":177,\"maxScore\":241,\"maxCount\":6,\"maxLevel\":10,\"flame\":3}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Agar_Tokoroten\",\"name\":\"도코로텐\",\"unlock\":\"쿡스타 브론즈 달성\",\"maxCost\":188,\"maxScore\":266,\"maxCount\":7,\"maxLevel\":10,\"flame\":3}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Seasoned_Kajime\",\"name\":\"감태 초무침\",\"unlock\":\"쿡스타 브론즈 달성\",\"maxCost\":185,\"maxScore\":245,\"maxCount\":6,\"maxLevel\":10,\"flame\":3}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Moray_Eel_Curry\",\"name\":\"곰치 커리\",\"unlock\":\"쿡스타 실버 달성\",\"maxCost\":351,\"maxScore\":273,\"maxCount\":6,\"maxLevel\":10,\"flame\":3,\"party\":[\"카레 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Striped_Red_Mullet_Tangle_Roll\",\"name\":\"노랑촉수 다시마 말이\",\"unlock\":\"쿡스타 실버 달성\",\"maxCost\":296,\"maxScore\":270,\"maxCount\":7,\"maxLevel\":10,\"flame\":6}"));
            dishJsonList.add(new DishInfo("{\"id\":\"White_Trevally_Kombu_Ochazuke\",\"name\":\"다시마 흑점줄전갱이 오차즈케\",\"unlock\":\"쿡스타 실버 달성\",\"maxCost\":344,\"maxScore\":266,\"maxCount\":7,\"maxLevel\":10,\"flame\":6}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Stellate_Puffer_Special_Sushi\",\"name\":\"복어 특초밥\",\"unlock\":\"쿡스타 골드 달성\",\"maxCost\":814,\"maxScore\":340,\"maxCount\":1,\"maxLevel\":10,\"flame\":6}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Seagrapes_Special_Sushi\",\"name\":\"바다포도 특초밥\",\"unlock\":\"쿡스타 골드 달성\",\"maxCost\":740,\"maxScore\":390,\"maxCount\":1,\"maxLevel\":10,\"flame\":6}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Trout_Sea_Grapes_Ricebowl\",\"name\":\"바다포도 무늬바리 회덮밥\",\"unlock\":\"쿡스타 골드 달성\",\"maxCost\":647,\"maxScore\":290,\"maxCount\":7,\"maxLevel\":10,\"flame\":9}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Big_Eyed_Scad_And_Soybean_Paste_Roast\",\"name\":\"새가라지 된장구이\",\"unlock\":\"쿡스타 골드 달성\",\"maxCost\":684,\"maxScore\":348,\"maxCount\":7,\"maxLevel\":10,\"flame\":9}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Seahorse_Udon\",\"name\":\"해마 우동\",\"unlock\":\"쿡스타 플래티넘 달성\",\"maxCost\":1387,\"maxScore\":353,\"maxCount\":4,\"maxLevel\":10,\"flame\":9}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Black_Vinegar_Braised_Parrotfish\",\"name\":\"비늘돔 흑식초 조림\",\"unlock\":\"쿡스타 플래티넘 달성\",\"maxCost\":1424,\"maxScore\":406,\"maxCount\":6,\"maxLevel\":10,\"flame\":9}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Atlantic_Bonito_Curry\",\"name\":\"대서양보니토 커리\",\"unlock\":\"쿡스타 플래티넘 달성\",\"maxCost\":1406,\"maxScore\":389,\"maxCount\":7,\"maxLevel\":10,\"flame\":12,\"party\":[\"카레 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Humphead_Parrotfish_Curry\",\"name\":\"버팔로피쉬 커리\",\"unlock\":\"쿡스타 플래티넘 달성\",\"maxCost\":1387,\"maxScore\":347,\"maxCount\":6,\"maxLevel\":10,\"flame\":12,\"party\":[\"카레 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Great_Barracuda_Canape\",\"name\":\"큰꼬치고기 카나페\",\"unlock\":\"쿡스타 다이아몬드 달성\",\"maxCost\":1572,\"maxScore\":372,\"maxCount\":6,\"maxLevel\":10,\"flame\":12}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Nasu_Dengaku\",\"name\":\"나스 덴가쿠\",\"unlock\":\"쿡스타 다이아몬드 달성\",\"maxCost\":1535,\"maxScore\":317,\"maxCount\":4,\"maxLevel\":10,\"flame\":12}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Dumbo_Takoyaki\",\"name\":\"덤보 타코야끼\",\"unlock\":\"쿡스타 다이아몬드 달성\",\"maxCost\":1554,\"maxScore\":390,\"maxCount\":9,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Rice_With_Great_Spider_Crab_Meat\",\"name\":\"키다리게 덮밥 \",\"unlock\":\"쿡스타 다이아몬드 달성\",\"maxCost\":1517,\"maxScore\":330,\"maxCount\":7,\"maxLevel\":10,\"flame\":12}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Bluefin_Tuna_Rice_Bowl\",\"name\":\"마구로동\",\"unlock\":\"참치 요트 파티 시작\",\"maxCost\":1332,\"maxScore\":400,\"maxCount\":9,\"maxLevel\":10,\"flame\":5,\"party\":[\"참치 요트 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Hawaiian_Poke\",\"name\":\"하와이안 포케\",\"unlock\":\"참치 요트 파티 시작\",\"maxCost\":980,\"maxScore\":348,\"maxCount\":9,\"maxLevel\":10,\"flame\":5,\"party\":[\"참치 요트 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Yellowfin_Tuna_Steak\",\"name\":\"황다랑어 스테이크\",\"unlock\":\"참치 요트 파티 시작\",\"maxCost\":1128,\"maxScore\":332,\"maxCount\":9,\"maxLevel\":10,\"flame\":5,\"party\":[\"참치 요트 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Marlin_And_Soybean_Paste_Roast\",\"name\":\"청새치 된장구이\",\"unlock\":\"청새치 파티 시작\",\"maxCost\":1406,\"maxScore\":272,\"maxCount\":9,\"maxLevel\":10,\"flame\":5,\"party\":[\"청새치 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Boiled_Sailfish_And_Seaweed\",\"name\":\"돛새치 해초조림\",\"unlock\":\"청새치 파티 시작\",\"maxCost\":1572,\"maxScore\":300,\"maxCount\":9,\"maxLevel\":10,\"flame\":5,\"party\":[\"청새치 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Pickled_Vegetables\",\"name\":\"채소절임\",\"unlock\":\"오이 파티 시작\",\"maxCost\":1169,\"maxScore\":364,\"maxCount\":3,\"maxLevel\":10,\"party\":[\"오이 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Deep_Fried_Vegetables\",\"name\":\"채소튀김\",\"unlock\":\"오이 파티 시작\",\"maxCost\":1154,\"maxScore\":396,\"maxCount\":3,\"maxLevel\":10,\"party\":[\"오이 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Skewered_Cucumber\",\"name\":\"오이꼬치\",\"unlock\":\"오이 파티 시작\",\"maxCost\":1184,\"maxScore\":340,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"오이 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Sea_Toad_And_Cucumber_Gunkan_Sushi\",\"name\":\"점씬벵이 오이 군함 초밥\",\"unlock\":\"오이 파티 시작\",\"maxCost\":1184,\"maxScore\":367,\"maxCount\":1,\"maxLevel\":10,\"flame\":5,\"party\":[\"오이 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Great_Spider_Crab_And_Cucumber_Sushi\",\"name\":\"키다리게 오이 초밥\",\"unlock\":\"오이 파티 시작\",\"maxCost\":1198,\"maxScore\":385,\"maxCount\":1,\"maxLevel\":10,\"flame\":5,\"party\":[\"오이 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Trevally_Sandwich\",\"name\":\"전갱이 샌드\",\"unlock\":\"오이 파티 시작\",\"maxCost\":1154,\"maxScore\":260,\"maxCount\":7,\"maxLevel\":10,\"flame\":5,\"party\":[\"오이 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Seasoned_Waptia_Fieldensis\",\"name\":\"왑티아 필덴시스 초무침\",\"unlock\":\"오이 파티 시작\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"flame\":15,\"party\":[\"오이 파티\",\"새우 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Stir_Fried_Habanero_Lobster\",\"name\":\"하바네로 가재 볶음\",\"unlock\":\"랍스터 파티 시작\",\"maxCost\":1443,\"maxScore\":320,\"maxCount\":6,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Steamed_Eastern_Rock_Lobster_And_Egg\",\"name\":\"동부바위바닷가재 계란찜\",\"unlock\":\"랍스터 파티 시작\",\"maxCost\":1406,\"maxScore\":455,\"maxCount\":7,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Crystal_Lobster_Roll\",\"name\":\"크리스탈랍스터 롤\",\"unlock\":\"랍스터 파티 시작\",\"maxCost\":1369,\"maxScore\":305,\"maxCount\":9,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Stellate_Puffer_Nicogori\",\"name\":\"복어 니코고리\",\"unlock\":\"직원 Lv.5 달성\",\"maxCost\":666,\"maxScore\":381,\"maxCount\":7,\"maxLevel\":10,\"flame\":8}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Special_Fried_Shrimp_Sushi\",\"name\":\"새우튀김 특초밥\",\"unlock\":\"드레 Lv.5 달성\",\"maxCost\":1406,\"maxScore\":317,\"maxCount\":1,\"maxLevel\":10,\"flame\":8,\"party\":[\"새우 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Boiled_And_Deep_Fried_White_Shrimp\",\"name\":\"흰다리자숙새우 튀김\",\"unlock\":\"랩터 Lv.5 달성\",\"maxCost\":832,\"maxScore\":330,\"maxCount\":10,\"maxLevel\":10,\"flame\":8,\"party\":[\"새우 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Smallspotted_Dart_Kajime_Soup\",\"name\":\"빨판매가리 감태국\",\"unlock\":\"마키 Lv.5 달성\",\"maxCost\":555,\"maxScore\":367,\"maxCount\":7,\"maxLevel\":10,\"flame\":8}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Fried_Seahorses\",\"name\":\"해마 튀김\",\"unlock\":\"코카니지 Lv.5 달성\",\"maxCost\":814,\"maxScore\":362,\"maxCount\":4,\"maxLevel\":10,\"flame\":8}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Roasted_Capelin\",\"name\":\"열빙어 구이\",\"unlock\":\"드레 Lv.10 달성\",\"maxCost\":1443,\"maxScore\":345,\"maxCount\":7,\"maxLevel\":10,\"flame\":12,\"party\":[\"카레 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Rice_With_Purple_Sea_Urchin_Sushi\",\"name\":\"보라성게 덮밥\",\"unlock\":\"랩터 Lv.10 달성\",\"maxCost\":1424,\"maxScore\":320,\"maxCount\":4,\"maxLevel\":10,\"flame\":12}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Deep_Fried_Luna_Lionfish\",\"name\":\"쏠배감펭 튀김\",\"unlock\":\"코카니지 Lv.10 달성\",\"maxCost\":1443,\"maxScore\":366,\"maxCount\":4,\"maxLevel\":10,\"flame\":12}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Narwhal_Miso_Soup\",\"name\":\"일각고래 미소된장국\",\"unlock\":\"다비나 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":420,\"maxCount\":12,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Ice_Fish_Curry\",\"name\":\"아이스피쉬 커리\",\"unlock\":\"드레 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":317,\"maxCount\":9,\"maxLevel\":10,\"flame\":15,\"party\":[\"카레 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Boiled_Porbeagle_Shark\",\"name\":\"비악상어 조림\",\"unlock\":\"라울 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":332,\"maxCount\":7,\"maxLevel\":10,\"flame\":15,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Fried_Onion_Cuttlefish\",\"name\":\"갑오징어 어니언링\",\"unlock\":\"랩터 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":360,\"maxCount\":7,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Three_Colored_Squid_Roast\",\"name\":\"삼색오징어구이\",\"unlock\":\"리우 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":335,\"maxCount\":12,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Latok_Omelet\",\"name\":\"바다포도 계란덮밥\",\"unlock\":\"마사요시 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":260,\"maxCount\":9,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Trevally_Nanbanzuke\",\"name\":\"전갱이 난반즈케\",\"unlock\":\"마키 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":343,\"maxCount\":7,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Batfish_Ricebowl\",\"name\":\"활치 오야코동\",\"unlock\":\"미첼 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":447,\"maxCount\":7,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Crimson_Fish_Roll\",\"name\":\"다홍빛 생선 롤\",\"unlock\":\"빌리 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":285,\"maxCount\":9,\"maxLevel\":10,\"flame\":15,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Dusky_Grouper_Steak\",\"name\":\"머구리농어 스테이크\",\"unlock\":\"엘 니뇨 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":328,\"maxCount\":7,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Seahorse_Salad\",\"name\":\"해마해초 샐러드\",\"unlock\":\"요네 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":295,\"maxCount\":6,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Deep_Fried_Eggplant_Shrimp_Meatballs\",\"name\":\"가지 새우완자 튀김\",\"unlock\":\"유스케 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":460,\"maxCount\":7,\"maxLevel\":10,\"flame\":15,\"party\":[\"새우 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Shark_Karaage\",\"name\":\"상어 가라아게\",\"unlock\":\"이츠키 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":380,\"maxCount\":9,\"maxLevel\":10,\"flame\":15,\"party\":[\"스톰 샤크 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Wrasse_Curry\",\"name\":\"놀래기 커리\",\"unlock\":\"잔디 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":330,\"maxCount\":6,\"maxLevel\":10,\"flame\":15,\"party\":[\"카레 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Seasoned_Jellyfish\",\"name\":\"해파리 무침\",\"unlock\":\"제임스 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":298,\"maxCount\":6,\"maxLevel\":10,\"flame\":15,\"party\":[\"해파리 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Great_Spider_Crab_Curry\",\"name\":\"키다리게 커리\",\"unlock\":\"찰리 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":290,\"maxCount\":9,\"maxLevel\":10,\"flame\":15,\"party\":[\"카레 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Dried_Stingray\",\"name\":\"가오리포\",\"unlock\":\"카롤리나 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":225,\"maxCount\":12,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Mackerel_Scad_Hotdog\",\"name\":\"풀가라지 핫도그\",\"unlock\":\"코카니지 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":340,\"maxCount\":6,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Rice_With_White_Shrimp_Meat\",\"name\":\"흰보리새우 덮밥\",\"unlock\":\"쿄코 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":400,\"maxCount\":9,\"maxLevel\":10,\"flame\":15,\"party\":[\"새우 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Roasted_Tropical_Fish_And_Garlic\",\"name\":\"열대어 마늘구이\",\"unlock\":\"토호쿠 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":236,\"maxCount\":9,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Seaweed_Rolled_Omelet\",\"name\":\"해초 계란말이\",\"unlock\":\"파이 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":300,\"maxCount\":9,\"maxLevel\":10,\"flame\":15}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Fried_Habanero_FangTooth\",\"name\":\"하바네로 귀신고기 튀김\",\"unlock\":\"비밀 레시피\",\"maxCost\":1517,\"maxScore\":420,\"maxCount\":7,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Moonlight_Bladderwrack_Roll\",\"name\":\"달빛 블래더랙 롤\",\"unlock\":\"비밀 레시피\",\"maxCost\":1498,\"maxScore\":360,\"maxCount\":9,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Secret_1\",\"name\":\"하바네로 장어 구이\",\"unlock\":\"비밀 레시피\",\"maxCost\":1572,\"maxScore\":335,\"maxCount\":9,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Lobster_Platter\",\"name\":\"랍스터 플래터\",\"unlock\":\"비밀 레시피\",\"maxCost\":1609,\"maxScore\":375,\"maxCount\":6,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Pufferfish_Dumpling_Soup\",\"name\":\"복어 완자탕\",\"unlock\":\"비밀 레시피\",\"maxCost\":1554,\"maxScore\":420,\"maxCount\":9,\"maxLevel\":10}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Soy_Sauce_Marinated_Crab\",\"name\":\"간장 게장\",\"unlock\":\"비밀 레시피\",\"maxCost\":1609,\"maxScore\":505,\"maxCount\":6,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Secret_2\",\"name\":\"트러플 돛새치 타르타르\",\"unlock\":\"비밀 레시피\",\"maxCost\":1727,\"maxScore\":295,\"maxCount\":2,\"maxLevel\":5}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Secret_3\",\"name\":\"트러플 상어 샌드\",\"unlock\":\"비밀 레시피\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":5}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Secret_4\",\"name\":\"트러플 남극문어 구이\",\"unlock\":\"비밀 레시피\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":5}"));
            dishJsonList.add(new DishInfo("{\"id\":\"Secret_5\",\"name\":\"트러플 블루랍스터 꼬리회\",\"unlock\":\"비밀 레시피\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":5,\"party\":[\"랍스터 파티\"]}"));
        }
    }

    @Getter
    public static class Party {
        private final List<com.dave.the.diver.entity.Party> partyList;

        public Party() {
            this.partyList = new ArrayList<>();

            partyList.add(new com.dave.the.diver.entity.Party("JELLY_FISH", "해파리 파티", "blueviolet"));
            partyList.add(new com.dave.the.diver.entity.Party("TUNA", "참치 요트 파티", "dodgerblue"));
            partyList.add(new com.dave.the.diver.entity.Party("MARLIN", "청새치 파티", "darkblue"));
            partyList.add(new com.dave.the.diver.entity.Party("STORM_SHARK", "스톰 샤크 파티", "black"));
            partyList.add(new com.dave.the.diver.entity.Party("CUCUMBER", "오이 파티", "forestgreen"));
            partyList.add(new com.dave.the.diver.entity.Party("CURRY", "카레 파티", "goldenrod"));
            partyList.add(new com.dave.the.diver.entity.Party("SHRIMP", "새우 파티", "lightsalmon"));
            partyList.add(new com.dave.the.diver.entity.Party("LOBSTER", "랍스터 파티", "orangered"));
        }
    }

    @Getter
    public static class Unlock {
        private enum STAFF {
            STAFF,
            DRE,
            RAPTOR,
            MAKI,
            KORCANIJI,
            DAVINA,
            RAUL,
            RIU,
            MASAYOSI,
            MICHEL,
            BILLY,
            EL_NINYO,
            YONE,
            YUSKE,
            ITSUKI,
            JANDI,
            JAMES,
            CHARLY,
            CAROLLINA,
            KYOKO,
            TOHOKU,
            PIE,

        }

        private enum LEVEL {
            LV_5,
            LV_10,
            LV_15
        }

        private final List<com.dave.the.diver.entity.Unlock> unlockList;

        public Unlock() {
            this.unlockList = new ArrayList<>();

            unlockList.add(new com.dave.the.diver.entity.Unlock("YOSHIE_VISIT", "요시에 방문"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("ENTER_HYDROTHERMAL_VENTS", "열수 분출 구역 진입"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("RESCUE_TSHCHI", "츠치 구조"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("VIP_VINCENT", "빈센트 접대 성공"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("VIP_MICHAEL_BANG", "마이클 방 접대 성공"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("VIP_SAMMY", "새미 접대 성공"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("DJANGO_VISIT", "방랑 상인 장고 방문"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("VIP_DJANGO", "방랑 상인 장고 접대 성공"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("CHALLENGE_WANG_PANG", "왕팡 대결 승리"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("CHALLENGE_ALEX", "알렉스 대결 승리"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("CHALLENGE_PASTRO", "파스트로 대결 승리"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("COOK_STAR_BRONZE", "쿡스타 브론즈 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("COOK_STAR_SILVER", "쿡스타 실버 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("COOK_STAR_GOLD", "쿡스타 골드 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("COOK_STAR_PLATINUM", "쿡스타 플래티넘 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("COOK_STAR_DIA", "쿡스타 다이아몬드 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("PARTY_TUNA", "참치 요트 파티 시작"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("PARTY_MARLIN", "청새치 파티 시작"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("PARTY_CUCUMBER", "오이 파티 시작"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("PARTY_LOBSTER", "랍스터 파티 시작"));
            unlockList.add(new com.dave.the.diver.entity.Unlock("SECRET_RECIPE", "비밀 레시피"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.STAFF.name() + "_" + LEVEL.LV_5.name(), "직원 Lv.5 달성"));
            // TODO 직원 이름 확인
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.DRE.name() + "_" + LEVEL.LV_5.name(), "드레 Lv.5 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.RAPTOR.name() + "_" + LEVEL.LV_5.name(), "랩터 Lv.5 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.MAKI.name() + "_" + LEVEL.LV_5.name(), "마키 Lv.5 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.KORCANIJI.name() + "_" + LEVEL.LV_5.name(), "코카니지 Lv.5 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.DRE.name() + "_" + LEVEL.LV_10.name(), "드레 Lv.10 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.RAPTOR.name() + "_" + LEVEL.LV_10.name(), "랩터 Lv.10 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.KORCANIJI.name() + "_" + LEVEL.LV_10.name(), "코카니지 Lv.10 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.DAVINA.name() + "_" + LEVEL.LV_15.name(), "다비나 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.DRE.name() + "_" + LEVEL.LV_15.name(), "드레 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.RAUL.name() + "_" + LEVEL.LV_15.name(), "라울 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.RAPTOR.name() + "_" + LEVEL.LV_15.name(), "랩터 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.RIU.name() + "_" + LEVEL.LV_15.name(), "리우 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.MASAYOSI.name() + "_" + LEVEL.LV_15.name(), "마사요시 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.MAKI.name() + "_" + LEVEL.LV_15.name(), "마키 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.MICHEL.name() + "_" + LEVEL.LV_15.name(), "미첼 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.BILLY.name() + "_" + LEVEL.LV_15.name(), "빌리 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.EL_NINYO.name() + "_" + LEVEL.LV_15.name(), "엘 니뇨 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.YONE.name() + "_" + LEVEL.LV_15.name(), "요네 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.YUSKE.name() + "_" + LEVEL.LV_15.name(), "유스케 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.ITSUKI.name() + "_" + LEVEL.LV_15.name(), "이츠키 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.JANDI.name() + "_" + LEVEL.LV_15.name(), "잔디 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.JAMES.name() + "_" + LEVEL.LV_15.name(), "제임스 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.CHARLY.name() + "_" + LEVEL.LV_15.name(), "찰리 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.CAROLLINA.name() + "_" + LEVEL.LV_15.name(), "카롤리나 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.KORCANIJI.name() + "_" + LEVEL.LV_15.name(), "코카니지 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.KYOKO.name() + "_" + LEVEL.LV_15.name(), "쿄코 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.TOHOKU.name() + "_" + LEVEL.LV_15.name(), "토호쿠 Lv.15 달성"));
            unlockList.add(new com.dave.the.diver.entity.Unlock(STAFF.PIE.name() + "_" + LEVEL.LV_15.name(), "파이 Lv.15 달성"));
        }
    }
}
