<p>Mobile Computing Android</p>
Assignment #3</br>

Goal: Build a simple app with two activities that will allow the user to choose a back
ground color. The app will use intents and return results.</br>
Requirements:</br>
1) You will have a Start activity that has three private values red, green, and
blue.</br>
2) The start activity will have one image view, a button and a Text view.</br>
a. The image view will have some image with a transparent background.</br>
You can choose the image. (You may want to set the height and width
of the image to a given amount and then set the scaleType attribute to
"fitXY".) The image should fill the entire screen.</br>
b. The COLOR ME button will start the ColorActivity. You will pass the
values for red, green and blue in the intent. The activity will send back</br>
a result, which are the new values for red, green and blue.</br>
c. The text view will display the current values of the red, green, and
blue values.</br>
d. Your method for handling the result should update the
red/green/blue values. It should change the background color of the
image view to the new values. It should update the Text View with the
new values.</br>
Hint: Use the setBackgroundColor(int) method to set the color. To
compute the color, use the formula</br>
Color = red * 2562 + green*256 + blue.</br>
Multiplying by 256 shifts the value over by one byte.</br>
3) The Color activity will allow the user to enter values for red, green and blue.
The values can be in the range of 0 to 255 each. width and height of the wall
in feet. It will have three text views, three numerical EditTexts and a button.</br>
a. The TextViews will be used as labels for the three Edit Texts.</br>
b. The first EditText will allow the entry of the red value.</br>
c. The second EditText will allow entry of the green value.</br>
d. The third EditText will allow entry of the blue value.</br>
e. The CHOOSE COLOR button when pressed will use an intent to set the
result for red, green and blue values and then finish the activity.</br>
4) The app should be tested properly and should not crash in any scenario.</br>
Bonus:</br>
Ø Add an alpha value (0-255) to the color. It is the high byte, so multiply by
2563 to shift it properly.(Not yet Done)</br>
Ø Check the RGB values and if they are outside the range 0-255, set them to be
inside the range.</br>
Ø Add hint text to the text edits.</br>
Ø Add in a preview button to the Color Activity. When pressed, change its color
to the current color defined by the EditTexts</br>
Ø Add an activity that will take a color in CMYK. It should convert to RGB.</br>
Ø Add an activity that will allow the user to select one of the named color
constants of the Color class. (E.g. Color.ORANGE.)</br>
Ø Change the Color activity so that the user can use hexadecimal values to
specify the color.(Not yet Done)</br>
Ø Add lighten/darken buttons that will increase/decrease each of the colors by
a fixed amount.(Not yet Done)</br>
Ø Add an activity that allows the user to select one of three named pantone
colors (there are many). Have one button for each of the colors. Set the text
to the name of the color. Have the button be that color as well. Pressing the
button should create an appropriate result and then finish.</br>

Sample Layout: