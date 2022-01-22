package DiskScheduling;

import java.util.*;

public class Clook{

static int size = 8;
static int disk_size = 200;

public static void CLOOK(int arr[], int head)
{
	int seek_count = 0;
	int distance, cur_track;
	
	Vector<Integer> left = new Vector<Integer>();
	Vector<Integer> right = new Vector<Integer>();
	Vector<Integer> seek_sequence = new Vector<Integer>();

	for(int i = 0; i < size; i++)
	{
		if (arr[i] < head)
			left.add(arr[i]);
		if (arr[i] > head)
			right.add(arr[i]);
	}

	Collections.sort(left);
	Collections.sort(right);

	for(int i = 0; i < right.size(); i++)
	{
		cur_track = right.get(i);

		seek_sequence.add(cur_track);

		distance = Math.abs(cur_track - head);

		seek_count += distance;

		head = cur_track;
	}

	seek_count += Math.abs(head - left.get(0));
	head = left.get(0);

	for(int i = 0; i < left.size(); i++)
	{
		cur_track = left.get(i);

		seek_sequence.add(cur_track);

		distance = Math.abs(cur_track - head);

		seek_count += distance;

		head = cur_track;
	}
	
	System.out.println("Total number of seek " +
					"operations = " + seek_count);

	System.out.println("Seek Sequence is");

	for(int i = 0; i < seek_sequence.size(); i++)
	{
		System.out.println(seek_sequence.get(i));
	}
}

public static void main(String []args)
{

	int arr[] = { 170, 91, 12, 50,
			86, 41, 21, 111 };
	int head = 60;

	System.out.println("Initial position of head: " +
					head);

	CLOOK(arr, head);
}
}


