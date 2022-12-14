cmake_minimum_required(VERSION 3.1)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_FLAGS "-Wall -Wpedantic -Werror -O3")

project(jenkins_job_test
        VERSION 1.0.0)

#target_compile_features(jenkins_job_test PRIVATE cxx_std_17)
add_executable(jenkins_job_test src/main.cpp src/mathdoer.cpp include/mathdoer.hpp)
