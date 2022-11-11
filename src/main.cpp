#include <iostream>

#include "../include/mathdoer.hpp"

int main(int argc, char *argv[])
{
    const auto result = doMath(argc, argv);

    if (result)
    {
        std::cout << "The result is: " << result.value() << std::endl;
    }
    else
    {
        return -1;
    }

    return 0;
}
