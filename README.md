# AndroidTask
App Requirements
Write a sample Android app that fetches and displays data from a RESTful Web API. The app should be able to display the data as a text only,
scrollable list of titles, and on phones, should be toggle-able from the list to a scrollable grid of item images.
The title and description for each item should each be parsed out of the data in the "Text" field. Images should be loaded from the URLs in the
"Icon" field. For items with blank or missing image URLs, use a placeholder image of your choice.
Clicking on an item should load a Detail view, including the item’s image, title, and description. You choose the layout of the Detail view.
On tablets, the app should show the list and detail views on the same screen. For phones, the list and detail should each be full screen.
The app should have an action bar that displays:
For Phone
The name of the app on the item list screen, and the title of the item on the detail screen
For Tablets
The name of the app
In addition, two versions of the app should be created. Each version has a different Name, package-name, and url that it pulls data from. (We're
interested in your methodology for creating multiple apps from a shared codebase)
Version One
Name: Simpsons Character Viewer
Data API: http://api.duckduckgo.com/?q=simpsons+characters&format=json
Package name: com.xfinity.simpsonsviewer
Version Two
Name: The Wire Character Viewer
Data API: http://api.duckduckgo.com/?q=the+wire+characters&format=json
