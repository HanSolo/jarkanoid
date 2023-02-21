## JArkanoid

[![Github all releases](https://img.shields.io/github/downloads/HanSolo/jarkanoid/total.svg)](https://GitHub.com/HanSolo/jarkanoid/releases/)

JArkanoid is a simple clone of the game Arkanoid from 1986 by Taito written in JavaFX.

The game contains 32 levels and is only missing the last level at the moment.
It is not an 100% clone of the original game because it does not contain the molecules
and other things that are flying around and that one can shoot. I might add them later
though. Also the bonus block that adds the additional balls is working a bit differently
than the original one. The speed of the ball is also constant and will not vary over
time.

All sprites and spritemaps are drawn by myself and can be found in the resources folder
in the main directory of the project. These files are in the format of Affinity Designer.

### Settings
- The game will create a properties file in your user folder named jarkanoid.properties
- You can set the default ball speed in that file to values between 0.1 and 10. (2 recommended for M1 Macs, 3 for x64 machines and 5-7 for aarch64 Raspberry Pi)

e.g. `/home/YOUR_USERNAME/jarkanoid.properties`
```properties
highscore=0
ball_speed=3.0
bonus_block_speed=3.0
enemy_speed=3.0
```

### Gameplay
- Space key to start the game or shoot (when laser paddle)
- Move paddle to the left: Arrow left or A key
- Move paddle to the right: Arrow right or D key
- Shoot: Space bar
- Paddle can also be moved by dragging it with the mouse
- The ball can get some spin when the paddle is moved when they have contact

### Paddles
#### Standard
![STANDARD](https://github.com/HanSolo/jarkanoid/blob/main/resources/standardPaddle.png?raw=true)

#### Wide
![WIDE](https://github.com/HanSolo/jarkanoid/blob/main/resources/widePaddle.png?raw=true)

#### Laser
![LASER](https://github.com/HanSolo/jarkanoid/blob/main/resources/laserPaddle.png?raw=true)


### Bonus Blocks
- C (color lime)        -> catch ball (for next ball)
- D (color cyan)        -> additional balls (max 3)
- F (color dark blue)   -> wide paddle (for 30 seconds)
- L (color red)         -> laser paddle (for 30 seconds)
- S (color dark yellow) -> slow down (for 30 seconds)
- B (color magenta)     -> opens door to next level (for 5 seconds)
- P (color gray)        -> additional life (max 5)

### Blocks
- white    -> 50 points 
- orange   -> 60 points 
- cyan     -> 70 points 
- lime     -> 80 points 
- red      -> 90 points
- blue     -> 100 points 
- magenta  -> 110 points
- yellow   -> 120 points
- gray     -> needs 2 hits to destroy it (increasing by 1 ever 8 levels) -> 50 x level
- gold     -> can't be destroyed

### Levels

##### Start screen

![Start screen](https://github.com/HanSolo/jarkanoid/blob/main/resources/startscreen.png?raw=true)


##### Level 1

![Level 1](https://github.com/HanSolo/jarkanoid/blob/main/resources/level1.png?raw=true)


##### Level 2

![Level 2](https://github.com/HanSolo/jarkanoid/blob/main/resources/level2.png?raw=true)


##### Level 3

![Level 3](https://github.com/HanSolo/jarkanoid/blob/main/resources/level3.png?raw=true)


##### Level 4

![Level 4](https://github.com/HanSolo/jarkanoid/blob/main/resources/level4.png?raw=true)


##### Level 5

![Level 5](https://github.com/HanSolo/jarkanoid/blob/main/resources/level5.png?raw=true)


##### Level 6

![Level 6](https://github.com/HanSolo/jarkanoid/blob/main/resources/level6.png?raw=true)


##### Level 7

![Level 7](https://github.com/HanSolo/jarkanoid/blob/main/resources/level7.png?raw=true)


##### Level 8

![Level 8](https://github.com/HanSolo/jarkanoid/blob/main/resources/level8.png?raw=true)


##### Level 9

![Level 9](https://github.com/HanSolo/jarkanoid/blob/main/resources/level9.png?raw=true)


##### Level 10

![Level 10](https://github.com/HanSolo/jarkanoid/blob/main/resources/level10.png?raw=true)


##### Level 11

![Level 11](https://github.com/HanSolo/jarkanoid/blob/main/resources/level11.png?raw=true)


##### Level 12

![Level 12](https://github.com/HanSolo/jarkanoid/blob/main/resources/level12.png?raw=true)


##### Level 13

![Level 13](https://github.com/HanSolo/jarkanoid/blob/main/resources/level13.png?raw=true)


##### Level 14

![Level 14](https://github.com/HanSolo/jarkanoid/blob/main/resources/level14.png?raw=true)


##### Level 15

![Level 15](https://github.com/HanSolo/jarkanoid/blob/main/resources/level15.png?raw=true)


##### Level 16

![Level 16](https://github.com/HanSolo/jarkanoid/blob/main/resources/level16.png?raw=true)


##### Level 17

![Level 17](https://github.com/HanSolo/jarkanoid/blob/main/resources/level17.png?raw=true)


##### Level 18

![Level 18](https://github.com/HanSolo/jarkanoid/blob/main/resources/level18.png?raw=true)


##### Level 19

![Level 19](https://github.com/HanSolo/jarkanoid/blob/main/resources/level19.png?raw=true)


##### Level 20

![Level 20](https://github.com/HanSolo/jarkanoid/blob/main/resources/level20.png?raw=true)


##### Level 21

![Level 21](https://github.com/HanSolo/jarkanoid/blob/main/resources/level21.png?raw=true)


##### Level 22

![Level 22](https://github.com/HanSolo/jarkanoid/blob/main/resources/level22.png?raw=true)


##### Level 23

![Level 23](https://github.com/HanSolo/jarkanoid/blob/main/resources/level23.png?raw=true)


##### Level 24

![Level 24](https://github.com/HanSolo/jarkanoid/blob/main/resources/level24.png?raw=true)


##### Level 25

![Level 25](https://github.com/HanSolo/jarkanoid/blob/main/resources/level25.png?raw=true)


##### Level 26

![Level 26](https://github.com/HanSolo/jarkanoid/blob/main/resources/level26.png?raw=true)


##### Level 27

![Level 27](https://github.com/HanSolo/jarkanoid/blob/main/resources/level27.png?raw=true)


##### Level 28

![Level 28](https://github.com/HanSolo/jarkanoid/blob/main/resources/level28.png?raw=true)


##### Level 29

![Level 29](https://github.com/HanSolo/jarkanoid/blob/main/resources/level29.png?raw=true)


##### Level 30

![Level 30](https://github.com/HanSolo/jarkanoid/blob/main/resources/level30.png?raw=true)


##### Level 31

![Level 31](https://github.com/HanSolo/jarkanoid/blob/main/resources/level31.png?raw=true)


##### Level 32

![Level 32](https://github.com/HanSolo/jarkanoid/blob/main/resources/level32.png?raw=true)
