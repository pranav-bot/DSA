def smallestChair( times, targetFriend):
        """
        :type times: List[List[int]]
        :type targetFriend: int
        :rtype: int
        """

        chair = {}
        minimum = 100000000000
        mins = []
        n = len(times)
        for i2 in range(len(times)):
            for i in range(len(times)):
                if(times[i][0]<minimum and minimum not in mins):
                        minimum = times[i][0]
                        min_index = i 
                        
            times.pop(min_index)
            mins.append(minimum)
            chair[i2] = {min_index: times[min_index][1]}
        print(mins)
                
                          

               

smallestChair(times=[[3,10],[1,5],[2,6]], targetFriend=0)
                