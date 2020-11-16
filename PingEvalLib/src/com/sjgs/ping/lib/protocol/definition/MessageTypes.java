package com.sjgs.ping.lib.protocol.definition;

/**
 * 
 * @author Cedric Boes
 * @version 1.0
 */
public enum MessageTypes {
	/**
	 * Last package acknowledged. A Package has been received successfully.
	 */
	ACK,
	/**
	 * An error has occurred.<br>
	 * Payload can contain more information.
	 */
	ERR,
	/**
	 * Requesting an action.<br>
	 * Payload contain more information about what is requested.
	 */
	REQ,
	/**
	 * Response to the {@link REQ request}.<br>
	 * The actual response is contained as payload.
	 */
	RES,
	/**
	 * Actual Ping-Message.<br>
	 * Payload is the id of the ping.
	 */
	PING,
	/**
	 * Response to Ping-Message<br>
	 * The id of the answered ping is included as payload.
	 */
	PONG,
	/**
	 * Packet is for data-transfer.<br>
	 * Payload can differ for each result.
	 */
	SEND,
	/**
	 * Registering Packages between Clients.<br>
	 * Payload contains the IP of the Client which will connect.<br>
	 * <br>
	 * This is a security feature that only packets from a list of a few senders will be accepted.
	 */
	REG,
	/**
	 * Special packet which lets the server know that a client although it is waiting is still alive.
	 * This will be sent every second so after 4 seconds clients are considered to be timed out.<br>
	 * <code>ALIVE</code> does not contain any payload!
	 */
	LIFE;
	
