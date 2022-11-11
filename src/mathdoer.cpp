#include "../include/mathdoer.hpp"

#include <unistd.h>

#include <string>

std::optional<float> doMath(int argc, char *argv[])
{
    float ans = 0.0;
    int arg;

    while ((arg = getopt(argc, argv, "a:b:c:")) != -1)
    {
        switch(arg)
        {
            case 'a':
                ans = 2.0 * std::stof(optarg);
                break;
            case 'b':
                ans = 3.0 * std::stof(optarg);
                break;
            case 'c':
                ans = 4.0 * std::stof(optarg);
                break;
            default:
                return std::nullopt;
                break;
        }
    }

    return ans;
}
