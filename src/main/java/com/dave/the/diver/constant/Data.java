package com.dave.the.diver.constant;

import com.dave.the.diver.dto.DishDto;
import com.dave.the.diver.dto.FishDto;
import com.dave.the.diver.dto.PlantDto;
import com.dave.the.diver.dto.SeasoningDto;
import com.dave.the.diver.entity.*;
import lombok.Getter;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Data {

    @Getter
    public static class Fish {
        List<FishDto> fishDtoList;

        public Fish() throws JSONException {
            this.fishDtoList = new ArrayList<>();

            fishDtoList.add(new FishDto("{\"id\":\"Clownfish\",\"name\":\"흰동가리\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Comber\",\"name\":\"콤버\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Cardinal_Fish\",\"name\":\"지중해카디널피쉬\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Sea_Goldie\",\"name\":\"금강바리\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Pyramid_Butterflyfish\",\"name\":\"안개나비고기\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Yellow_Tang\",\"name\":\"옐로우탱\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Salema_Porgy\",\"name\":\"사르파살파\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Orbicular_Batfish\",\"name\":\"원반제비활치\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Blue_Tang\",\"name\":\"블루탱\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Rainbow_Wrasse\",\"name\":\"무지개놀래기\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Lagoon_Triggerfish\",\"name\":\"배주름쥐치\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Small_Spotted_Dart\",\"name\":\"빨판매가리\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Yellowback_Fusilier\",\"name\":\"황등어\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Ornate_Wrasse\",\"name\":\"오네이트놀래기\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Longfin_Batfish\",\"name\":\"깃털제비활치\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Mediterranean_Parrotfish\",\"name\":\"지중해비늘돔\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Redtooth_Triggerfish\",\"name\":\"붉은이빨쥐치\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Black_And_White_Snapper\",\"name\":\"블랙스내퍼\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Green_Humphead_Parrotfish\",\"name\":\"버팔로피쉬\",\"rank\":3,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Barrel_Jellyfish\",\"name\":\"배럴해파리\",\"rank\":2,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Fried_Egg_Jellyfish\",\"name\":\"달걀프라이해파리\",\"rank\":2,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Whitetip_Reefshark\",\"name\":\"백기흉상어\",\"rank\":4,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Starry_Puffer\",\"name\":\"꺼끌복\",\"rank\":3,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Red_Lionfish\",\"name\":\"쏠배감펭\",\"rank\":2,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Titan_Triggerfish\",\"name\":\"타이탄트리거피쉬\",\"rank\":2,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Bluefin_Tuna\",\"name\":\"참다랑어\",\"rank\":7,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Yellowfin_Tuna\",\"name\":\"황다랑어\",\"rank\":7,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Flame_Angelfish\",\"name\":\"라마엔젤피쉬\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Sheepshead\",\"name\":\"혹돔\",\"rank\":5,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Emperor_Angelfish\",\"name\":\"황제엔젤피쉬\",\"rank\":1,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Stingray\",\"name\":\"노랑가오리\",\"rank\":6,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Marbled_Electric_Ray\",\"name\":\"마블전기가오리\",\"rank\":6,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Whiteleg_Shrimp\",\"name\":\"흰다리새우\",\"rank\":5,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Striped_Catfish\",\"name\":\"쏠종개\",\"rank\":5,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Purple_Sea_Urchin\",\"name\":\"보라성게\",\"rank\":5,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Shortfin_Mako\",\"name\":\"청상아리\",\"rank\":8,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Marlin\",\"name\":\"청새치\",\"rank\":8,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Thresher_Shark\",\"name\":\"환도상어\",\"rank\":9,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"American_Lobster\",\"name\":\"미국바닷가재\",\"rank\":8,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"European_Lobster\",\"name\":\"유렵바닷가재\",\"rank\":5,\"region\":\"블루홀 초입\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Bluehead_Tilefish\",\"name\":\"블루헤드타일피쉬\",\"rank\":1,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Clown_Frogfish\",\"name\":\"무당씬벵이\",\"rank\":1,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Painted_Comber\",\"name\":\"페인티드콤버\",\"rank\":1,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Bigeye_Scad\",\"name\":\"새가라지\",\"rank\":1,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Striped_Red_Mullet\",\"name\":\"노랑촉수\",\"rank\":1,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Mackerel_Scad\",\"name\":\"풀가라지\",\"rank\":1,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Harleqiun_Hind\",\"name\":\"청줄바리\",\"rank\":2,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Bigeye_Trevally\",\"name\":\"줄전갱이\",\"rank\":2,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Coral_Trout\",\"name\":\"무늬바리\",\"rank\":2,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Grey_Triggerfish\",\"name\":\"갈쥐치\",\"rank\":2,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Atlantic_Bonito\",\"name\":\"대서양보니토\",\"rank\":2,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"White_Trevally\",\"name\":\"흑점줄전갱이\",\"rank\":2,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Cuttlefish\",\"name\":\"갑오징어\",\"rank\":2,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Dusky_Grouper\",\"name\":\"머구리농어\",\"rank\":3,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Atlantic_Mackerel\",\"name\":\"대서양고등어\",\"rank\":3,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Giant_Trevally\",\"name\":\"무명갈전갱이\",\"rank\":4,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"White_Spotted_Jellyfish\",\"name\":\"흰점박이해파리\",\"rank\":2,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Tiger_Shark\",\"name\":\"뱀상어\",\"rank\":6,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Great_Barracuda\",\"name\":\"큰꼬치고기\",\"rank\":3,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Narrow_Barred_Spanish_Mackerel\",\"name\":\"동갈삼치\",\"rank\":3,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Longnose_Sawshark\",\"name\":\"톱상어\",\"rank\":6,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Atlantic_Anglerfish\",\"name\":\"대서양아귀\",\"rank\":4,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Sally_Lightfoot_Crab\",\"name\":\"갈라파고스붉은게\",\"rank\":7,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Black_Tiger_Shrimp\",\"name\":\"블랙타이거새우\",\"rank\":5,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Smooth_Hammerhead\",\"name\":\"귀상어\",\"rank\":9,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Sailfish\",\"name\":\"돛새치\",\"rank\":9,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"California_Spiny_Lobster\",\"name\":\"캘리포니아닭새우\",\"rank\":5,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Tropical_Rock_Lobster\",\"name\":\"비단닭새우\",\"rank\":8,\"region\":\"블루홀 중간 수역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Chambered_Nautilus\",\"name\":\"앵무조개\",\"rank\":5,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Fangtooth\",\"name\":\"귀신고기\",\"rank\":5,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Frilled_Shark\",\"name\":\"주름상어\",\"rank\":7,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Bluespotted_Stargazer\",\"name\":\"푸렁통구멍\",\"rank\":6,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Rhinochimaeridae\",\"name\":\"코은상어\",\"rank\":6,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Spider_Crab\",\"name\":\"키다리게\",\"rank\":6,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Megamouth_Shark\",\"name\":\"메가마우스상어\",\"rank\":7,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Cookiecutter_Shark\",\"name\":\"쿠키커터상어\",\"rank\":6,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Clione\",\"name\":\"클리오네\",\"rank\":5,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Sea_Toad\",\"name\":\"점씬벵이\",\"rank\":5,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Salmon_Snailfish\",\"name\":\"분홍꼼치\",\"rank\":5,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Pacific_Fanfish\",\"name\":\"벤텐어\",\"rank\":5,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Threethooth_Puffer\",\"name\":\"불뚝복\",\"rank\":5,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Comb_Jelly\",\"name\":\"감투빗해파리\",\"rank\":6,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Blood_Belly_Comb_Jellyfish\",\"name\":\"붉은배빗해파리\",\"rank\":6,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Red_Bream\",\"name\":\"금눈돔\",\"rank\":5,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Norway_Lobster\",\"name\":\"네점발빨간새우\",\"rank\":5,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Eastern_Rock_Lobster\",\"name\":\"동부바위바닷가재\",\"rank\":8,\"region\":\"블루홀 심해\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Clearfin_Lionfish\",\"name\":\"방사쏠배감펭\",\"rank\":4,\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Longspine_Squirrelfish\",\"name\":\"롱스파인 다람쥐고기\",\"rank\":5,\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Longspine_Porcupinefish\",\"name\":\"가시복\",\"rank\":5,\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Box_Jellyfish\",\"name\":\"상자해파리\",\"rank\":5,\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Moray_Eel\",\"name\":\"곰치\",\"rank\":5,\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Blacktip_Reefshark\",\"name\":\"흑기흉상어\",\"rank\":6,\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Copper_Shark\",\"name\":\"무태상어\",\"rank\":6,\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Zebra_Shark\",\"name\":\"지브라상어\",\"rank\":8,\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"White_Shrimp\",\"name\":\"흰보리새우\",\"rank\":7,\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Red_Banded_Lobster\",\"name\":\"가시발새우\",\"rank\":5,\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Blue_Lobster\",\"name\":\"블루랍스터\",\"rank\":8,\"region\":\"블루홀 초입\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Blackfin_Barracuda\",\"name\":\"검정핀꼬치고기\",\"rank\":5,\"region\":\"블루홀 중간 수역\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Spear_Squid\",\"name\":\"화살오징어\",\"rank\":5,\"region\":\"블루홀 중간 수역\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Humboldt_Squid\",\"name\":\"훔볼트오징어\",\"rank\":8,\"region\":\"블루홀 중간 수역\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Devil_Scorpion_Fish\",\"name\":\"데빌스콜피온피쉬\",\"rank\":8,\"region\":\"블루홀 중간 수역\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Fan_Lobster\",\"name\":\"부채새우\",\"rank\":5,\"region\":\"블루홀 중간 수역\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Crystal_Lobster\",\"name\":\"크리스탈랍스터\",\"rank\":8,\"region\":\"블루홀 중간 수역\",\"time\":\"밤\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Peacock_Squid\",\"name\":\"공작오징어\",\"rank\":7,\"region\":\"빙하 통로\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Dumbo_Octopus\",\"name\":\"덤보문어\",\"rank\":7,\"region\":\"빙하 통로\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Barreleye\",\"name\":\"배럴아이\",\"rank\":7,\"region\":\"빙하 통로\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Blob_Fish\",\"name\":\"블롭피쉬\",\"rank\":7,\"region\":\"빙하 통로\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Vampire_Squid\",\"name\":\"흡혈오징어\",\"rank\":8,\"region\":\"빙하 통로\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Pelican_Eel\",\"name\":\"펠리칸장어\",\"rank\":9,\"region\":\"빙하 통로\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Arctic_Cod\",\"name\":\"극지대구\",\"rank\":8,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Gelatinous_Snailfish\",\"name\":\"남극꼼치\",\"rank\":8,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Antarctic_Octopus\",\"name\":\"남극문어\",\"rank\":9,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Greenland_Shark\",\"name\":\"그린란드상어\",\"rank\":9,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Polar_Eelpout\",\"name\":\"북극등가시치\",\"rank\":8,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Porbeagle_Shark\",\"name\":\"비악상어\",\"rank\":9,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Ice_Fish\",\"name\":\"아이스피쉬\",\"rank\":8,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Capelin\",\"name\":\"열빙어\",\"rank\":8,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Narwhal\",\"name\":\"일각고래\",\"rank\":9,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Haddock\",\"name\":\"해덕대구\",\"rank\":8,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Starry_Skate\",\"name\":\"땅가오리\",\"rank\":9,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Arctic_Telescope_Fish\",\"name\":\"북극 망원경 물고기\",\"rank\":8,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Alaska_Pollock\",\"name\":\"알래스카 명태\",\"rank\":8,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Lumpfish\",\"name\":\"럼프피쉬\",\"rank\":8,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Snub_Nosed_Spiny_Eel\",\"name\":\"들창코가시장어\",\"rank\":9,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Golden_King_Crab\",\"name\":\"황색왕게\",\"rank\":8,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Snow_Crab\",\"name\":\"대게\",\"rank\":8,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Horsehair_Crab\",\"name\":\"털게\",\"rank\":9,\"region\":\"빙하 지역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Waptia_Fieldensis\",\"name\":\"왑티아 필덴시스\",\"rank\":9,\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Pikaia\",\"name\":\"피카이아\",\"rank\":9,\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Allenypterus\",\"name\":\"알레니프테루스\",\"rank\":9,\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Qingmendous\",\"name\":\"칭멘도스\",\"rank\":9,\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Falcatus\",\"name\":\"팔카투스\",\"rank\":9,\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Drepanaspis\",\"name\":\"드레파나스피스\",\"rank\":9,\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Dunkleosteus\",\"name\":\"둔클레오스테우스\",\"rank\":9,\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Megalograptus\",\"name\":\"메갈로그랍투스\",\"rank\":9,\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Xenacanthus\",\"name\":\"제나칸투스\",\"rank\":9,\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Dollocaris_Ingens\",\"name\":\"돌로카리스인겐스\",\"rank\":8,\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Tokummia_Katalepsis\",\"name\":\"토큐미아카탈렙시스\",\"rank\":9,\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Anomalocaris\",\"name\":\"아노말로칼리스\",\"rank\":9,\"region\":\"열수 분출 구역\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Seahorse\",\"name\":\"해마\",\"rank\":4,\"region\":\"기타\",\"time\":\"낮\"}"));
            fishDtoList.add(new FishDto("{\"id\":\"Seadragon\",\"name\":\"해룡\",\"rank\":8,\"region\":\"기타\",\"time\":\"낮\"}"));
        }
    }

    @Getter
    public static class Region {
        List<FishDto.RegionDto> regionDtoList;

        public Region() {
            this.regionDtoList = new ArrayList<>();

            regionDtoList.add(new FishDto.RegionDto("BLUE_HOLE_SHALLOWS", "블루홀 초입", "cyan"));
            regionDtoList.add(new FishDto.RegionDto("BLUE_HOLE_MEDIUM_DEPTH", "블루홀 중간 수역", "blue"));
            regionDtoList.add(new FishDto.RegionDto("BLUE_HOLE_DEPTH", "블루홀 심해", "geekblue"));
            regionDtoList.add(new FishDto.RegionDto("GLACIER_PASSAGE", "빙하 통로", "dimgrey"));
            regionDtoList.add(new FishDto.RegionDto("GLACIER_ZONE", "빙하 지역", "deepskyblue"));
            regionDtoList.add(new FishDto.RegionDto("HYDROTHERMAL_VENTS", "열수 분출 구역", "volcano"));
            regionDtoList.add(new FishDto.RegionDto("ETC", "기타", "black"));
        }
    }

    @Getter
    public static class Time {
        List<FishDto.TimeDto> timeDtoList;

        public Time() {
            this.timeDtoList = new ArrayList<>();

            timeDtoList.add(new FishDto.TimeDto("DAY", "낮", "blue"));
            timeDtoList.add(new FishDto.TimeDto("NIGHT", "밤", "black"));
        }
    }

    @Getter
    public static class Plant {
        List<PlantDto> plantDtoList;

        public Plant() throws JSONException {
            this.plantDtoList = new ArrayList<>();

            plantDtoList.add(new PlantDto("{\"id\":\"Grade_A_Egg\",\"name\":\"1등급란\",\"rank\":4,\"source\":[\"텃밭\",\"오토\",\"장고\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Eggplant\",\"name\":\"가지\",\"rank\":4,\"source\":[\"텃밭\",\"오토\",\"장고\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Kajime\",\"name\":\"감태\",\"rank\":2,\"source\":[\"0 ~ 130m\",\"해초 농장\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Black_Coral\",\"name\":\"검은산호\",\"rank\":2,\"source\":[\"빙하 지역\",\"해초 농장\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Egg\",\"name\":\"계란\",\"rank\":4,\"source\":[\"텃밭\",\"오토\",\"장고\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Southern_Bull_Kelp\",\"name\":\"남부황소다시마\",\"rank\":2,\"source\":[\"빙하 지역\",\"해초 농장\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Kelp\",\"name\":\"다시마\",\"rank\":2,\"source\":[\"50 ~ 130m\",\"해초 농장\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Carrot\",\"name\":\"당근\",\"rank\":4,\"source\":[\"텃밭\",\"오토\",\"장고\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Garlic\",\"name\":\"마늘\",\"rank\":4,\"source\":[\"텃밭\",\"오토\",\"장고\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Seaweed\",\"name\":\"미역\",\"rank\":2,\"source\":[\"50 ~ 130m\",\"해초 농장\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Wheat\",\"name\":\"밀\",\"rank\":4,\"source\":[\"텃밭\",\"오토\",\"장고\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Buckbean\",\"name\":\"바다조름\",\"rank\":2,\"source\":[\"빙하 지역\",\"해초 농장\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Sea_Grape\",\"name\":\"바다포도\",\"rank\":2,\"source\":[\"종유 동굴\",\"해초 농장\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Cherry_Tomato\",\"name\":\"방울토마토\",\"rank\":4,\"source\":[\"텃밭\",\"오토\",\"장고\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Rice\",\"name\":\"백미\",\"rank\":3,\"source\":[\"텃밭\",\"오토\",\"장고\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Bladderwrack\",\"name\":\"블래더랙\",\"rank\":2,\"source\":[\"빙하 해초 동굴\",\"해초 농장\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Onion\",\"name\":\"양파\",\"rank\":4,\"source\":[\"텃밭\",\"오토\",\"장고\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Cucumber\",\"name\":\"오이\",\"rank\":4,\"source\":[\"텃밭\",\"오토\",\"장고\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Agar\",\"name\":\"우뭇가사리\",\"rank\":2,\"source\":[\"0 ~ 50m\",\"해초 농장\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Bean\",\"name\":\"콩\",\"rank\":4,\"source\":[\"텃밭\",\"오토\",\"장고\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Habanero\",\"name\":\"하바네로\",\"rank\":4,\"source\":[\"텃밭\",\"오토\",\"장고\"]}"));
            plantDtoList.add(new PlantDto("{\"id\":\"Hyalonema\",\"name\":\"히알로네마\",\"rank\":3,\"source\":[\"빙하 해초 동굴\",\"해초 농장\"]}"));
        }
    }

    @Getter
    public static class PlantSource {
        List<PlantDto.PlantSourceDto> plantSourceDtoList;

        public PlantSource() {
            this.plantSourceDtoList = new ArrayList<>();

            plantSourceDtoList.add(new PlantDto.PlantSourceDto("FARM", "텃밭", "darkgoldenrod"));
            plantSourceDtoList.add(new PlantDto.PlantSourceDto("BLUE_HOLE", "0 ~ 130m", "geekblue"));
            plantSourceDtoList.add(new PlantDto.PlantSourceDto("BLUE_HOLE_SHALLOWS", "0 ~ 50m", "cyan"));
            plantSourceDtoList.add(new PlantDto.PlantSourceDto("BLUE_HOLE_MEDIUM_DEPTH", "50 ~ 130m", "blue"));
            plantSourceDtoList.add(new PlantDto.PlantSourceDto("CAVE", "종유 동굴", "dimgrey"));
            plantSourceDtoList.add(new PlantDto.PlantSourceDto("GLACIAL", "빙하 지역", "deepskyblue"));
            plantSourceDtoList.add(new PlantDto.PlantSourceDto("GLACIAL_SEAWEED", "빙하 해초 동굴", "dodgerblue"));
            plantSourceDtoList.add(new PlantDto.PlantSourceDto("SEAWEED_FARM", "해초 농장", "forestgreen"));
            plantSourceDtoList.add(new PlantDto.PlantSourceDto("OTTO", "오토", "goldenrod"));
            plantSourceDtoList.add(new PlantDto.PlantSourceDto("DJANGO", "장고", "black"));
        }
    }

    @Getter
    public static class Seasoning {
        List<SeasoningDto> seasoningDtoList;

        public Seasoning() throws JSONException {
            this.seasoningDtoList = new ArrayList<>();

            seasoningDtoList.add(new SeasoningDto("{\"id\":\"Soy_Sauce\",\"name\":\"간장\",\"rank\":1,\"source\":[\"파견 & 요리 냄비\",\"장고\"]}"));
            seasoningDtoList.add(new SeasoningDto("{\"id\":\"Turmeric\",\"name\":\"강황\",\"rank\":1,\"source\":[\"파견 & 요리 냄비\",\"장고\"]}"));
            seasoningDtoList.add(new SeasoningDto("{\"id\":\"Mayonnaise\",\"name\":\"마요네즈\",\"rank\":1,\"source\":[\"파견 & 요리 냄비\",\"장고\"]}"));
            seasoningDtoList.add(new SeasoningDto("{\"id\":\"Miso\",\"name\":\"미소된장\",\"rank\":1,\"source\":[\"파견 & 요리 냄비\",\"장고\"]}"));
            seasoningDtoList.add(new SeasoningDto("{\"id\":\"Salt\",\"name\":\"소금\",\"rank\":1,\"source\":[\"파견 & 요리 냄비\",\"장고\"]}"));
            seasoningDtoList.add(new SeasoningDto("{\"id\":\"Olive_Oil\",\"name\":\"올리브오일\",\"rank\":1,\"source\":[\"파견 & 요리 냄비\",\"장고\"]}"));
            seasoningDtoList.add(new SeasoningDto("{\"id\":\"Sesame_Seed\",\"name\":\"참깨\",\"rank\":1,\"source\":[\"파견 & 요리 냄비\",\"장고\"]}"));
            seasoningDtoList.add(new SeasoningDto("{\"id\":\"Curry_Block\",\"name\":\"카레블럭\",\"rank\":1,\"source\":[\"파견 & 요리 냄비\",\"장고\"]}"));
            seasoningDtoList.add(new SeasoningDto("{\"id\":\"Truffle\",\"name\":\"트러플\",\"rank\":1,\"source\":[\"장고\"]}"));
            seasoningDtoList.add(new SeasoningDto("{\"id\":\"Black_Pepper\",\"name\":\"후추\",\"rank\":1,\"source\":[\"파견 & 요리 냄비\",\"장고\"]}"));
            seasoningDtoList.add(new SeasoningDto("{\"id\":\"Black_Vinegar\",\"name\":\"흑식초\",\"rank\":1,\"source\":[\"파견 & 요리 냄비\",\"장고\"]}"));
        }
    }

    @Getter
    public static class SeasoningSource {
        List<SeasoningDto.SeasoningSourceDto> seasoningSourceDtoList;

        public SeasoningSource() {
            this.seasoningSourceDtoList = new ArrayList<>();

            seasoningSourceDtoList.add(new SeasoningDto.SeasoningSourceDto("DISPATCH", "파견 & 요리 냄비", "darkblue"));
            seasoningSourceDtoList.add(new SeasoningDto.SeasoningSourceDto("DJANGO", "장고", "black"));
        }
    }

    @Getter
    public static class Dish {

        private final List<DishDto> dishDtoList;

        public Dish() throws JSONException {
            this.dishDtoList = new ArrayList<>();

            dishDtoList.add(new DishDto("{\"id\":\"Clownfish_Sushi\",\"name\":\"흰동가리 초밥\",\"maxCost\":7,\"maxScore\":120,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Comber_Sushi\",\"name\":\"콤버 초밥\",\"maxCost\":7,\"maxScore\":140,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Cardinal_Fish_Sushi\",\"name\":\"지중해카디널피쉬 초밥\",\"maxCost\":11,\"maxScore\":100,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Sea_Goldie_Sushi\",\"name\":\"금강바리\",\"maxCost\":11,\"maxScore\":130,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Pyramid_Butterflyfish_Sushi\",\"name\":\"안개나비고기 초밥\",\"maxCost\":14,\"maxScore\":100,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Yellow_Tang_Sushi\",\"name\":\"옐로우탱 초밥\",\"maxCost\":14,\"maxScore\":100,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Salema_Porgy_Sushi\",\"name\":\"사르파살파 초밥\",\"maxCost\":18,\"maxScore\":110,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Orbicular_Batfish_Fry\",\"name\":\"원반제비활치 튀김\",\"maxCost\":18,\"maxScore\":110,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Blue_Tang_Sushi\",\"name\":\"블루탱 초밥\",\"maxCost\":22,\"maxScore\":110,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Rainbow_Wrasse_Sushi\",\"name\":\"무지개놀래기 초밥\",\"maxCost\":22,\"maxScore\":130,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Lagoon_Triggerfish_Sushi\",\"name\":\"배주름쥐치 초밥\",\"maxCost\":22,\"maxScore\":130,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Small_Spotted_Dart_Sushi\",\"name\":\"빨판매가리 초밥\",\"maxCost\":29,\"maxScore\":120,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Yellowback_Fusilier_Sushi\",\"name\":\"황등어 초밥\",\"maxCost\":25,\"maxScore\":120,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Ornate_Wrasse_Sushi\",\"name\":\"오네이트놀래기 초밥\",\"maxCost\":29,\"maxScore\":130,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Longfin_Batfish_Sushi\",\"name\":\"깃털제비활치 초밥\",\"maxCost\":37,\"maxScore\":130,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Mediterranean_Parrotfish_Sushi\",\"name\":\"지중해비늘돔 초밥\",\"maxCost\":37,\"maxScore\":140,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Redtooth_Triggerfish_Sushi\",\"name\":\"붉은이빨쥐치 초밥\",\"maxCost\":33,\"maxScore\":150,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Black_And_White_Snapper_Sushi\",\"name\":\"블랙스내퍼 초밥\",\"maxCost\":33,\"maxScore\":150,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Green_Humphead_Parrotfish_Sushi\",\"name\":\"버팔로피쉬 초밥\",\"maxCost\":59,\"maxScore\":230,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Barrel_Jellyfish_Sushi\",\"name\":\"배럴해파리 군함 초밥\",\"maxCost\":37,\"maxScore\":160,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Fried_Egg_Jellyfish_Sushi\",\"name\":\"달걀프라이해파리 군함 초밥\",\"maxCost\":29,\"maxScore\":160,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Whitetip_Reefshark_Sushi\",\"name\":\"백기흉상어 초밥\",\"maxCost\":88,\"maxScore\":270,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Moray_Eel_Sushi\",\"name\":\"곰치 초밥\",\"maxCost\":185,\"maxScore\":250,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Red_Lionfish_Sushi\",\"name\":\"쏠배감펭 초밥\",\"maxCost\":37,\"maxScore\":200,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Titan_Triggerfish_Sushi\",\"name\":\"타이탄트리거피쉬 초밥\",\"maxCost\":55,\"maxScore\":200,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Blacktip_Reefshark_Sushi\",\"name\":\"흑기흉상어 초밥\",\"maxCost\":222,\"maxScore\":270,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Copper_Shark_Sushi\",\"name\":\"무태상어 초밥\",\"maxCost\":240,\"maxScore\":280,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Box_Jellyfish_Sushi\",\"name\":\"상자해파리 군함 초밥\",\"maxCost\":203,\"maxScore\":270,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Bluefin_Tuna_Akami_Sushi\",\"name\":\"참다랑어 붉은살 초밥\",\"maxCost\":296,\"maxScore\":240,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"참치 요트 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Bluefin_Tuna_Chutoro_Sushi\",\"name\":\"참다랑어 중뱃살 초밥\",\"maxCost\":351,\"maxScore\":241,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"참치 요트 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Bluefin_Tuna_Otoro_Sushi\",\"name\":\"참다랑어 대뱃살 초밥\",\"maxCost\":499,\"maxScore\":330,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"참치 요트 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Yellowfin_Tuna_Akami_Sushi\",\"name\":\"황다랑어 붉은살 초밥\",\"maxCost\":270,\"maxScore\":235,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"참치 요트 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Yellowfin_Tuna_Chutoro_Sushi\",\"name\":\"황다랑어 중뱃살 초밥\",\"maxCost\":333,\"maxScore\":238,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"참치 요트 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Yellowfin_Tuna_Otoro_Sushi\",\"name\":\"황다랑어 대뱃살 초밥\",\"maxCost\":462,\"maxScore\":315,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"참치 요트 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Flame_Angelfish_Sushi\",\"name\":\"라마엔젤피쉬 초밥\",\"maxCost\":18,\"maxScore\":150,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Sheepshead_Sushi\",\"name\":\"혹돔 초밥\",\"maxCost\":55,\"maxScore\":240,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Emperor_Angelfish_Sushi\",\"name\":\"황제엔젤피쉬 초밥\",\"maxCost\":37,\"maxScore\":150,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Stingray_Sushi\",\"name\":\"노랑가오리 초밥\",\"maxCost\":92,\"maxScore\":260,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Marbled_Electric_Ray_Sushi\",\"name\":\"마블전기가오리 초밥\",\"maxCost\":333,\"maxScore\":300,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Cooked_Whiteleg_Shrimp_Sushi\",\"name\":\"흰다리자숙새우 초밥\",\"maxCost\":129,\"maxScore\":220,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"새우 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Striped_Catfish_Sushi\",\"name\":\"쏠종개 초밥\",\"maxCost\":18,\"maxScore\":260,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Purple_Sea_Urchin_Sushi\",\"name\":\"보라성게 초밥\",\"maxCost\":222,\"maxScore\":270,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Shortfin_Mako_Sushi\",\"name\":\"청상아리 초밥\",\"maxCost\":388,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Zebra_Shark_Sushi\",\"name\":\"지브라상어 초밥\",\"maxCost\":399,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Marlin_Sushi\",\"name\":\"청새치 초밥\",\"maxCost\":341,\"maxScore\":370,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"청새치 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Thresher_Shark_Sushi\",\"name\":\"환도상어 초밥\",\"maxCost\":588,\"maxScore\":390,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"American_Lobster_Sushi\",\"name\":\"미국바닷가재 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"European_Lobster_Sushi\",\"name\":\"유럽바닷가재 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Bluehead_Tilefish_Sushi\",\"name\":\"블루헤드타일피쉬 초밥\",\"maxCost\":55,\"maxScore\":140,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Clown_Frogfish_Sushi\",\"name\":\"무당씬벵이 초밥\",\"maxCost\":55,\"maxScore\":150,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Painted_Comber_Sushi\",\"name\":\"페인티드콤버 초밥\",\"maxCost\":32,\"maxScore\":140,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Bigeye_Scad_Sushi\",\"name\":\"새가라지 초밥\",\"maxCost\":62,\"maxScore\":140,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Striped_Red_Mullet_Sushi\",\"name\":\"노랑촉수 초밥\",\"maxCost\":59,\"maxScore\":140,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Mackerel_Scad_Sushi\",\"name\":\"풀가라지 초밥\",\"maxCost\":55,\"maxScore\":150,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Harleqiun_Hind_Sushi\",\"name\":\"청줄바리 초밥\",\"maxCost\":66,\"maxScore\":180,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Bigeye_Trevally_Sushi\",\"name\":\"줄전갱이 초밥\",\"maxCost\":70,\"maxScore\":170,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Coral_Trout_Sushi\",\"name\":\"무늬바리 초밥\",\"maxCost\":66,\"maxScore\":170,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Grey_Triggerfish_Sushi\",\"name\":\"갈쥐치 초밥\",\"maxCost\":62,\"maxScore\":170,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Atlantic_Bonito_Sushi\",\"name\":\"대서양보니토 초밥\",\"maxCost\":77,\"maxScore\":180,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"White_Trevally_Sushi\",\"name\":\"흑점줄전갱이 초밥\",\"maxCost\":81,\"maxScore\":190,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Cuttlefish_Sushi\",\"name\":\"갑오징어 초밥\",\"maxCost\":74,\"maxScore\":200,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Dusky_Grouper_Sushi\",\"name\":\"머구리농어 초밥\",\"maxCost\":81,\"maxScore\":200,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Atlantic_Mackerel_Sushi\",\"name\":\"대서양고등어 초밥\",\"maxCost\":77,\"maxScore\":190,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Giant_Trevally_Sushi\",\"name\":\"무명갈전갱이 초밥\",\"maxCost\":111,\"maxScore\":250,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"White_Spotted_Jellyfish_Sushi\",\"name\":\"흰점박이해파리 군함 초밥\",\"maxCost\":66,\"maxScore\":180,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Tiger_Shark_Sushi\",\"name\":\"뱀상어 초밥\",\"maxCost\":185,\"maxScore\":290,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Great_Barracuda_Sushi\",\"name\":\"큰꼬치고기 초밥\",\"maxCost\":74,\"maxScore\":220,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Narrow_Barred_Spanish_Mackerel_Sushi\",\"name\":\"동갈삼치 초밥\",\"maxCost\":74,\"maxScore\":190,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Longnose_Sawshark_Sushi\",\"name\":\"톱상어 초밥\",\"maxCost\":129,\"maxScore\":290,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Atlantic_Anglerfish_Sushi\",\"name\":\"대서양아귀 초밥\",\"maxCost\":76,\"maxScore\":240,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Sally_Lightfoot_Crab_Sushi\",\"name\":\"갈라파고스붉은게살 초밥\",\"maxCost\":185,\"maxScore\":320,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Raw_Black_Tiger_Shrimp_Sushi\",\"name\":\"블랙타이거생새우 초밥\",\"maxCost\":185,\"maxScore\":240,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"새우 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Smooth_Hammerhead_Sushi\",\"name\":\"귀상어 초밥\",\"maxCost\":521,\"maxScore\":390,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Sailfish_Sushi\",\"name\":\"돛새치 초밥\",\"maxCost\":336,\"maxScore\":400,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"청새치 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"California_Spiny_Lobster_Sushi\",\"name\":\"캘리포니아닭새우 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Tropical_Rock_Lobster_Sushi\",\"name\":\"비단닭새우 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Clearfin_Lionfish_Sushi\",\"name\":\"방사쏠배감펭 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Longspine_Squirrelfish_Sushi\",\"name\":\"롱스파인 다람쥐고기 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"White_Shrimp_Sushi\",\"name\":\"흰보리새우 초밥\",\"maxCost\":196,\"maxScore\":280,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"새우 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Red_Banded_Lobster_Sushi\",\"name\":\"가시발새우 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Blue_Lobster_Sushi\",\"name\":\"블루랍스터 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Blackfin_Barracuda_Sushi\",\"name\":\"검정핀꼬치고기 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Spear_Squid_Sushi\",\"name\":\"화살오징어 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Humboldt_Squid_Sushi\",\"name\":\"훔볼트오징어 초밥\",\"maxCost\":536,\"maxScore\":350,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Devil_Scorpion_Fish_Sushi\",\"name\":\"데빌스콜피온피쉬 초밥\",\"maxCost\":499,\"maxScore\":350,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Fan_Lobster_Sushi\",\"name\":\"부채새우 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Crystal_Lobster_Sushi\",\"name\":\"크리스탈랍스터 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Chambered_Nautilus_Sushi\",\"name\":\"앵무조개 초밥\",\"maxCost\":129,\"maxScore\":220,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Fangtooth_Sushi\",\"name\":\"귀신고기 초밥\",\"maxCost\":166,\"maxScore\":260,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Frilled_Shark_Sushi\",\"name\":\"주름상어 초밥\",\"maxCost\":314,\"maxScore\":280,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Bluespotted_Stargazer_Sushi\",\"name\":\"푸렁통구멍 초밥\",\"maxCost\":199,\"maxScore\":280,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Rhinochimaeridae_Sushi\",\"name\":\"코은상어 초밥\",\"maxCost\":333,\"maxScore\":290,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Spider_Crab_Sushi\",\"name\":\"키다리게 초밥\",\"maxCost\":185,\"maxScore\":290,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Megamouth_Shark_Sushi\",\"name\":\"메가마우스상어 초밥\",\"maxCost\":351,\"maxScore\":300,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Cookiecutter_Shark_Sushi\",\"name\":\"쿠키커터상어 초밥\",\"maxCost\":277,\"maxScore\":270,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Clione_Sushi\",\"name\":\"클리오네 초밥\",\"maxCost\":129,\"maxScore\":220,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Sea_Toad_Sushi\",\"name\":\"점씬벵이 초밥\",\"maxCost\":203,\"maxScore\":230,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Salmon_Snailfish_Sushi\",\"name\":\"분홍꼼치 초밥\",\"maxCost\":222,\"maxScore\":230,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Pacific_Fanfish_Sushi\",\"name\":\"벤텐어 초밥\",\"maxCost\":240,\"maxScore\":240,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Threetooth_Puffer_Sushi\",\"name\":\"불뚝복 초밥\",\"maxCost\":259,\"maxScore\":250,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Comb_Jelly_Sushi\",\"name\":\"감투빗해파리 초밥\",\"maxCost\":166,\"maxScore\":250,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Blood_belly_Comb_Jelly_Sushi\",\"name\":\"붉은배빗해파리 초밥\",\"maxCost\":185,\"maxScore\":250,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Red_Bream_Sushi\",\"name\":\"금눈돔 초밥\",\"maxCost\":129,\"maxScore\":270,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Norway_Lobster_Sushi\",\"name\":\"네점발빨간새우 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Eastern_Rock_Lobster_Sushi\",\"name\":\"동부바위바닷가재 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Peacock_Squid_Sushi\",\"name\":\"공작오징어 초밥\",\"maxCost\":277,\"maxScore\":290,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Dumbo_Octopus_Sushi\",\"name\":\"덤보문어 초밥\",\"maxCost\":296,\"maxScore\":330,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Barreleye_Sushi\",\"name\":\"배럴아이 초밥\",\"maxCost\":259,\"maxScore\":280,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Blob_Fish_Sushi\",\"name\":\"블롭피쉬 초밥\",\"maxCost\":444,\"maxScore\":310,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Vampire_Squid_Sushi\",\"name\":\"흡혈오징어\",\"maxCost\":425,\"maxScore\":340,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Pelican_Eel_Sushi\",\"name\":\"펠리칸장어 초밥\",\"maxCost\":666,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Arctic_Cod_Sushi\",\"name\":\"극지대구 초밥\",\"maxCost\":351,\"maxScore\":340,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Gelatinous_Snailfish_Sushi\",\"name\":\"남극꼼치 초밥\",\"maxCost\":314,\"maxScore\":330,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Antarctic_Octopus_Sushi\",\"name\":\"남극문어 초밥\",\"maxCost\":444,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Greenland_Shark_Sushi\",\"name\":\"그린란드상어 초밥\",\"maxCost\":592,\"maxScore\":370,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Polar_Eelpout_Sushi\",\"name\":\"북극등가시치 초밥\",\"maxCost\":333,\"maxScore\":320,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Porbeagle_Shark_Sushi\",\"name\":\"비악상어 초밥\",\"maxCost\":610,\"maxScore\":380,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Ice_Fish_Sushi\",\"name\":\"아이스피쉬 초밥\",\"maxCost\":351,\"maxScore\":320,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Capelin_Sushi\",\"name\":\"열빙어 초밥\",\"maxCost\":166,\"maxScore\":330,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Narwhal_Sushi\",\"name\":\"일각고래 초밥\",\"maxCost\":518,\"maxScore\":400,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Haddock_Sushi\",\"name\":\"해덕대구 초밥\",\"maxCost\":407,\"maxScore\":340,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Starry_Skate_Sushi\",\"name\":\"땅가오리 초밥\",\"maxCost\":481,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Arctic_Telescope_Fish_Sushi\",\"name\":\"북극 망원경 물고기 초밥\",\"maxCost\":444,\"maxScore\":350,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Alaska_Pollock_Sushi\",\"name\":\"알래스카 명태 초밥\",\"maxCost\":499,\"maxScore\":380,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Lumpfish_Sushi\",\"name\":\"럼프피쉬 초밥\",\"maxCost\":444,\"maxScore\":370,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Snub_Nosed_Spiny_Eel_Sushi\",\"name\":\"들창코가시장어 초밥\",\"maxCost\":666,\"maxScore\":390,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Golden_King_Crab_Sushi\",\"name\":\"황색왕게 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Snow_Crab_Sushi\",\"name\":\"대게 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Horsehair_Crab_Sushi\",\"name\":\"털게 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Waptia_Sushi\",\"name\":\"왑티아 초밥\",\"maxCost\":381,\"maxScore\":400,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"새우 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Pikaia_Sushi\",\"name\":\"피카이아 초밥\",\"maxCost\":425,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Allenypterus_Sushi\",\"name\":\"알레니프테루스 초밥\",\"maxCost\":462,\"maxScore\":360,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Qingmendous_Sushi\",\"name\":\"칭멘도스 초밥\",\"maxCost\":444,\"maxScore\":310,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Falcatus_Sushi\",\"name\":\"팔카투스 초밥\",\"maxCost\":481,\"maxScore\":380,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Drepanaspis_Sushi\",\"name\":\"드레파나스피스 초밥\",\"maxCost\":555,\"maxScore\":400,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Dunkleosteus_Sushi\",\"name\":\"둔클레오스테우스 초밥\",\"maxCost\":629,\"maxScore\":420,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Megalograptus_Sushi\",\"name\":\"메갈로그랍투스 초밥\",\"maxCost\":518,\"maxScore\":400,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Xenacanthus_Sushi\",\"name\":\"제나칸투스 초밥\",\"maxCost\":592,\"maxScore\":430,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Dollocaris_Ingens_Sushi\",\"name\":\"돌로카리스인겐스 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Tokummia_Katalepsis_Sushi\",\"name\":\"토큐미아카탈렙시스 초밥\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Young_Anomalocaris_Sushi\",\"name\":\"아노말로칼리스 새끼 초밥\",\"maxCost\":224,\"maxScore\":125,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Seahorse_Sewers\",\"name\":\"해마 꼬치구이\",\"maxCost\":111,\"maxScore\":220,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Seadragon_Onigiri\",\"name\":\"해룡 주먹밥\",\"maxCost\":388,\"maxScore\":470,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Whole_Roasted_Shark_Head\",\"name\":\"백기흉상어 머리 통구이\",\"unlock\":\"요시에 방문\",\"maxCost\":196,\"maxScore\":150,\"maxCount\":7,\"maxLevel\":10,\"flame\":3,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Falcatus_Soybean_Paste_Soup\",\"name\":\"팔카투스 된장국\",\"unlock\":\"열수 분출 구역 진입\",\"maxCost\":1554,\"maxScore\":382,\"maxCount\":7,\"maxLevel\":10,\"flame\":15,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Pikaia_Ramen\",\"name\":\"피카이아 라멘\",\"unlock\":\"열수 분출 구역 진입\",\"maxCost\":1554,\"maxScore\":360,\"maxCount\":10,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Steamed_Hyalonema_Angler_Fish\",\"name\":\"히알로네마 아귀찜\",\"unlock\":\"츠치 구조\",\"maxCost\":1650,\"maxScore\":248,\"maxCount\":1,\"maxLevel\":5,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Hyalonema_Tuna_Sashimi\",\"name\":\"히알로네마 참치회\",\"unlock\":\"츠치 구조\",\"maxCost\":1683,\"maxScore\":265,\"maxCount\":1,\"maxLevel\":5,\"flame\":15,\"party\":[\"참치 요트 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Seagrapes_Jellyfish_Sushi\",\"name\":\"바다포도 해파리 초밥\",\"unlock\":\"빈센트 접대 성공\",\"maxCost\":832,\"maxScore\":280,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"해파리 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Tropical_Fish_Sushi_Set\",\"name\":\"화려한 특초밥 세트\",\"unlock\":\"마이클 방 접대 성공\",\"maxCost\":1387,\"maxScore\":346,\"maxCount\":9,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Vegetable_Sushi\",\"name\":\"채소 초밥\",\"unlock\":\"새미 접대 성공\",\"maxCost\":1387,\"maxScore\":390,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Hotpeppertuna\",\"name\":\"핫페퍼튜나\",\"unlock\":\"방랑 상인 장고 방문\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Boiled_Asian_Sheepshead_Wrasse_And_Truffle\",\"name\":\"트러플 혹돔 조림\",\"unlock\":\"방랑 상인 장고 접대 성공\",\"maxCost\":1661,\"maxScore\":280,\"maxCount\":2,\"maxLevel\":5}"));
            dishDtoList.add(new DishDto("{\"id\":\"Sweet_And_Sour_Stargazer\",\"name\":\"푸렁통구멍 탕수어\",\"unlock\":\"왕팡 대결 승리\",\"maxCost\":1443,\"maxScore\":395,\"maxCount\":6,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Fried_Rice_With_Galapagos_Red_Crab\",\"name\":\"갈라파고스붉은게 볶음밥\",\"unlock\":\"왕팡 대결 승리\",\"maxCost\":1424,\"maxScore\":305,\"maxCount\":10,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Blobfish_Spring_Roll\",\"name\":\"블롭피쉬 춘권\",\"unlock\":\"왕팡 대결 승리\",\"maxCost\":1387,\"maxScore\":322,\"maxCount\":10,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Tomato_Egg_Soup\",\"name\":\"토마토 계란탕\",\"unlock\":\"왕팡 대결 승리\",\"maxCost\":1406,\"maxScore\":309,\"maxCount\":12,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Mianbao_Xia\",\"name\":\"멘보샤\",\"unlock\":\"왕팡 대결 승리\",\"maxCost\":1387,\"maxScore\":305,\"maxCount\":10,\"maxLevel\":10,\"flame\":7,\"party\":[\"새우 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Fried_Tomato_And_Snailfish\",\"name\":\"토마토 꼼치 볶음\",\"unlock\":\"왕팡 대결 승리\",\"maxCost\":1443,\"maxScore\":335,\"maxCount\":1,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Deep_Fish_Tempura\",\"name\":\"심해어 덴뿌라\",\"unlock\":\"알렉스 대결 승리\",\"maxCost\":1461,\"maxScore\":320,\"maxCount\":7,\"maxLevel\":10,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Plotosid_Pie\",\"name\":\"쏠종개 파이\",\"unlock\":\"알렉스 대결 승리\",\"maxCost\":1424,\"maxScore\":420,\"maxCount\":7,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Pelican_Eel_Jelly\",\"name\":\"펠리칸장어 젤리\",\"unlock\":\"알렉스 대결 승리\",\"maxCost\":1380,\"maxScore\":439,\"maxCount\":9,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Smoked_Atlantic_Mackerel_Scramble\",\"name\":\"훈제 대서양고등어 스크램블\",\"unlock\":\"알렉스 대결 승리\",\"maxCost\":1431,\"maxScore\":460,\"maxCount\":6,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Comber_Sandwich\",\"name\":\"콤버 샌드위치\",\"unlock\":\"알렉스 대결 승리\",\"maxCost\":1443,\"maxScore\":420,\"maxCount\":6,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Humboldt_Ink_Pasta\",\"name\":\"훔볼트 먹물 파스타\",\"unlock\":\"파스트로 대결 승리\",\"maxCost\":1554,\"maxScore\":375,\"maxCount\":10,\"maxLevel\":10,\"party\":[\"새우 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Narrow_Barred_Spanish_Mackerel_Arancini\",\"name\":\"동갈삼치 아란치니\",\"unlock\":\"파스트로 대결 승리\",\"maxCost\":1443,\"maxScore\":364,\"maxCount\":7,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Antarctic_Octopus_Carpaccio\",\"name\":\"남극문어 카르파초\",\"unlock\":\"파스트로 대결 승리\",\"maxCost\":1498,\"maxScore\":408,\"maxCount\":7,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Arctic_Cod_Risotto\",\"name\":\"극지대구 리조토\",\"unlock\":\"파스트로 대결 승리\",\"maxCost\":1509,\"maxScore\":377,\"maxCount\":9,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Peacock_Squid_Ripieni\",\"name\":\"공작오징어 리피에니\",\"unlock\":\"파스트로 대결 승리\",\"maxCost\":1517,\"maxScore\":360,\"maxCount\":7,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Haddock_Acqua_Pazza\",\"name\":\"해덕대구 아쿠아파짜\",\"unlock\":\"파스트로 대결 승리\",\"maxCost\":1498,\"maxScore\":400,\"maxCount\":9,\"maxLevel\":10,\"flame\":7}"));
            dishDtoList.add(new DishDto("{\"id\":\"Boiled_Yellowback_Fusilier\",\"name\":\"황등어 간장조림\",\"unlock\":\"쿡스타 브론즈 달성\",\"maxCost\":185,\"maxScore\":255,\"maxCount\":7,\"maxLevel\":10,\"flame\":3}"));
            dishDtoList.add(new DishDto("{\"id\":\"Salt_Grilled_Redtoothed_Triggerfish\",\"name\":\"붉은이빨쥐치 소금구이\",\"unlock\":\"쿡스타 브론즈 달성\",\"maxCost\":177,\"maxScore\":241,\"maxCount\":6,\"maxLevel\":10,\"flame\":3}"));
            dishDtoList.add(new DishDto("{\"id\":\"Agar_Tokoroten\",\"name\":\"도코로텐\",\"unlock\":\"쿡스타 브론즈 달성\",\"maxCost\":188,\"maxScore\":266,\"maxCount\":7,\"maxLevel\":10,\"flame\":3}"));
            dishDtoList.add(new DishDto("{\"id\":\"Seasoned_Kajime\",\"name\":\"감태 초무침\",\"unlock\":\"쿡스타 브론즈 달성\",\"maxCost\":185,\"maxScore\":245,\"maxCount\":6,\"maxLevel\":10,\"flame\":3}"));
            dishDtoList.add(new DishDto("{\"id\":\"Moray_Eel_Curry\",\"name\":\"곰치 커리\",\"unlock\":\"쿡스타 실버 달성\",\"maxCost\":351,\"maxScore\":273,\"maxCount\":6,\"maxLevel\":10,\"flame\":3,\"party\":[\"카레 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Striped_Red_Mullet_Tangle_Roll\",\"name\":\"노랑촉수 다시마 말이\",\"unlock\":\"쿡스타 실버 달성\",\"maxCost\":296,\"maxScore\":270,\"maxCount\":7,\"maxLevel\":10,\"flame\":6}"));
            dishDtoList.add(new DishDto("{\"id\":\"White_Trevally_Kombu_Ochazuke\",\"name\":\"다시마 흑점줄전갱이 오차즈케\",\"unlock\":\"쿡스타 실버 달성\",\"maxCost\":344,\"maxScore\":266,\"maxCount\":7,\"maxLevel\":10,\"flame\":6}"));
            dishDtoList.add(new DishDto("{\"id\":\"Stellate_Puffer_Special_Sushi\",\"name\":\"복어 특초밥\",\"unlock\":\"쿡스타 골드 달성\",\"maxCost\":814,\"maxScore\":340,\"maxCount\":1,\"maxLevel\":10,\"flame\":6}"));
            dishDtoList.add(new DishDto("{\"id\":\"Seagrapes_Special_Sushi\",\"name\":\"바다포도 특초밥\",\"unlock\":\"쿡스타 골드 달성\",\"maxCost\":740,\"maxScore\":390,\"maxCount\":1,\"maxLevel\":10,\"flame\":6}"));
            dishDtoList.add(new DishDto("{\"id\":\"Trout_Sea_Grapes_Ricebowl\",\"name\":\"바다포도 무늬바리 회덮밥\",\"unlock\":\"쿡스타 골드 달성\",\"maxCost\":647,\"maxScore\":290,\"maxCount\":7,\"maxLevel\":10,\"flame\":9}"));
            dishDtoList.add(new DishDto("{\"id\":\"Big_Eyed_Scad_And_Soybean_Paste_Roast\",\"name\":\"새가라지 된장구이\",\"unlock\":\"쿡스타 골드 달성\",\"maxCost\":684,\"maxScore\":348,\"maxCount\":7,\"maxLevel\":10,\"flame\":9}"));
            dishDtoList.add(new DishDto("{\"id\":\"Seahorse_Udon\",\"name\":\"해마 우동\",\"unlock\":\"쿡스타 플래티넘 달성\",\"maxCost\":1387,\"maxScore\":353,\"maxCount\":4,\"maxLevel\":10,\"flame\":9}"));
            dishDtoList.add(new DishDto("{\"id\":\"Black_Vinegar_Braised_Parrotfish\",\"name\":\"비늘돔 흑식초 조림\",\"unlock\":\"쿡스타 플래티넘 달성\",\"maxCost\":1424,\"maxScore\":406,\"maxCount\":6,\"maxLevel\":10,\"flame\":9}"));
            dishDtoList.add(new DishDto("{\"id\":\"Atlantic_Bonito_Curry\",\"name\":\"대서양보니토 커리\",\"unlock\":\"쿡스타 플래티넘 달성\",\"maxCost\":1406,\"maxScore\":389,\"maxCount\":7,\"maxLevel\":10,\"flame\":12,\"party\":[\"카레 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Humphead_Parrotfish_Curry\",\"name\":\"버팔로피쉬 커리\",\"unlock\":\"쿡스타 플래티넘 달성\",\"maxCost\":1387,\"maxScore\":347,\"maxCount\":6,\"maxLevel\":10,\"flame\":12,\"party\":[\"카레 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Great_Barracuda_Canape\",\"name\":\"큰꼬치고기 카나페\",\"unlock\":\"쿡스타 다이아몬드 달성\",\"maxCost\":1572,\"maxScore\":372,\"maxCount\":6,\"maxLevel\":10,\"flame\":12}"));
            dishDtoList.add(new DishDto("{\"id\":\"Nasu_Dengaku\",\"name\":\"나스 덴가쿠\",\"unlock\":\"쿡스타 다이아몬드 달성\",\"maxCost\":1535,\"maxScore\":317,\"maxCount\":4,\"maxLevel\":10,\"flame\":12}"));
            dishDtoList.add(new DishDto("{\"id\":\"Dumbo_Takoyaki\",\"name\":\"덤보 타코야끼\",\"unlock\":\"쿡스타 다이아몬드 달성\",\"maxCost\":1554,\"maxScore\":390,\"maxCount\":9,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Rice_With_Great_Spider_Crab_Meat\",\"name\":\"키다리게 덮밥 \",\"unlock\":\"쿡스타 다이아몬드 달성\",\"maxCost\":1517,\"maxScore\":330,\"maxCount\":7,\"maxLevel\":10,\"flame\":12}"));
            dishDtoList.add(new DishDto("{\"id\":\"Bluefin_Tuna_Rice_Bowl\",\"name\":\"마구로동\",\"unlock\":\"참치 요트 파티 시작\",\"maxCost\":1332,\"maxScore\":400,\"maxCount\":9,\"maxLevel\":10,\"flame\":5,\"party\":[\"참치 요트 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Hawaiian_Poke\",\"name\":\"하와이안 포케\",\"unlock\":\"참치 요트 파티 시작\",\"maxCost\":980,\"maxScore\":348,\"maxCount\":9,\"maxLevel\":10,\"flame\":5,\"party\":[\"참치 요트 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Yellowfin_Tuna_Steak\",\"name\":\"황다랑어 스테이크\",\"unlock\":\"참치 요트 파티 시작\",\"maxCost\":1128,\"maxScore\":332,\"maxCount\":9,\"maxLevel\":10,\"flame\":5,\"party\":[\"참치 요트 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Marlin_And_Soybean_Paste_Roast\",\"name\":\"청새치 된장구이\",\"unlock\":\"청새치 파티 시작\",\"maxCost\":1406,\"maxScore\":272,\"maxCount\":9,\"maxLevel\":10,\"flame\":5,\"party\":[\"청새치 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Boiled_Sailfish_And_Seaweed\",\"name\":\"돛새치 해초조림\",\"unlock\":\"청새치 파티 시작\",\"maxCost\":1572,\"maxScore\":300,\"maxCount\":9,\"maxLevel\":10,\"flame\":5,\"party\":[\"청새치 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Pickled_Vegetables\",\"name\":\"채소절임\",\"unlock\":\"오이 파티 시작\",\"maxCost\":1169,\"maxScore\":364,\"maxCount\":3,\"maxLevel\":10,\"party\":[\"오이 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Deep_Fried_Vegetables\",\"name\":\"채소튀김\",\"unlock\":\"오이 파티 시작\",\"maxCost\":1154,\"maxScore\":396,\"maxCount\":3,\"maxLevel\":10,\"party\":[\"오이 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Skewered_Cucumber\",\"name\":\"오이꼬치\",\"unlock\":\"오이 파티 시작\",\"maxCost\":1184,\"maxScore\":340,\"maxCount\":1,\"maxLevel\":10,\"party\":[\"오이 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Sea_Toad_And_Cucumber_Gunkan_Sushi\",\"name\":\"점씬벵이 오이 군함 초밥\",\"unlock\":\"오이 파티 시작\",\"maxCost\":1184,\"maxScore\":367,\"maxCount\":1,\"maxLevel\":10,\"flame\":5,\"party\":[\"오이 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Great_Spider_Crab_And_Cucumber_Sushi\",\"name\":\"키다리게 오이 초밥\",\"unlock\":\"오이 파티 시작\",\"maxCost\":1198,\"maxScore\":385,\"maxCount\":1,\"maxLevel\":10,\"flame\":5,\"party\":[\"오이 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Trevally_Sandwich\",\"name\":\"전갱이 샌드\",\"unlock\":\"오이 파티 시작\",\"maxCost\":1154,\"maxScore\":260,\"maxCount\":7,\"maxLevel\":10,\"flame\":5,\"party\":[\"오이 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Seasoned_Waptia_Fieldensis\",\"name\":\"왑티아 필덴시스 초무침\",\"unlock\":\"오이 파티 시작\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":10,\"flame\":15,\"party\":[\"오이 파티\",\"새우 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Stir_Fried_Habanero_Lobster\",\"name\":\"하바네로 가재 볶음\",\"unlock\":\"랍스터 파티 시작\",\"maxCost\":1443,\"maxScore\":320,\"maxCount\":6,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Steamed_Eastern_Rock_Lobster_And_Egg\",\"name\":\"동부바위바닷가재 계란찜\",\"unlock\":\"랍스터 파티 시작\",\"maxCost\":1406,\"maxScore\":455,\"maxCount\":7,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Crystal_Lobster_Roll\",\"name\":\"크리스탈랍스터 롤\",\"unlock\":\"랍스터 파티 시작\",\"maxCost\":1369,\"maxScore\":305,\"maxCount\":9,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Stellate_Puffer_Nicogori\",\"name\":\"복어 니코고리\",\"unlock\":\"직원 Lv.5 달성\",\"maxCost\":666,\"maxScore\":381,\"maxCount\":7,\"maxLevel\":10,\"flame\":8}"));
            dishDtoList.add(new DishDto("{\"id\":\"Special_Fried_Shrimp_Sushi\",\"name\":\"새우튀김 특초밥\",\"unlock\":\"드레 Lv.5 달성\",\"maxCost\":1406,\"maxScore\":317,\"maxCount\":1,\"maxLevel\":10,\"flame\":8,\"party\":[\"새우 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Boiled_And_Deep_Fried_White_Shrimp\",\"name\":\"흰다리자숙새우 튀김\",\"unlock\":\"랩터 Lv.5 달성\",\"maxCost\":832,\"maxScore\":330,\"maxCount\":10,\"maxLevel\":10,\"flame\":8,\"party\":[\"새우 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Smallspotted_Dart_Kajime_Soup\",\"name\":\"빨판매가리 감태국\",\"unlock\":\"마키 Lv.5 달성\",\"maxCost\":555,\"maxScore\":367,\"maxCount\":7,\"maxLevel\":10,\"flame\":8}"));
            dishDtoList.add(new DishDto("{\"id\":\"Fried_Seahorses\",\"name\":\"해마 튀김\",\"unlock\":\"코카니지 Lv.5 달성\",\"maxCost\":814,\"maxScore\":362,\"maxCount\":4,\"maxLevel\":10,\"flame\":8}"));
            dishDtoList.add(new DishDto("{\"id\":\"Roasted_Capelin\",\"name\":\"열빙어 구이\",\"unlock\":\"드레 Lv.10 달성\",\"maxCost\":1443,\"maxScore\":345,\"maxCount\":7,\"maxLevel\":10,\"flame\":12,\"party\":[\"카레 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Rice_With_Purple_Sea_Urchin_Sushi\",\"name\":\"보라성게 덮밥\",\"unlock\":\"랩터 Lv.10 달성\",\"maxCost\":1424,\"maxScore\":320,\"maxCount\":4,\"maxLevel\":10,\"flame\":12}"));
            dishDtoList.add(new DishDto("{\"id\":\"Deep_Fried_Luna_Lionfish\",\"name\":\"쏠배감펭 튀김\",\"unlock\":\"코카니지 Lv.10 달성\",\"maxCost\":1443,\"maxScore\":366,\"maxCount\":4,\"maxLevel\":10,\"flame\":12}"));
            dishDtoList.add(new DishDto("{\"id\":\"Narwhal_Miso_Soup\",\"name\":\"일각고래 미소된장국\",\"unlock\":\"다비나 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":420,\"maxCount\":12,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Ice_Fish_Curry\",\"name\":\"아이스피쉬 커리\",\"unlock\":\"드레 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":317,\"maxCount\":9,\"maxLevel\":10,\"flame\":15,\"party\":[\"카레 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Boiled_Porbeagle_Shark\",\"name\":\"비악상어 조림\",\"unlock\":\"라울 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":332,\"maxCount\":7,\"maxLevel\":10,\"flame\":15,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Fried_Onion_Cuttlefish\",\"name\":\"갑오징어 어니언링\",\"unlock\":\"랩터 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":360,\"maxCount\":7,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Three_Colored_Squid_Roast\",\"name\":\"삼색오징어구이\",\"unlock\":\"리우 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":335,\"maxCount\":12,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Latok_Omelet\",\"name\":\"바다포도 계란덮밥\",\"unlock\":\"마사요시 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":260,\"maxCount\":9,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Trevally_Nanbanzuke\",\"name\":\"전갱이 난반즈케\",\"unlock\":\"마키 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":343,\"maxCount\":7,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Batfish_Ricebowl\",\"name\":\"활치 오야코동\",\"unlock\":\"미첼 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":447,\"maxCount\":7,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Crimson_Fish_Roll\",\"name\":\"다홍빛 생선 롤\",\"unlock\":\"빌리 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":285,\"maxCount\":9,\"maxLevel\":10,\"flame\":15,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Dusky_Grouper_Steak\",\"name\":\"머구리농어 스테이크\",\"unlock\":\"엘 니뇨 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":328,\"maxCount\":7,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Seahorse_Salad\",\"name\":\"해마해초 샐러드\",\"unlock\":\"요네 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":295,\"maxCount\":6,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Deep_Fried_Eggplant_Shrimp_Meatballs\",\"name\":\"가지 새우완자 튀김\",\"unlock\":\"유스케 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":460,\"maxCount\":7,\"maxLevel\":10,\"flame\":15,\"party\":[\"새우 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Shark_Karaage\",\"name\":\"상어 가라아게\",\"unlock\":\"이츠키 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":380,\"maxCount\":9,\"maxLevel\":10,\"flame\":15,\"party\":[\"스톰 샤크 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Wrasse_Curry\",\"name\":\"놀래기 커리\",\"unlock\":\"잔디 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":330,\"maxCount\":6,\"maxLevel\":10,\"flame\":15,\"party\":[\"카레 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Seasoned_Jellyfish\",\"name\":\"해파리 무침\",\"unlock\":\"제임스 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":298,\"maxCount\":6,\"maxLevel\":10,\"flame\":15,\"party\":[\"해파리 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Great_Spider_Crab_Curry\",\"name\":\"키다리게 커리\",\"unlock\":\"찰리 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":290,\"maxCount\":9,\"maxLevel\":10,\"flame\":15,\"party\":[\"카레 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Dried_Stingray\",\"name\":\"가오리포\",\"unlock\":\"카롤리나 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":225,\"maxCount\":12,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Mackerel_Scad_Hotdog\",\"name\":\"풀가라지 핫도그\",\"unlock\":\"코카니지 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":340,\"maxCount\":6,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Rice_With_White_Shrimp_Meat\",\"name\":\"흰보리새우 덮밥\",\"unlock\":\"쿄코 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":400,\"maxCount\":9,\"maxLevel\":10,\"flame\":15,\"party\":[\"새우 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Roasted_Tropical_Fish_And_Garlic\",\"name\":\"열대어 마늘구이\",\"unlock\":\"토호쿠 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":236,\"maxCount\":9,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Seaweed_Rolled_Omelet\",\"name\":\"해초 계란말이\",\"unlock\":\"파이 Lv.15 달성\",\"maxCost\":1480,\"maxScore\":300,\"maxCount\":9,\"maxLevel\":10,\"flame\":15}"));
            dishDtoList.add(new DishDto("{\"id\":\"Fried_Habanero_FangTooth\",\"name\":\"하바네로 귀신고기 튀김\",\"unlock\":\"비밀 레시피\",\"maxCost\":1517,\"maxScore\":420,\"maxCount\":7,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Moonlight_Bladderwrack_Roll\",\"name\":\"달빛 블래더랙 롤\",\"unlock\":\"비밀 레시피\",\"maxCost\":1498,\"maxScore\":360,\"maxCount\":9,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Secret_1\",\"name\":\"하바네로 장어 구이\",\"unlock\":\"비밀 레시피\",\"maxCost\":1572,\"maxScore\":335,\"maxCount\":9,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Lobster_Platter\",\"name\":\"랍스터 플래터\",\"unlock\":\"비밀 레시피\",\"maxCost\":1609,\"maxScore\":375,\"maxCount\":6,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Pufferfish_Dumpling_Soup\",\"name\":\"복어 완자탕\",\"unlock\":\"비밀 레시피\",\"maxCost\":1554,\"maxScore\":420,\"maxCount\":9,\"maxLevel\":10}"));
            dishDtoList.add(new DishDto("{\"id\":\"Soy_Sauce_Marinated_Crab\",\"name\":\"간장 게장\",\"unlock\":\"비밀 레시피\",\"maxCost\":1609,\"maxScore\":505,\"maxCount\":6,\"maxLevel\":10,\"party\":[\"랍스터 파티\"]}"));
            dishDtoList.add(new DishDto("{\"id\":\"Secret_2\",\"name\":\"트러플 돛새치 타르타르\",\"unlock\":\"비밀 레시피\",\"maxCost\":1727,\"maxScore\":295,\"maxCount\":2,\"maxLevel\":5}"));
            dishDtoList.add(new DishDto("{\"id\":\"Secret_3\",\"name\":\"트러플 상어 샌드\",\"unlock\":\"비밀 레시피\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":5}"));
            dishDtoList.add(new DishDto("{\"id\":\"Secret_4\",\"name\":\"트러플 남극문어 구이\",\"unlock\":\"비밀 레시피\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":5}"));
            dishDtoList.add(new DishDto("{\"id\":\"Secret_5\",\"name\":\"트러플 블루랍스터 꼬리회\",\"unlock\":\"비밀 레시피\",\"maxCost\":0,\"maxScore\":0,\"maxCount\":1,\"maxLevel\":5,\"party\":[\"랍스터 파티\"]}"));
        }
    }

    @Getter
    public static class Party {
        private final List<DishDto.PartyDto> partyDtoList;

        public Party() {
            this.partyDtoList = new ArrayList<>();

            partyDtoList.add(new DishDto.PartyDto("JELLY_FISH", "해파리 파티", "blueviolet"));
            partyDtoList.add(new DishDto.PartyDto("TUNA", "참치 요트 파티", "dodgerblue"));
            partyDtoList.add(new DishDto.PartyDto("MARLIN", "청새치 파티", "darkblue"));
            partyDtoList.add(new DishDto.PartyDto("STORM_SHARK", "스톰 샤크 파티", "black"));
            partyDtoList.add(new DishDto.PartyDto("CUCUMBER", "오이 파티", "forestgreen"));
            partyDtoList.add(new DishDto.PartyDto("CURRY", "카레 파티", "goldenrod"));
            partyDtoList.add(new DishDto.PartyDto("SHRIMP", "새우 파티", "lightsalmon"));
            partyDtoList.add(new DishDto.PartyDto("LOBSTER", "랍스터 파티", "orangered"));
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

        private final List<DishDto.UnlockDto> unlockDtoList;

        public Unlock() {
            this.unlockDtoList = new ArrayList<>();

            unlockDtoList.add(new DishDto.UnlockDto("YOSHIE_VISIT", "요시에 방문"));
            unlockDtoList.add(new DishDto.UnlockDto("ENTER_HYDROTHERMAL_VENTS", "열수 분출 구역 진입"));
            unlockDtoList.add(new DishDto.UnlockDto("RESCUE_TSHCHI", "츠치 구조"));
            unlockDtoList.add(new DishDto.UnlockDto("VIP_VINCENT", "빈센트 접대 성공"));
            unlockDtoList.add(new DishDto.UnlockDto("VIP_MICHAEL_BANG", "마이클 방 접대 성공"));
            unlockDtoList.add(new DishDto.UnlockDto("VIP_SAMMY", "새미 접대 성공"));
            unlockDtoList.add(new DishDto.UnlockDto("DJANGO_VISIT", "방랑 상인 장고 방문"));
            unlockDtoList.add(new DishDto.UnlockDto("VIP_DJANGO", "방랑 상인 장고 접대 성공"));
            unlockDtoList.add(new DishDto.UnlockDto("CHALLENGE_WANG_PANG", "왕팡 대결 승리"));
            unlockDtoList.add(new DishDto.UnlockDto("CHALLENGE_ALEX", "알렉스 대결 승리"));
            unlockDtoList.add(new DishDto.UnlockDto("CHALLENGE_PASTRO", "파스트로 대결 승리"));
            unlockDtoList.add(new DishDto.UnlockDto("COOK_STAR_BRONZE", "쿡스타 브론즈 달성"));
            unlockDtoList.add(new DishDto.UnlockDto("COOK_STAR_SILVER", "쿡스타 실버 달성"));
            unlockDtoList.add(new DishDto.UnlockDto("COOK_STAR_GOLD", "쿡스타 골드 달성"));
            unlockDtoList.add(new DishDto.UnlockDto("COOK_STAR_PLATINUM", "쿡스타 플래티넘 달성"));
            unlockDtoList.add(new DishDto.UnlockDto("COOK_STAR_DIA", "쿡스타 다이아몬드 달성"));
            unlockDtoList.add(new DishDto.UnlockDto("PARTY_TUNA", "참치 요트 파티 시작"));
            unlockDtoList.add(new DishDto.UnlockDto("PARTY_MARLIN", "청새치 파티 시작"));
            unlockDtoList.add(new DishDto.UnlockDto("PARTY_CUCUMBER", "오이 파티 시작"));
            unlockDtoList.add(new DishDto.UnlockDto("PARTY_LOBSTER", "랍스터 파티 시작"));
            unlockDtoList.add(new DishDto.UnlockDto("SECRET_RECIPE", "비밀 레시피"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.STAFF.name() + "_" + LEVEL.LV_5.name(), "직원 Lv.5 달성"));
            // TODO 직원 이름 확인
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.DRE.name() + "_" + LEVEL.LV_5.name(), "드레 Lv.5 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.RAPTOR.name() + "_" + LEVEL.LV_5.name(), "랩터 Lv.5 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.MAKI.name() + "_" + LEVEL.LV_5.name(), "마키 Lv.5 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.KORCANIJI.name() + "_" + LEVEL.LV_5.name(), "코카니지 Lv.5 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.DRE.name() + "_" + LEVEL.LV_10.name(), "드레 Lv.10 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.RAPTOR.name() + "_" + LEVEL.LV_10.name(), "랩터 Lv.10 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.KORCANIJI.name() + "_" + LEVEL.LV_10.name(), "코카니지 Lv.10 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.DAVINA.name() + "_" + LEVEL.LV_15.name(), "다비나 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.DRE.name() + "_" + LEVEL.LV_15.name(), "드레 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.RAUL.name() + "_" + LEVEL.LV_15.name(), "라울 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.RAPTOR.name() + "_" + LEVEL.LV_15.name(), "랩터 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.RIU.name() + "_" + LEVEL.LV_15.name(), "리우 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.MASAYOSI.name() + "_" + LEVEL.LV_15.name(), "마사요시 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.MAKI.name() + "_" + LEVEL.LV_15.name(), "마키 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.MICHEL.name() + "_" + LEVEL.LV_15.name(), "미첼 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.BILLY.name() + "_" + LEVEL.LV_15.name(), "빌리 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.EL_NINYO.name() + "_" + LEVEL.LV_15.name(), "엘 니뇨 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.YONE.name() + "_" + LEVEL.LV_15.name(), "요네 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.YUSKE.name() + "_" + LEVEL.LV_15.name(), "유스케 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.ITSUKI.name() + "_" + LEVEL.LV_15.name(), "이츠키 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.JANDI.name() + "_" + LEVEL.LV_15.name(), "잔디 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.JAMES.name() + "_" + LEVEL.LV_15.name(), "제임스 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.CHARLY.name() + "_" + LEVEL.LV_15.name(), "찰리 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.CAROLLINA.name() + "_" + LEVEL.LV_15.name(), "카롤리나 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.KORCANIJI.name() + "_" + LEVEL.LV_15.name(), "코카니지 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.KYOKO.name() + "_" + LEVEL.LV_15.name(), "쿄코 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.TOHOKU.name() + "_" + LEVEL.LV_15.name(), "토호쿠 Lv.15 달성"));
            unlockDtoList.add(new DishDto.UnlockDto(STAFF.PIE.name() + "_" + LEVEL.LV_15.name(), "파이 Lv.15 달성"));
        }
    }
}