	/**
	 * Constructor for {@link MessageTypes}. It is very useless at the moment and is here for your entertainment.<br>
	 * Because I am evil and I want to distract you here a little story that might interest here :D<br>
	 * <br>
	 * The Lottery<br>
	 * By Shirley Jackson<br>
	 * June 19, 1948<br>
	 * The morning of June 27th was clear and sunny, with the fresh warmth of a full-summer day; the flowers were blossoming profusely and the grass was richly green. The people of the village began to gather in the square, between the post office and the bank, around ten o’clock; in some towns there were so many people that the lottery took two days and had to be started on June 26th, but in this village, where there were only about three hundred people, the whole lottery took only about two hours, so it could begin at ten o’clock in the morning and still be through in time to allow the villagers to get home for noon dinner.<br>
	 * The children assembled first, of course. School was recently over for the summer, and the feeling of liberty sat uneasily on most of them; they tended to gather together quietly for a while before they broke into boisterous play, and their talk was still of the classroom and the teacher, of books and reprimands. Bobby Martin had already stuffed his pockets full of stones, and the other boys soon followed his example, selecting the smoothest and roundest stones; Bobby and Harry Jones and Dickie Delacroix—the villagers pronounced this name “Dellacroy”—eventually made a great pile of stones in one corner of the square and guarded it against the raids of the other boys. The girls stood aside, talking among themselves, looking over their shoulders at the boys, and the very small children rolled in the dust or clung to the hands of their older brothers or sisters.<br>
	 * Soon the men began to gather, surveying their own children, speaking of planting and rain, tractors and taxes. They stood together, away from the pile of stones in the corner, and their jokes were quiet and they smiled rather than laughed. The women, wearing faded house dresses and sweaters, came shortly after their menfolk. They greeted one another and exchanged bits of gossip as they went to join their husbands. Soon the women, standing by their husbands, began to call to their children, and the children came reluctantly, having to be called four or five times. Bobby Martin ducked under his mother’s grasping hand and ran, laughing, back to the pile of stones. His father spoke up sharply, and Bobby came quickly and took his place between his father and his oldest brother.<br>
	 * The lottery was conducted—as were the square dances, the teen-age club, the Halloween program—by Mr. Summers, who had time and energy to devote to civic activities. He was a round-faced, jovial man and he ran the coal business, and people were sorry for him, because he had no children and his wife was a scold. When he arrived in the square, carrying the black wooden box, there was a murmur of conversation among the villagers, and he waved and called, “Little late today, folks.” The postmaster, Mr. Graves, followed him, carrying a three-legged stool, and the stool was put in the center of the square and Mr. Summers set the black box down on it. The villagers kept their distance, leaving a space between themselves and the stool, and when Mr. Summers said, “Some of you fellows want to give me a hand?,” there was a hesitation before two men, Mr. Martin and his oldest son, Baxter, came forward to hold the box steady on the stool while Mr. Summers stirred up the papers inside it.<br>
	 * The original paraphernalia for the lottery had been lost long ago, and the black box now resting on the stool had been put into use even before Old Man Warner, the oldest man in town, was born. Mr. Summers spoke frequently to the villagers about making a new box, but no one liked to upset even as much tradition as was represented by the black box. There was a story that the present box had been made with some pieces of the box that had preceded it, the one that had been constructed when the first people settled down to make a village here. Every year, after the lottery, Mr. Summers began talking again about a new box, but every year the subject was allowed to fade off without anything’s being done. The black box grew shabbier each year; by now it was no longer completely black but splintered badly along one side to show the original wood color, and in some places faded or stained.<br>
	 * Mr. Martin and his oldest son, Baxter, held the black box securely on the stool until Mr. Summers had stirred the papers thoroughly with his hand. Because so much of the ritual had been forgotten or discarded, Mr. Summers had been successful in having slips of paper substituted for the chips of wood that had been used for generations. Chips of wood, Mr. Summers had argued, had been all very well when the village was tiny, but now that the population was more than three hundred and likely to keep on growing, it was necessary to use something that would fit more easily into the black box. The night before the lottery, Mr. Summers and Mr. Graves made up the slips of paper and put them into the box, and it was then taken to the safe of Mr. Summers’ coal company and locked up until Mr. Summers was ready to take it to the square next morning. The rest of the year, the box was put away, sometimes one place, sometimes another; it had spent one year in Mr. Graves’ barn and another year underfoot in the post office, and sometimes it was set on a shelf in the Martin grocery and left there.<br>
	 * There was a great deal of fussing to be done before Mr. Summers declared the lottery open. There were the lists to make up—of heads of families, heads of households in each family, members of each household in each family. There was the proper swearing-in of Mr. Summers by the postmaster, as the official of the lottery; at one time, some people remembered, there had been a recital of some sort, performed by the official of the lottery, a perfunctory, tuneless chant that had been rattled off duly each year; some people believed that the official of the lottery used to stand just so when he said or sang it, others believed that he was supposed to walk among the people, but years and years ago this part of the ritual had been allowed to lapse. There had been, also, a ritual salute, which the official of the lottery had had to use in addressing each person who came up to draw from the box, but this also had changed with time, until now it was felt necessary only for the official to speak to each person approaching. Mr. Summers was very good at all this; in his clean white shirt and blue jeans, with one hand resting carelessly on the black box, he seemed very proper and important as he talked interminably to Mr. Graves and the Martins.<br>
	 * Just as Mr. Summers finally left off talking and turned to the assembled villagers, Mrs. Hutchinson came hurriedly along the path to the square, her sweater thrown over her shoulders, and slid into place in the back of the crowd. “Clean forgot what day it was,” she said to Mrs. Delacroix, who stood next to her, and they both laughed softly. “Thought my old man was out back stacking wood,” Mrs. Hutchinson went on, “and then I looked out the window and the kids was gone, and then I remembered it was the twenty-seventh and came a-running.” She dried her hands on her apron, and Mrs. Delacroix said, “You’re in time, though. They’re still talking away up there.”<br>
	 * Mrs. Hutchinson craned her neck to see through the crowd and found her husband and children standing near the front. She tapped Mrs. Delacroix on the arm as a farewell and began to make her way through the crowd. The people separated good-humoredly to let her through; two or three people said, in voices just loud enough to be heard across the crowd, “Here comes your Mrs., Hutchinson,” and “Bill, she made it after all.” Mrs. Hutchinson reached her husband, and Mr. Summers, who had been waiting, said cheerfully, “Thought we were going to have to get on without you, Tessie.” Mrs. Hutchinson said, grinning, “Wouldn’t have me leave m’dishes in the sink, now, would you, Joe?,” and soft laughter ran through the crowd as the people stirred back into position after Mrs. Hutchinson’s arrival.<br>
	 * “Well, now,” Mr. Summers said soberly, “guess we better get started, get this over with, so’s we can go back to work. Anybody ain’t here?”<br>
	 * “Dunbar,” several people said. “Dunbar, Dunbar.”<br>
	 * Mr. Summers consulted his list. “Clyde Dunbar,” he said. “That’s right. He’s broke his leg, hasn’t he? Who’s drawing for him?”<br>
	 * “Me, I guess,” a woman said, and Mr. Summers turned to look at her. “Wife draws for her husband,” Mr. Summers said. “Don’t you have a grown boy to do it for you, Janey?” Although Mr. Summers and everyone else in the village knew the answer perfectly well, it was the business of the official of the lottery to ask such questions formally. Mr. Summers waited with an expression of polite interest while Mrs. Dunbar answered.<br>
	 * “Horace’s not but sixteen yet,” Mrs. Dunbar said regretfully. “Guess I gotta fill in for the old man this year.”<br>
	 * “Right,” Mr. Summers said. He made a note on the list he was holding. Then he asked, “Watson boy drawing this year?”<br>
	 * A tall boy in the crowd raised his hand. “Here,” he said. “I’m drawing for m’mother and me.” He blinked his eyes nervously and ducked his head as several voices in the crowd said things like “Good fellow, Jack,” and “Glad to see your mother’s got a man to do it.”<br>
	 * “Well,” Mr. Summers said, “guess that’s everyone. Old Man Warner make it?”<br>
	 * “Here,” a voice said, and Mr. Summers nodded.<br>
	 * A sudden hush fell on the crowd as Mr. Summers cleared his throat and looked at the list. “All ready?” he called. “Now, I’ll read the names—heads of families first—and the men come up and take a paper out of the box. Keep the paper folded in your hand without looking at it until everyone has had a turn. Everything clear?”<br>
	 * The people had done it so many times that they only half listened to the directions; most of them were quiet, wetting their lips, not looking around. Then Mr. Summers raised one hand high and said, “Adams.” A man disengaged himself from the crowd and came forward. “Hi, Steve,” Mr. Summers said, and Mr. Adams said, “Hi, Joe.” They grinned at one another humorlessly and nervously. Then Mr. Adams reached into the black box and took out a folded paper. He held it firmly by one corner as he turned and went hastily back to his place in the crowd, where he stood a little apart from his family, not looking down at his hand.<br>
	 * “Allen,” Mr. Summers said. “Anderson. . . . Bentham.”<br>
	 * “Seems like there’s no time at all between lotteries any more,” Mrs. Delacroix said to Mrs. Graves in the back row. “Seems like we got through with the last one only last week.”<br>
	 * “Time sure goes fast,” Mrs. Graves said.<br>
	 * “Clark. . . . Delacroix.”<br>
	 * “There goes my old man,” Mrs. Delacroix said. She held her breath while her husband went forward.<br>
	 * “Dunbar,” Mr. Summers said, and Mrs. Dunbar went steadily to the box while one of the women said, “Go on, Janey,” and another said, “There she goes.”<br>
	 * “We’re next,” Mrs. Graves said. She watched while Mr. Graves came around from the side of the box, greeted Mr. Summers gravely, and selected a slip of paper from the box. By now, all through the crowd there were men holding the small folded papers in their large hands, turning them over and over nervously. Mrs. Dunbar and her two sons stood together, Mrs. Dunbar holding the slip of paper.<br>
	 * “Harburt. . . . Hutchinson.”<br>
	 * “Get up there, Bill,” Mrs. Hutchinson said, and the people near her laughed.<br>
	 * “Jones.”<br>
	 * “They do say,” Mr. Adams said to Old Man Warner, who stood next to him, “that over in the north village they’re talking of giving up the lottery.”<br>
	 * Old Man Warner snorted. “Pack of crazy fools,” he said. “Listening to the young folks, nothing’s good enough for them. Next thing you know, they’ll be wanting to go back to living in caves, nobody work any more, live that way for a while. Used to be a saying about ‘Lottery in June, corn be heavy soon.’ First thing you know, we’d all be eating stewed chickweed and acorns. There’s always been a lottery,” he added petulantly. “Bad enough to see young Joe Summers up there joking with everybody.”<br>
	 * “Some places have already quit lotteries,” Mrs. Adams said.<br>
	 * “Nothing but trouble in that,” Old Man Warner said stoutly. “Pack of young fools.”<br>
	 * “Martin.” And Bobby Martin watched his father go forward. “Overdyke. . . . Percy.”<br>
	 * “I wish they’d hurry,” Mrs. Dunbar said to her older son. “I wish they’d hurry.”<br>
	 * “They’re almost through,” her son said.<br>
	 * “You get ready to run tell Dad,” Mrs. Dunbar said.<br>
	 * Mr. Summers called his own name and then stepped forward precisely and selected a slip from the box. Then he called, “Warner.”<br>
	 * “Seventy-seventh year I been in the lottery,” Old Man Warner said as he went through the crowd. “Seventy-seventh time.”<br>
	 * “Watson.” The tall boy came awkwardly through the crowd. Someone said, “Don’t be nervous, Jack,” and Mr. Summers said, “Take your time, son.”<br>
	 * “Zanini.”<br>
	 * After that, there was a long pause, a breathless pause, until Mr. Summers, holding his slip of paper in the air, said, “All right, fellows.” For a minute, no one moved, and then all the slips of paper were opened. Suddenly, all the women began to speak at once, saying, “Who is it?,” “Who’s got it?,” “Is it the Dunbars?,” “Is it the Watsons?” Then the voices began to say, “It’s Hutchinson. It’s Bill,” “Bill Hutchinson’s got it.”<br>
	 * “Go tell your father,” Mrs. Dunbar said to her older son.<br>
	 * People began to look around to see the Hutchinsons. Bill Hutchinson was standing quiet, staring down at the paper in his hand. Suddenly, Tessie Hutchinson shouted to Mr. Summers, “You didn’t give him time enough to take any paper he wanted. I saw you. It wasn’t fair!”<br>
	 * “Be a good sport, Tessie,” Mrs. Delacroix called, and Mrs. Graves said, “All of us took the same chance.”<br>
	 * “Shut up, Tessie,” Bill Hutchinson said.<br>
	 * “Well, everyone,” Mr. Summers said, “that was done pretty fast, and now we’ve got to be hurrying a little more to get done in time.” He consulted his next list. “Bill,” he said, “you draw for the Hutchinson family. You got any other households in the Hutchinsons?”<br>
	 * “There’s Don and Eva,” Mrs. Hutchinson yelled. “Make them take their chance!”<br>
	 * “Daughters draw with their husbands’ families, Tessie,” Mr. Summers said gently. “You know that as well as anyone else.”<br>
	 * “It wasn’t fair,” Tessie said.<br>
	 * “I guess not, Joe,” Bill Hutchinson said regretfully. “My daughter draws with her husband’s family, that’s only fair. And I’ve got no other family except the kids.”<br>
	 * “Then, as far as drawing for families is concerned, it’s you,” Mr. Summers said in explanation, “and as far as drawing for households is concerned, that’s you, too. Right?”<br>
	 * “Right,” Bill Hutchinson said.<br>
	 * “How many kids, Bill?” Mr. Summers asked formally.<br>
	 * “Three,” Bill Hutchinson said. “There’s Bill, Jr., and Nancy, and little Dave. And Tessie and me.”<br>
	 * “All right, then,” Mr. Summers said. “Harry, you got their tickets back?”<br>
	 * Mr. Graves nodded and held up the slips of paper. “Put them in the box, then,” Mr. Summers directed. “Take Bill’s and put it in.”<br>
	 * “I think we ought to start over,” Mrs. Hutchinson said, as quietly as she could. “I tell you it wasn’t fair. You didn’t give him time enough to choose. _Every_body saw that.”<br>
	 * Mr. Graves had selected the five slips and put them in the box, and he dropped all the papers but those onto the ground, where the breeze caught them and lifted them off.<br>
	 * “Listen, everybody,” Mrs. Hutchinson was saying to the people around her.<br>
	 * “Ready, Bill?” Mr. Summers asked, and Bill Hutchinson, with one quick glance around at his wife and children, nodded.<br>
	 * “Remember,” Mr. Summers said, “take the slips and keep them folded until each person has taken one. Harry, you help little Dave.” Mr. Graves took the hand of the little boy, who came willingly with him up to the box. “Take a paper out of the box, Davy,” Mr. Summers said. Davy put his hand into the box and laughed. “Take just one paper,” Mr. Summers said. “Harry, you hold it for him.” Mr. Graves took the child’s hand and removed the folded paper from the tight fist and held it while little Dave stood next to him and looked up at him wonderingly.<br>
	 * “Nancy next,” Mr. Summers said. Nancy was twelve, and her school friends breathed heavily as she went forward, switching her skirt, and took a slip daintily from the box. “Bill, Jr.,” Mr. Summers said, and Billy, his face red and his feet overlarge, nearly knocked the box over as he got a paper out. “Tessie,” Mr. Summers said. She hesitated for a minute, looking around defiantly, and then set her lips and went up to the box. She snatched a paper out and held it behind her.<br>
	 * “Bill,” Mr. Summers said, and Bill Hutchinson reached into the box and felt around, bringing his hand out at last with the slip of paper in it.<br>
	 * The crowd was quiet. A girl whispered, “I hope it’s not Nancy,” and the sound of the whisper reached the edges of the crowd.<br>
	 * “It’s not the way it used to be,” Old Man Warner said clearly. “People ain’t the way they used to be.”<br>
	 * “All right,” Mr. Summers said. “Open the papers. Harry, you open little Dave’s.”<br>
	 * Mr. Graves opened the slip of paper and there was a general sigh through the crowd as he held it up and everyone could see that it was blank. Nancy and Bill, Jr., opened theirs at the same time, and both beamed and laughed, turning around to the crowd and holding their slips of paper above their heads.<br>
	 * “Tessie,” Mr. Summers said. There was a pause, and then Mr. Summers looked at Bill Hutchinson, and Bill unfolded his paper and showed it. It was blank.<br>
	 * “It’s Tessie,” Mr. Summers said, and his voice was hushed. “Show us her paper, Bill.”<br>
	 * Bill Hutchinson went over to his wife and forced the slip of paper out of her hand. It had a black spot on it, the black spot Mr. Summers had made the night before with the heavy pencil in the coal-company office. Bill Hutchinson held it up, and there was a stir in the crowd.<br>
	 * “All right, folks,” Mr. Summers said. “Let’s finish quickly.”<br>
	 * Although the villagers had forgotten the ritual and lost the original black box, they still remembered to use stones. The pile of stones the boys had made earlier was ready; there were stones on the ground with the blowing scraps of paper that had come out of the box. Mrs. Delacroix selected a stone so large she had to pick it up with both hands and turned to Mrs. Dunbar. “Come on,” she said. “Hurry up.”<br>
	 * Mrs. Dunbar had small stones in both hands, and she said, gasping for breath. “I can’t run at all. You’ll have to go ahead and I’ll catch up with you.”<br>
	 * The children had stones already, and someone gave little Davy Hutchinson a few pebbles.<br>
	 * Tessie Hutchinson was in the center of a cleared space by now, and she held her hands out desperately as the villagers moved in on her. “It isn’t fair,” she said. A stone hit her on the side of the head.<br>
	 * Old Man Warner was saying, “Come on, come on, everyone.” Steve Adams was in the front of the crowd of villagers, with Mrs. Graves beside him.<br>
	 * “It isn’t fair, it isn’t right,” Mrs. Hutchinson screamed, and then they were upon her. ♦<br>
	 */
	private MessageTypes() {
		
	}
}
